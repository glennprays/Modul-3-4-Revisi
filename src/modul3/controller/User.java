/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.controller;

import modul3.model.*;
import modul3.view.JOption;

/**
 *
 * @author glenn
 */
public class User {

    UserData userData = new UserData();
    JOption jo = new JOption();
    MatKul MK = new MatKul();

    public String statusCheck(String nama) {
        String status = "";
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            if (userData.getSarjanaList().get(i).getNama().equals(nama)) {
                return "Mahasiswa";
            }
        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            if (userData.getMagisterList().get(i).getNama().equals(nama)) {
                return "Mahasiswa";
            }
        }
        for (int i = 0; i < userData.getDoktorList().size(); i++) {
            if (userData.getDoktorList().get(i).getNama().equals(nama)) {
                return "Mahasiswa";
            }
        }
        for (int i = 0; i < userData.getDosenTetapList().size(); i++) {
            if (userData.getDosenTetapList().get(i).getNama().equals(nama)) {
                return "Dosen Tetap";
            }
        }
        for (int i = 0; i < userData.getHonorerList().size(); i++) {
            if (userData.getHonorerList().get(i).getNama().equals(nama)) {
                return "Honorer";
            }
        }
        for (int i = 0; i < userData.getKaryawanList().size(); i++) {
            if (userData.getKaryawanList().get(i).getNama().equals(nama)) {
                return "Honorer";
            }
        }
        return "tidak ditemukan!";
    }
    
    public String nilaiCheck(String nim, String kodeMK){
        double total = 0;
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            if (userData.getSarjanaList().get(i).getNIM().equals(nim)) {
                total = MK.totalNilai(userData.getSarjanaList().get(i).getMatkulAmbil(), kodeMK);
                total = MK.rataNilai(total);
                return Double.toString(total);
            }
        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            if (userData.getMagisterList().get(i).getNIM().equals(nim)) {
                total = MK.totalNilai(userData.getMagisterList().get(i).getMatkulAmbil(), kodeMK);
                total = MK.rataNilai(total);
                return Double.toString(total);
            }
        }
        for (int i = 0; i < userData.getDoktorList().size(); i++) {
            if (userData.getDoktorList().get(i).getNIM().equals(nim)) {
                Doktor doktor = userData.getDoktorList().get(i);
                total = doktor.getnSidang1() + doktor.getnSidang2() + doktor.getnSidang3();
                total = MK.rataNilai(total);
                return Double.toString(total);
            }
        }
        return "nim tidak ditemukan";
    }

    public String rataSeluruh() {
        double total = 0;
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            
            for (int j = 0; j < userData.getSarjanaList().get(j).getMatkulAmbil().size(); j++) {
                total += MK.totalNilai(userData.getSarjanaList().get(j).getMatkulAmbil(), userData.getSarjanaList().get(j).getMatkulAmbil().get(j).getKode());
            }
        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            
            for (int j = 0; j < userData.getMagisterList().get(i).getMatkulAmbil().size(); j++) {
                total += MK.totalNilai(userData.getMagisterList().get(i).getMatkulAmbil(), userData.getMagisterList().get(i).getMatkulAmbil().get(j).getKode());
            }
        }
        for (int i = 0; i < userData.getDoktorList().size(); i++) {
            
            Doktor doktor = userData.getDoktorList().get(i);
            total += doktor.getnSidang1() + doktor.getnSidang2() + doktor.getnSidang3();
        }
        total = MK.rataNilai(total);
        return Double.toString(total);
    }

    public int tidakLulusMK(String kodeMK) {
        int counterMhs = 0;
        int counterTidakLulus = 0;
        double tempNilaiRata = 0;
        for (int i = 0; i < userData.getSarjanaList().size(); i++) {
            
            tempNilaiRata = MK.rataNilai(MK.totalNilai(userData.getSarjanaList().get(i).getMatkulAmbil(), kodeMK));
            //untuk counter semua sarjana
            if (!MK.lulusCheck(tempNilaiRata)) {
                counterTidakLulus++;
            }
        }
        for (int i = 0; i < userData.getMagisterList().size(); i++) {
            
            tempNilaiRata = MK.rataNilai(MK.totalNilai(userData.getMagisterList().get(i).getMatkulAmbil(), kodeMK));
            //untuk counter semua magister
            if (!MK.lulusCheck(tempNilaiRata)) {
                counterTidakLulus++;
            }
        }
        for (int i = 0; i < userData.getDoktorList().size(); i++) {
            
            Doktor doktor = userData.getDoktorList().get(i);
            tempNilaiRata = MK.rataNilai(doktor.getnSidang1() + doktor.getnSidang2() + doktor.getnSidang3());
            //untuk counter semua doktor
            if (!MK.lulusCheck(tempNilaiRata)) {
                counterTidakLulus++;
            }
        }
        return counterTidakLulus;
    }

    public int banyakMhs() {
        int total = userData.getSarjanaList().size()+userData.getMagisterList().size()+userData.getDoktorList().size();
        return total;
    }

    public String matkulAmbil(String nim) {
        String list = "";
        if (userData.getSarjana().getNIM().equals(nim)) {
            Sarjana sarjana = userData.getSarjana();
            for (int i = 0; i < sarjana.getMatkulAmbil().length; i++) {
                int counter = 0;
                for (int j = 0; j < sarjana.getMatkulAmbil()[i].getPresensiLength(); j++) {
//                    if (sarjana.getMatkulAmbil()[i].getPresensi()[j].getStatus() == 1) {
//                        counter++;
//                    }
                }
                list += (i + 1) + ". " + sarjana.getMatkulAmbil()[i].getNama() + " hadir: " + counter + "\n";
            }
        } else if (userData.getMagister().getNIM().equals(nim)) {
            Magister magister = userData.getMagister();
            for (int i = 0; i < magister.getMatkulAmbil().length; i++) {
                int counter = 0;
                for (int j = 0; j < magister.getMatkulAmbil()[i].getPresensiLength(); j++) {
//                    if (magister.getMatkulAmbil()[i].getPresensi()[j].getStatus() == 1) {
//                        counter++;
//                    }
                }
                list += (i + 1) + ". " + magister.getMatkulAmbil()[i].getNama() + " hadir: " + counter + "\n";
            }
        } else {
            return "nim tidak ditemukan";
        }
        return list;
    }

    public String jamDosenCounter(String nik) {
        int jam = -0;
        DosenTetap dosen = userData.getDosenTetapList();
        DosenHonorer honor = userData.getHonorerList();
        if (dosen.getNIK().equals(nik)) {

        } else if (honor.getNIK().equals(nik)) {

        } else {
            return "dosen tidak ditemukan!";
        }
        return Integer.toString(jam);
    }

    public String gajiStaff(String nik) {
        double gaji = 0;
        int unit = 0;
        DosenTetap dosen = userData.getDosenTetap();
        DosenHonorer honor = userData.getHonorer();
        Karyawan karyawan = userData.getKaryawan();
        if (dosen.getNIK().equals(nik)) {
            gaji = dosen.getSalary() + (unit * 25000);
        } else if (honor.getNIK().equals(nik)) {
            gaji = unit * honor.getHonorPerSks();
        } else if (karyawan.getNIK().equals(nik)) {
            gaji = unit / 22 * karyawan.getSalary();
        } else {
            return "staff tidak ditemukan!";
        }
        return Double.toString(gaji);
    }
}
