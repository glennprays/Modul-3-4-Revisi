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
public class DosenTetap extends AbstractDosen{
    private double salary;

    public DosenTetap(double salary, String departemen, String NIK, String nama, String alamt, String ttl, String telepon) {
        super(departemen, NIK, nama, alamt, ttl, telepon);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

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
        return "DosenTetap{"+ super.toString() + "\nsalary=" + salary + '}';
    }
    
    
}
