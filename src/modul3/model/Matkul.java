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
public class Matkul {
    protected String kode;
    protected int sks;
    protected String nama;

    public Matkul() {
        
    }
    public Matkul(String kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public int getSks() {
        return sks;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "AbstractMataKuliah{" + "kode=" + kode + ", sks=" + sks + ", nama=" + nama + '}';
    }
    
    
}
