package com.mycompany.hibernate.buoi1;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import com.mycompany.hibernate.model.LopHoc;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguyenvv
 */
public class vidu4_delete {

    public static void main(String[] args) {

        LopHoc lopHoc = new LopHoc();
        lopHoc.setMaLop(9);
//        lopHoc.setTenLop("AAA");
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(lopHoc);
            transaction.commit();
        } catch (Exception e) {
        }
    }
}
