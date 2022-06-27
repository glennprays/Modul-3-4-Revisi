/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;

/**
 *
 * @author glenn
 */
public class Magister extends Sarjana{
    private String judulTesis;    

    public Magister(String judulTesis, String NIM, String jurusan, String nama, String alamt, String ttl, String telepon) {
        super(NIM, jurusan, nama, alamt, ttl, telepon);
        this.judulTesis = judulTesis;
    }

    

    @Override
    public String getNIM() {
        return super.getNIM();
    }

    public String getJudulTesis() {
        return judulTesis;
    }


    @Override
    public String toString() {
        String temp = super.toString()+"\nmatkulAmbil=\n";
        return "Magister{" + temp + ", judulTesis=" + judulTesis + '}';
    }
    
    
}
