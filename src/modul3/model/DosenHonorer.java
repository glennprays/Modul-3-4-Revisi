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
public class DosenHonorer extends AbstractDosen {

    private double honorPerSks;

    public DosenHonorer(double honorPerSks, String departemen, String NIK, String nama, String alamt, String ttl, String telepon) {
        super(departemen, NIK, nama, alamt, ttl, telepon);
        this.honorPerSks = honorPerSks;
    }

    public double getHonorPerSks() {
        return honorPerSks;
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
        return "Honorer{" + super.toString() + "\nhonorPerSks=" + honorPerSks + '}';
    }

}
