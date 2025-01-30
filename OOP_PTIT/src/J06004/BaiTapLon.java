/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LE VAN THO
 */
public class BaiTapLon {

    private static Map<Integer, String> btl = new HashMap<>();

    public static void setBaiTapLon(int soNhom, String baitaplon) {
        BaiTapLon.btl.put(soNhom, baitaplon);
    }

    public static String getBaiTapLon(int soNhom) {
        return btl.get(soNhom);
    }
    
    public BaiTapLon(){
        
    }
}
