import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int[] myArray; // объявление массива
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

        int[] OrderArray; // объявление массива
        OrderArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

        int flag = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int a = i+1;
            System.out.println("ВВедите "+ a);
            myArray[i] = scanner.nextInt();
        }

        for (int j = 0; j < 10; j++) {

            for (int k = 0; k < 9; k++) {

                if (myArray[k] > myArray[k+1]) { int temp = myArray[k]; myArray[k] = myArray[k+1]; myArray[k+1] = temp; flag =1;}

            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.print(myArray[i] + " " );
        }
    }
}
