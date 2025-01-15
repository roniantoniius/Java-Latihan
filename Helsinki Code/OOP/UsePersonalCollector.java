package OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class UsePersonalCollector {
    public static void main(String[] args){
        ArrayList<PersonalInformationCollector> personInfo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Masukkan nama depan: ");
            String firstName = scanner.nextLine();
            System.out.println("Masukkan nama belakang: ");
            String lastName = scanner.nextLine();
            System.out.println("Masukkan ID: ");
            int idNumber = scanner.nextInt();
            if (firstName.isEmpty() || lastName.isEmpty()){
                break;
            }

            personInfo.add(new PersonalInformationCollector(firstName, lastName, idNumber));
        }
        System.out.println();
        System.out.println("Jumlah orang adalah " + personInfo.size());
        System.out.println("Yang terdiri dari ");
        for (PersonalInformationCollector person: personInfo){
            System.out.println(person);
        }
        scanner.close();
    }
}
