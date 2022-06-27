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
public class MatkulPilihan extends Matkul{
    private int minMhs;

    public MatkulPilihan(int jumlahMinimumMahasiswa, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.minMhs = jumlahMinimumMahasiswa;
    }

    public int getJumlahMinimumMahasiswa() {
        return minMhs;
    }

    @Override
    public String toString() {
        return "MatkulPilihan{"+super.toString() + "\njumlahMinimumMahasiswa=" + minMhs + '}';
    }
    
}
