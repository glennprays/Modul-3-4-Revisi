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
public class Karyawan extends AbstractStaff{
    private double salary;
    private ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();

    public Karyawan(double salary, String NIK, String nama, String alamt, String ttl, String telepon) {
        super(NIK, nama, alamt, ttl, telepon);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }
    
    public void setPresensiStaff(PresensiStaff presensi) {
        this.presensiStaff.add(presensi);    }

    public String getNama() {
        return nama;
    }

    public String getAlamt() {
        return alamt;
    }

    public String getTtl() {
        return ttl;
    }

    public String getTelepon() {
        return telepon;
    }

    

    @Override
    public String toString() {
        return "Karyawan{" +super.toString()+ "\nsalary=" + salary + ", presensiStaff=" + presensiStaff + '}';
    }
    
    
    
}
