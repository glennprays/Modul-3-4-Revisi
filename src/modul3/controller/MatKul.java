/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.controller;
import modul3.model.*;
import java.util.ArrayList;
/**
 *
 * @author glenn
 */
public class MatKul {
    public double totalNilai(ArrayList<MatkulAmbil> mk, String kodeMK) {
        for (int i = 0; i < mk.size(); i++) {
            if (kodeMK == mk.get(i).getKode()) {
                return mk.get(i).getN1() + mk.get(i).getN2() + mk.get(i).getN3();
            }
        }
        return 0;
    }
    public double rataNilai(double total) {
        return total/3;
    }
    
    public boolean lulusCheck(double nilai) {
        return nilai > 56;
    }
}
