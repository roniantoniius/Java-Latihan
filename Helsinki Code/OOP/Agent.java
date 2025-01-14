package OOP;

public class Agent {
    private String namaPertama;
    private String namaKedua;

    public Agent(String initialNamaPertama, String initialNamaKedua){
        this.namaPertama = initialNamaPertama;
        this.namaKedua = initialNamaKedua;
    }

    public String toString(){
        return "Nama saya adalah " + this.namaKedua + ", " + this.namaPertama;
    }
}
