/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi1;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import java.util.List;
import com.mycompany.hibernate.model.LopHoc;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class vidu1_getall {

    public static void main(String[] args) {
        // get all lop hoc
        Session session = HibernatUtil.getFACTORY().openSession();
        List<LopHoc> list =(List<LopHoc>) session.createCriteria(LopHoc.class).list();
//        Query query = session.createQuery("From LopHoc ");// truy vấn trên entity(HQL)
//        List<LopHoc> list = query.getResultList();
        
        for (LopHoc lopHoc : list) {
            System.out.println(lopHoc.toString());
        }
    }

}
