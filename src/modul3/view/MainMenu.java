/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.view;

import modul3.controller.*;
/**
 *
 * @author glenn
 */
public class MainMenu {

    JOption jo = new JOption();
    User user = new User();
    
    public void showMenu() {
        MenuSwitch menu = new MenuSwitch();
        String menuOption
                = "1. Print UserData\n"
                + "2. Print nilai akhir mahasiswaw\n"
                + "3. Print rata-rata nilai akhir seluruh mahasiswa\n"
                + "4. Print banyak mahasiswa tidak lulus MK\n"
                + "5. Print MK mahasiswa\n"
                + "6. Print jam dosen\n"
                + "7. Print gaji staff\n"
                + "0. exit";
        int menuNum = 1;
        while (menuNum != 0) {
            menuNum = Integer.parseInt(jo.inputJO(menuOption));
            menu.menuSwitch(menuNum);
        }
    }
    
    public void printUserData() {
        String nama = jo.inputJO("masukan nama");
        jo.showJO(user.statusCheck(nama));
    }
    
    public void nilaiAkhirMhs() {
        String nim = jo.inputJO("masukan NIM");
        String kodeMK = jo.inputJO("masukan kode MK");
        jo.showJO(user.nilaiCheck(nim, kodeMK));
    }
    
    public void rataSeluruhMhs() {
        jo.showJO(user.rataSeluruh());
    }
    
    public void tidakLulusMK() {
        String kodeMK = jo.inputJO("input kode MK");
        jo.showJO("<"+user.tidakLulusMK(kodeMK)+"> dari <"+user.banyakMhs()+"> mahasiswa tidak lulus matakuliah "+kodeMK);
    }
    
    public void matkulPresensi() {
        String nim = jo.inputJO("input NIM");
        jo.showJO(user.matkulAmbil(nim));
    }
    
    public void jamDosen() {
        String nik = jo.inputJO("input NIK dosen");
        jo.showJO(user.jamDosenCounter(nik));
    }
    
    public void gajiStaff() {
        String nik = jo.inputJO("input NIK");
        jo.showJO(user.gajiStaff(nik));
    }
}
