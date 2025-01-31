/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author ron
 */

import java.util.Scanner;

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container = new Container();
        Container containerTwo = new Container();


        while (true) {
            System.out.println("First: " + container);
            System.out.println("Second: " + containerTwo);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			
            if (command.equals("add")) {
            	container.add(amount);
            }
            
            if (command.equals("remove")) {
            	containerTwo.remove(amount);
            } 
            
            if (command.equals("move")) {
            if (amount >= container.contains()) {
            		containerTwo.add(container.contains());
            		container.remove(container.contains());
            		
            	} else {
            	container.remove(amount);
            	containerTwo.add(amount);
            	}
            	
            }

        }
    }

}