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
public class vidu2_create {

    public static void main(String[] args) {
        
        LopHoc lopHoc = new LopHoc();
        lopHoc.setTenLop("Lop ung dung phan mem");

        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(lopHoc);
            transaction.commit();
        } catch (Exception e) {
        }
    }
}
