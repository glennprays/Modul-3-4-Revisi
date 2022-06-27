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
public abstract class AbstractStaff extends AbstractUser {
    private String NIK;

    public AbstractStaff(String NIK, String nama, String alamt, String ttl, String telepon) {
        super(nama, alamt, ttl, telepon);
        this.NIK = NIK;
    }

    

    @Override
    public String toString() {
        return "AbstractStaff{" + super.toString()+ "\nNIK=" + NIK + '}';
    }

    public String getNIK() {
        return NIK;
    }
    
}
