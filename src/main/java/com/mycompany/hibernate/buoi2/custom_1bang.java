/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi2;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import com.mycompany.hibernate.model.SinhVienCustom;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class custom_1bang {

    public static void main(String[] args) {
        Session session = HibernatUtil.getFACTORY().openSession();

        Query<SinhVienCustom> query = session.createQuery(
                "select new com.mycompany.hibernate.model.SinhVienCustom("
                        + " s.ten , s.diaChi) "
                + " from com.mycompany.hibernate.model.SinhVien s");
        List<SinhVienCustom> list = query.list();

        for (SinhVienCustom sinhVienCustom : list) {
            System.out.println(sinhVienCustom.toString());
        }
    }

}
