package com.mycompany.bangundatar;

public class segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    public segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas(){
    return this.alas*this.tinggi*1/2;
    }
            
            
            
}
