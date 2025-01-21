package OOP_6;

public class UsePresent {
    public static void main(String[] args){
        Gift botolMinum = new Gift("Botol Minum Plastik", 0.4);
        Gift tempatMakan = new Gift("Bento XL", 1.1);
        Gift gingerBread = new Gift("Kue Jahe", 2.0);

        System.out.println("Hadiah pertama adalah " + botolMinum.getName());
        System.out.print(" Dengan bobot " + botolMinum.getWeight());

        Package misteriBox = new Package();
        misteriBox.addGift(botolMinum);
        misteriBox.addGift(gingerBread);
        misteriBox.addGift(tempatMakan);

        System.out.println("Hadiah: " + botolMinum);
    }
}
