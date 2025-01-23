package OOP_6;

import java.util.Scanner;

public class UseGradeRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterfaceGrade userInterface = new UserInterfaceGrade(register, scanner);
        userInterface.start();
        scanner.close();
    }
}