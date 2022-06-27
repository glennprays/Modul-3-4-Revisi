/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;
import java.util.ArrayList;
/**
 *
 * @author glenn
 */
public class MatkulAjar extends Matkul {
    private Matkul matkul = new Matkul();
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();


    public MatkulAjar() {
    }

    public MatkulAjar(String kode, int sks, String nama) {
        super(kode, sks, nama);
    }
    

    public void setPresensiStaff(PresensiStaff presensiStaff) {
        this.presensiStaff.add(presensiStaff);
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar{"+super.toString() + "\npresensiStaff=" + '}';
    }
    
    
}
