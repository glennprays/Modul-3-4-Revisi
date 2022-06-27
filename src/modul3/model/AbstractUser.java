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
public abstract class AbstractUser {
    protected String nama;
    protected String alamt;
    protected String ttl;
    protected String telepon;

    public AbstractUser(String nama, String alamt, String ttl, String telepon) {
        this.nama = nama;
        this.alamt = alamt;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public boolean login(AbstractUser user) {
        if (user instanceof AbstractMahasiswa) {
            
        } else if(user instanceof AbstractStaff) {
            
        }
        return false;
    }
    @Override
    public String toString() {
        return "AbstractUser{" + "nama=" + nama + ", alamt=" + alamt + ", ttl=" + ttl + ", telepon=" + telepon + '}';
    }
    
    
}
