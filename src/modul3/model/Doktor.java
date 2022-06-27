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
public class Doktor extends AbstractMahasiswa {

    private String judulDisertasi;
    private float nSidang1, nSidang2, nSidang3;

    public Doktor(String judulDisertasi, float nSidang1, float nSidang2, float nSidang3, String NIM, String jurusan, String nama, String alamt, String ttl, String telepon) {
        super(NIM, jurusan, nama, alamt, ttl, telepon);
        this.judulDisertasi = judulDisertasi;
        this.nSidang1 = nSidang1;
        this.nSidang2 = nSidang2;
        this.nSidang3 = nSidang3;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public double getnSidang1() {
        return nSidang1;
    }

    public double getnSidang2() {
        return nSidang2;
    }

    public double getnSidang3() {
        return nSidang3;
    }
    
    @Override
    public String toString() {
        String temp = super.toString();
        return "Doktor{" + temp + " judulDisertasi=" + judulDisertasi + ", nSidang1=" + nSidang1 + ", nSidang2=" + nSidang2 + ", nSidang3=" + nSidang3 + '}';
    }

}
