package com.mycompany.bangundatar;

public class Lingkaran extends BangunDatar {
    int r;
    
    public Lingkaran(int r){
        this.r = r;
    }
    
    @Override
    public double luas(){
        return Math.PI * this.r * this.r;
    }
    
    @Override
    public double keliling(){
        return Math.PI * this.r * 2;
    }
}
