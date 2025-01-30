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

public class QuanLyMonHoc extends JFrame {
    private JTextField tfTenMon, tfSoDVHT;
    private JComboBox<String> cbLoaiMon;
    private JButton btnLuu, btnHienThi;
    private static ArrayList<MonHoc> danhSachMonHoc;

    public QuanLyMonHoc() {
        setTitle("Quản lý Môn học");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        // Tạo danh sách môn học
        danhSachMonHoc = new ArrayList<>();

        // Tạo các thành phần giao diện
        add(new JLabel("Tên môn học:"));
        tfTenMon = new JTextField();
        add(tfTenMon);

        add(new JLabel("Số đơn vị học trình:"));
        tfSoDVHT = new JTextField();
        add(tfSoDVHT);

        add(new JLabel("Loại môn học:"));
        cbLoaiMon = new JComboBox<>(new String[]{"Đại cương", "Cơ sở ngành", "Chuyên ngành"});
        add(cbLoaiMon);

        btnLuu = new JButton("Lưu");
        btnHienThi = new JButton("Hiển thị danh sách");
        add(btnLuu);
        add(btnHienThi);

        // Xử lý sự kiện khi nhấn nút Lưu
        btnLuu.addActionListener(e -> luuMonHoc());

        // Xử lý sự kiện khi nhấn nút Hiển thị
        btnHienThi.addActionListener(e -> hienThiDanhSach());

        setVisible(true);
    }

    // Hàm lưu môn học vào file
    private void luuMonHoc() {
        String tenMon = tfTenMon.getText();
        String soDVHTStr = tfSoDVHT.getText();
        String loaiMon = (String) cbLoaiMon.getSelectedItem();

        // Kiểm tra nhập liệu
        if (tenMon.isEmpty() || soDVHTStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int soDVHT = Integer.parseInt(soDVHTStr);
            if (soDVHT <= 0) {
                JOptionPane.showMessageDialog(this, "Số đơn vị học trình phải lớn hơn 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tạo đối tượng MonHoc
            MonHoc mh = new MonHoc(tenMon, soDVHT, loaiMon);
            danhSachMonHoc.add(mh);

            // Ghi vào file
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MONHOC.txt"))) {
                oos.writeObject(danhSachMonHoc);
                JOptionPane.showMessageDialog(this, "Lưu môn học thành công!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số đơn vị học trình phải là số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Hàm hiển thị danh sách môn học từ file
    private void hienThiDanhSach() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MONHOC.txt"))) {
            danhSachMonHoc = (ArrayList<MonHoc>) ois.readObject();
            StringBuilder danhSach = new StringBuilder("Danh sách môn học:\n");
            for (MonHoc mh : danhSachMonHoc) {
                danhSach.append(mh.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(this, danhSach.toString(), "Danh sách môn học", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi đọc dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new QuanLyMonHoc();
    }
}
