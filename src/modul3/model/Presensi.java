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
class Presensi {
    private Date tanggal;
    private int Status;//1 = hadir, 0 = alpha

    public Presensi(Date tanggal, int Status) {
        this.tanggal = tanggal;
        this.Status = Status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public int getStatus() {
        return Status;
    }

    @Override
    public String toString() {
        return "Presensi{" + "tanggal=" + tanggal + ", Status=" + Status + '}';
    }
    
    
}
