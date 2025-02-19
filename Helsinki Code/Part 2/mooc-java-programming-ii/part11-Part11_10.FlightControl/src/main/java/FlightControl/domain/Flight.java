/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author ASUS
 */
public class Flight {
    private Airplane pesawat;
    public Place bandaraAwal;
    public Place bandaraTujuan;
    public Flight(Airplane pesawat, Place bandaraAwal, Place bandaraTujuan){
        this.pesawat = pesawat;
        this.bandaraAwal = bandaraAwal;
        this.bandaraTujuan = bandaraTujuan;
    }
    public Airplane getAirplane(){
        return this.pesawat;
    }
    public Place getDeparturePlace(){
        return this.bandaraAwal;
    }
    public Place getTargetPlace(){
        return this.bandaraTujuan;
    }
    @Override
    public String toString(){
        return this.pesawat.toString() + " (" + this.bandaraAwal + "-" + this.bandaraTujuan + ")";
    }
}
