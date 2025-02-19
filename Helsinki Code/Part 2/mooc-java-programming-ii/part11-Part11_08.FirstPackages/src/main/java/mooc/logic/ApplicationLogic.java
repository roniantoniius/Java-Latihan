/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author ASUS
 */

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;
public class ApplicationLogic {
    private UserInterface ui;
    public ApplicationLogic (UserInterface uik){
        this.ui = uik;
    }
    public void execute(int times){
        for (int i = 0; i < times; i++){
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }
}
