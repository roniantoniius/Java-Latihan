public class Method2 {
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static int smallest(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }
    
    public static int greatest(int number1, int number2, int number3){
        int current = 0;

        for (int i = 0; i < 3; i++){
            if (i == 0){
                if (number1 > number2){
                    current = number1;
                } else {
                    current = number2;
                }
            } else {
                if (current > number3){
                    return current;
                } else {
                    return number3;
                }
            }
        }

        return current;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return (number1 + number2 + number3 + number4) / 4.0;
    }
    
    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);

        int temp = smallest(4, 3);
        System.out.println("Smallest: " + temp);

        int temp2 = greatest(4, 3, 6);
        System.out.println("Greatest: " + temp2);

        double average = average(4, 3, 6, 1);
        System.out.println("Average: " + average);
    }
}