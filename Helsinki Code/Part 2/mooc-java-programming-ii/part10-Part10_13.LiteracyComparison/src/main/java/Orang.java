/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Orang implements Comparable<Orang> {
    private String jenisKelamin;
    private String negara;
    private int tahun;
    private double persen;
    public Orang(String jenisKelamin, String negara, int tahun, double persen){
        this.jenisKelamin = jenisKelamin;
        this.negara = negara;
        this.tahun = tahun;
        this.persen = persen;
    }
    public String getJk(){
        return this.jenisKelamin;
    }
    public String getNegara(){
        return this.negara;
    }
    public int getTahun(){
        return this.tahun;
    }
    public double getPersen(){
        return this.persen;
    }
    @Override
    public String toString(){
        return getNegara() + " (" + getTahun() + "), " + getJk() + ", " + getPersen();
    }
    @Override
    public int compareTo(Orang orang){
        // ambil persentase literasi sekarang dan objek
        int persenSekarang = (int) (this.persen * 100000);
        int persenObjek = (int) (orang.getPersen() * 100000);
        return persenSekarang - persenObjek;
    }
}
