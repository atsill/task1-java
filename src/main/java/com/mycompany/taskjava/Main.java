/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskjava;

public class Main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        String fName = "Atsiilah Thufailah";
        String bPlace = "Tangerang";
        String bDate = "9 Agustus 2003";
        String hobby = "Menonton";
        String zodiac = "Leo";
        String favFood = "Nasi Briyani";
        String cita = "Android Developer";
        
        biodata.getFullName(fName);
            System.out.println(biodata.getFullName(fName));
        biodata.getBirthPlace(bPlace);
            System.out.println(biodata.getBirthPlace(bPlace));
        biodata.getBirthDate(bDate);
            System.out.println(biodata.getBirthDate(bDate));
        biodata.getHobi(hobby);
            System.out.println(biodata.getHobi(hobby));
        biodata.getZodiak(zodiac);
            System.out.println(biodata.getZodiak(zodiac));
        biodata.getFavoritFood(favFood);
            System.out.println(biodata.getFavoritFood(favFood));
        biodata.getCitaCita(cita);
            System.out.println(biodata.getCitaCita(cita));
        
        
        
    }
    
}

