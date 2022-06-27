/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.model;

import java.util.Date;

/**
 *
 * @author glenn
 */
public class PresensiStaff extends Presensi{
    private String jam;

    public PresensiStaff(String jam, Date tanggal, int Status) {
        super(tanggal, Status);
        this.jam = jam;
    }

    

    public String getJam() {
        return jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff{"+ super.toString() + "\njam=" + jam + '}';
    }
    
    
}
