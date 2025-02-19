/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

import FlightControl.logic.FlightControl;
public class TextUI {
    private Scanner scanner;
    private FlightControl kijang1;
    public TextUI(FlightControl kijang1, Scanner scanner){
        this.kijang1 = kijang1;
        this.scanner = scanner;
    }
    public void start(){
        mulaiKontrolAset();
        System.out.println();
        mulaiKontrolPenerbangan();
        System.out.println();
    }
    public void mulaiKontrolAset(){
        System.out.println("Part 1: Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String jawab = scanner.nextLine();

            if (jawab.equals("1")) {
                tambahPesawat();
            } else if (jawab.equals("2")) {
                tambahPenerbangan();
            } else if (jawab.equals("x")) {
                break;
            }
        }
    }
    public void tambahPesawat(){
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int kapasitas = scanner.nextInt();
        this.kijang1.addAirplane(id, kapasitas);
    }
    public void tambahPenerbangan(){
        System.out.println("Give the airplane id: ");
        Airplane pesawat = nanyaPesawat();
        System.out.println("Give the departure airport id: ");
        String awal = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String akhir = scanner.nextLine();
        this.kijang1.addFlight(pesawat, awal, akhir);
    }
    public void mulaiKontrolPenerbangan(){
        System.out.println("Part 2: Flight Control");
        System.out.println("-----------------------------");
        System.out.println();
        
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.println("> ");
            String jawaban = scanner.nextLine();
            if (jawaban.equals("1")){
                printPesawat();
            } else if (jawaban.equals("2")){
                printPenerbangan();
            } else if (jawaban.equals("3")){
                printDetailPesawat();
            } else if (jawaban.equals("x")){
                break;
            }
        }
    }
    public void printPesawat(){
        for (Airplane pesawat: this.kijang1.getAirplanes()){
            System.out.println(pesawat);
        }
    }
    public void printPenerbangan(){
        for (Flight arah: this.kijang1.getFlights()){
            System.out.println(arah);
            System.out.println("");
        }
    }
    public void printDetailPesawat(){
        System.out.println("Give the airplane id:");
        Airplane pesawat = nanyaPesawat();
        System.out.println(pesawat);
        System.out.println();
    }
    public Airplane nanyaPesawat(){
        Airplane pesawat = null;
        while (pesawat == null){
            String id = scanner.nextLine();
            pesawat = this.kijang1.getAirplane(id);
            if (pesawat == null){
                System.out.println("No airplane with the id " + id + ".");
            }
        }
        return pesawat;
    }
}
