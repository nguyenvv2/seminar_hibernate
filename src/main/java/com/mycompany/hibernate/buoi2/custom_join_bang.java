/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi2;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import java.util.List;
import com.mycompany.hibernate.model.LopHocCustom;
import com.mycompany.hibernate.model.SinhVien;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class custom_join_bang {

    public static void main(String[] args) {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query query = session.createQuery("select "
                + " new com.mycompany.hibernate.model.LopHocCustom("
                + " m.lopHoc.tenLop as tenLop,"
                + " m.ten as tenSinhVien , "
                + " m.diaChi as diaChi) "
                + " from com.mycompany.hibernate.model.SinhVien m");
        List<LopHocCustom> result = query.list();
        
        for (LopHocCustom lopHocCustom : result) {
            System.out.println(lopHocCustom.toString());
        }
    }
}
