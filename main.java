package com.mycompany.bangundatar;

public class main {
    public static void main(String[] args) {
        
        BangunDatar bangundatar = new BangunDatar();
        persegi persegi = new persegi(5);
        segitiga segitiga = new segitiga(5,10);
        Lingkaran lingkaran = new Lingkaran(7);
        
        bangundatar.luas();
        bangundatar.keliling();
        System.out.println("--------------------");
        
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("----------------------------");
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println("---------------------------");
        System.out.println("Luas segitiga : " + segitiga.luas());
        System.out.println("-----------------------------");
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("-----------------------------");
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        
        
        
    }
}
