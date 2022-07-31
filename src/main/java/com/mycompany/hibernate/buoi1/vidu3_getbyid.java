/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate.buoi1;

import com.mycompany.hibernate.hibernateDemo.HibernatUtil;
import com.mycompany.hibernate.model.LopHoc;
import org.hibernate.Session;

/**
 *
 * @author nguyenvv
 */
public class vidu3_getbyid {

    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            lopHoc = session.get(LopHoc.class, 3);
        } catch (Exception e) {
        }
        System.out.println(lopHoc.toString());
    }

}
