/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author A
 */
import controller.DoctorManagement;
import model.Doctor;

public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        
        new DoctorManagement(doctor).run();
    }
    
}