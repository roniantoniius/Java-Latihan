package OOP;

public class Statistics {
    private int jumlah;
    private int sum;

    public Statistics(){
        this.jumlah = 0;
        this.sum = 0;
    }

    public int tambah(int jumlah){
        this.jumlah = this.jumlah + (jumlah - jumlah + 1);
        this.sum = this.sum + jumlah;
        return this.jumlah;
    }

    public int getCount(){
        return this.jumlah;
    }

    public int jumlahKan(){
        return this.sum;
    }

    public int rataRata(){
        if (this.jumlah == 0){
            return 0;
        } else {
            return this.sum / this.jumlah;
        }
    }
}
