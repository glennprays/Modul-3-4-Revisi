/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3.view;
import javax.swing.JOptionPane;
/**
 *
 * @author glenn
 */
public class JOption {
    public void showJO(String string) {
        JOptionPane.showMessageDialog(null, string);
    }
    public String inputJO(String string) {
        String input = JOptionPane.showInputDialog(null, string);
        return input;
    }
}
