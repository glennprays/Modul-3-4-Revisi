/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.controller;
import modul3.view.MainMenu;
/**
 *
 * @author glenn
 */
public class MenuSwitch {
    
    MainMenu mainMenu = new MainMenu();
    public void menuSwitch(int menu) {
        switch (menu) {
            case 0:
                System.out.println("program keluar");
                break;
            case 1:
                mainMenu.printUserData();
                break;
            case 2:
                mainMenu.nilaiAkhirMhs();
                break;
            case 3:
                mainMenu.rataSeluruhMhs();
                break;
            case 4:
                mainMenu.tidakLulusMK();
                break;
            case 5:
                mainMenu.matkulPresensi();
                break;
            case 6:
                mainMenu.jamDosen();
                break;
            case 7:
                mainMenu.gajiStaff();
                break;
            default:
                System.out.println("input salah!");
        }
    }
}
