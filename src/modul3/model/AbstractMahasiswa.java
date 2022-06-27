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
public abstract class AbstractMahasiswa extends AbstractUser {
    protected String NIM;
    protected String jurusan;

    public AbstractMahasiswa(String NIM, String jurusan, String nama, String alamt, String ttl, String telepon) {
        super(nama, alamt, ttl, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public String getJurusan() {
        return jurusan;
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

    

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "AbstractMahasiswa{" +super.toString()+ "\nNIM=" + NIM + ", jurusan=" + jurusan + '}';
    }
    
}
