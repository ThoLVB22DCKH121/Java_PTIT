/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhbuoi3;

/**
 *
 * @author LE VAN THO
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class QuanLySinhVien extends JFrame {
    private JTextField tfHoTen, tfDiaChi, tfNgaySinh;
    private JComboBox<String> cbLop;
    private JButton btnLuu, btnHienThi;
    private static ArrayList<SinhVien> danhSachSinhVien;

    public QuanLySinhVien() {
        setTitle("Quản lý Sinh viên");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 5, 5));

        // Tạo danh sách sinh viên
        danhSachSinhVien = new ArrayList<>();

        // Tạo các thành phần giao diện
        add(new JLabel("Họ tên:"));
        tfHoTen = new JTextField();
        add(tfHoTen);

        add(new JLabel("Địa chỉ:"));
        tfDiaChi = new JTextField();
        add(tfDiaChi);

        add(new JLabel("Ngày sinh (dd/MM/yyyy):"));
        tfNgaySinh = new JTextField();
        add(tfNgaySinh);

        add(new JLabel("Lớp:"));
        cbLop = new JComboBox<>(new String[]{"D22CQKH01B"});
        add(cbLop);

        btnLuu = new JButton("Lưu");
        btnHienThi = new JButton("Hiển thị danh sách");
        add(btnLuu);
        add(btnHienThi);

        // Xử lý sự kiện khi nhấn nút Lưu
        btnLuu.addActionListener(e -> luuSinhVien());

        // Xử lý sự kiện khi nhấn nút Hiển thị
        btnHienThi.addActionListener(e -> hienThiDanhSach());

        setVisible(true);
    }

    // Hàm lưu sinh viên vào file
    private void luuSinhVien() {
        String hoTen = tfHoTen.getText();
        String diaChi = tfDiaChi.getText();
        String ngaySinh = tfNgaySinh.getText();
        String lop = (String) cbLop.getSelectedItem();

        if (hoTen.isEmpty() || diaChi.isEmpty() || ngaySinh.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tạo đối tượng SinhVien
        SinhVien sv = new SinhVien(hoTen, diaChi, ngaySinh, lop);
        danhSachSinhVien.add(sv);

        // Ghi vào file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SV.txt"))) {
            oos.writeObject(danhSachSinhVien);
            JOptionPane.showMessageDialog(this, "Lưu sinh viên thành công!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Hàm hiển thị danh sách sinh viên từ file
    private void hienThiDanhSach() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.txt"))) {
            danhSachSinhVien = (ArrayList<SinhVien>) ois.readObject();
            StringBuilder danhSach = new StringBuilder("Danh sách sinh viên:\n");
            for (SinhVien sv : danhSachSinhVien) {
                danhSach.append(sv.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, danhSach.toString(), "Danh sách sinh viên", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi đọc dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new QuanLySinhVien();
    }
}
