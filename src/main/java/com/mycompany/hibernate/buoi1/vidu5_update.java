/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi1;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import com.mycompany.hibernate.model.LopHoc;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class vidu5_update {

    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
//            Query query = session.createQuery("update LopHoc set tenLop = :tenLop"
//                    + " where maLop = :maLop");
//            query.setParameter("tenLop", "Lop update123");
//            query.setParameter("maLop", 113);
//            query.executeUpdate();
            
            LopHoc lopHoc = new LopHoc(113, "tenLop");
            session.saveOrUpdate(lopHoc);
            transaction.commit();
        }
    }
}
