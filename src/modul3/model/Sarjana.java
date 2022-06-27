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
public class Sarjana extends AbstractMahasiswa {

    protected ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();

    public Sarjana(String NIM, String jurusan, String nama, String alamt, String ttl, String telepon) {
        super(NIM, jurusan, nama, alamt, ttl, telepon);
    }

    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return this.matkulAmbil;
    }

    public void setMatkulAmbil(MatkulAmbil matkulAmbil) {
        this.matkulAmbil.add(matkulAmbil);
    }

    @Override
    public String toString() {
        String temp = super.toString() + "\n";
        for (MatkulAmbil matkulAmbil1 : this.matkulAmbil) {
            temp += this.matkulAmbil.toString() + "\n";
        }
        return temp;
    }

}
