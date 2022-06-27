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
public class UserData {
    ArrayList<Sarjana> sarjanaList = new ArrayList<>();
    ArrayList<Magister> magisterList = new ArrayList<>();
    ArrayList<Doktor> doktorList = new ArrayList<>();
    ArrayList<Karyawan> karyawanList = new ArrayList<>();
    ArrayList<DosenTetap> dosenTetapList = new ArrayList<>();
    ArrayList<DosenHonorer> honorerList = new ArrayList<>();
    

    public void main(String[] args) {
    Sarjana sarjana = new Sarjana("1121058", "Informatika", "Glenn", "Bandung no. 7", "Jakarta, 1 Januari 2002", "08123456789");
        Magister magister = new Magister("Ini Judul Tesis", "112233", "Manajemen", "Budi", "Bekasi No. 1", "Medan, 3 Juni 2000", "087654321");
        Doktor doktor = new Doktor("Ini Judul Disertasi", 80, 85, 76, "113322", "SCM", "Andi", "Jakarta No. 2", "Bengkulu, 10 Juli 1998", "0811223344");
        Karyawan karyawan = new Karyawan(2000000, "331122", "Andini", "Sukabumi No 3", "Badung, 11 April 1996", "0812345");
        DosenTetap dosenTetap = new DosenTetap(3500000, "Informatika", "554433", "Jonatan", "Bandung No 4", "Batam, 1 Januari 1990", "08123456");
        DosenHonorer honorer = new DosenHonorer(500000, "Informatika", "665544", "Dira", "Ciamis No. 5", "Palu, 4 Mei 2000", "081234567");
        sarjanaList.add(sarjana);
        magisterList.add(magister);
        doktorList.add(doktor);
        karyawanList.add(karyawan);
        dosenTetapList.add(dosenTetap);
        honorerList.add(honorer);
    }

    public ArrayList<Sarjana> getSarjanaList() {
        return sarjanaList;
    }

    public ArrayList<Magister> getMagisterList() {
        return magisterList;
    }

    public ArrayList<Doktor> getDoktorList() {
        return doktorList;
    }

    public ArrayList<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public ArrayList<DosenTetap> getDosenTetapList() {
        return dosenTetapList;
    }

    public ArrayList<DosenHonorer> getHonorerList() {
        return honorerList;
    }
    
    
}
