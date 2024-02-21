package com.mycompany.bangundatar;

public class persegi extends BangunDatar {
    int sisi;
    
    public persegi(int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        return this.sisi * this.sisi;
    }
    
    @Override
    public double keliling(){
        return this.sisi *4;
    }
}
