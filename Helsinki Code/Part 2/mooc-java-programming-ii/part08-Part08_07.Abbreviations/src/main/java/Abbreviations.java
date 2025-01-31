/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> daftarSingkatan;
    public Abbreviations(){
        this.daftarSingkatan = new HashMap<>();
    }
    public void addAbbreviation(String apaya, String penjelasanWoii){
        String apaya2 = sanitizedString(apaya);
        String penjelasan = sanitizedString(penjelasanWoii);
        this.daftarSingkatan.put(apaya2, penjelasan);
    }
    public boolean hasAbbreviation(String abbreviation){
        String cek = sanitizedString(abbreviation);
        return this.daftarSingkatan.containsKey(cek);
    }
    public String findExplanationFor(String carii){
        String cekLagi = sanitizedString(carii);
        if (cekLagi.isEmpty()){
            return null;
        }
        return daftarSingkatan.get(cekLagi);
    }
    public String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
