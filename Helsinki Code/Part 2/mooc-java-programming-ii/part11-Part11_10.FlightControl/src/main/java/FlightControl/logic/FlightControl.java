/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author ASUS
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
public class FlightControl {
    private HashMap<String, Airplane> pesawats = new HashMap<>();
    private HashMap<String, Flight> penerbangans = new HashMap<>();
    private Map<String, Place> lokasis;
    public FlightControl(){
        this.pesawats = new HashMap<>();
        this.penerbangans = new HashMap<>();
        this.lokasis = new HashMap<>();
    }
    public void addAirplane(String ID, int capacity){
        Airplane pesawat = new Airplane(ID, capacity);
        this.pesawats.put(ID, pesawat);
    }
    public void addFlight(Airplane pesawat, String idAwal, String idAkhir){
        this.lokasis.putIfAbsent(idAwal, new Place(idAwal));
        this.lokasis.putIfAbsent(idAkhir, new Place(idAkhir));
        Flight penerbangan = new Flight(pesawat, this.lokasis.get(idAwal), this.lokasis.get(idAkhir));
        this.penerbangans.put(penerbangan.toString(), penerbangan);
    }
    public Airplane getAirplane(String id){
        return this.pesawats.get(id);
    }
    public Collection<Airplane> getAirplanes(){
        return this.pesawats.values();
    }
    public Collection<Flight> getFlights(){
        return this.penerbangans.values();
    }
}
