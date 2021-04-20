/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonst_in_thesystem;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

/**
 *
 * @author CxrlosMX
 */
public class Fonst_In_TheSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ALL code application logic here
        int op = 0;
        String n = "";
        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n1.-Search a Font\n2.-Exit", "Menu", 3));

            switch (op) {

                case 1: {
                    String f = JOptionPane.showInputDialog(null, "Please, enter the font", "Introducing", JOptionPane.INFORMATION_MESSAGE);
                    boolean find = false;
                    int i = 1;
                    for (String getFont : fonts) {
                        if (f.equals(getFont)) {
                            n = getFont;
                            find = true;
                        }
                        i++;
                    }
                    if (find) {
                        System.out.println("Font number= " + i + ", Name: " + n);
                    } else {
                        System.out.println("The font is'nt in the System");
                    }
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Closing...", "Closing", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        } while (op != 2);
    }

}
