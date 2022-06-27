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
public abstract class AbstractDosen extends AbstractStaff {
    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();

    public AbstractDosen(String departemen, String NIK, String nama, String alamt, String ttl, String telepon) {
        super(NIK, nama, alamt, ttl, telepon);
        this.departemen = departemen;
    }
    
    public void setMatkulAjar(MatkulAjar matkulAjar) {
        this.matkulAjar.add(matkulAjar);
    }

    public String getDepartemen() {
        return departemen;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    
    

    @Override
    public String toString() {
        
        return "AbstractDosen{"+ super.toString() + "\ndepartemen=" + departemen + ", matkulAjar=" +  '}';
    }
    
    
}
