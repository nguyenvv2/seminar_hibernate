/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi2;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import java.util.List;
import com.mycompany.hibernate.model.SinhVien;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class vidu_manytoone {

    public static void main(String[] args) {

        Session session = HibernatUtil.getFACTORY().openSession();

        Query q = session.createQuery("From SinhVien");// truy vấn trên entity(HQL)
        List<SinhVien> list = q.getResultList();

        for (SinhVien sinhVien : list) {
            System.out.println("Ten SV : " + sinhVien.getTen()
                    + "-" + sinhVien.getLopHoc().getTenLop()
            );

        }
    }
}
