
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int baris = 0;
        int kolom = square.getHeight() / 2;
        int nilai = 1;
        while (nilai <= size * size){
            square.placeValue(kolom, baris, nilai);
            nilai++;
            
            // baris baru
            int barisBaru = (baris - 1 + size) % size;
            int kolomBaru = (kolom + 1) % size;
            
            // syarat untuk pengurangan baris < 0 atau > getHeight
            if (square.readValue(kolomBaru, barisBaru) != 0){ // ada isi
                baris = (baris + 1) % size;
            } else { // ngga ada isi
                baris = barisBaru;
                kolom = kolomBaru;
            }
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }

}
