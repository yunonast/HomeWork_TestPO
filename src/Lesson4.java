import java.util.Scanner;

public class Lesson4 {
    public static void main(String[]args){

    //System.out.println("Привет!");
       // 1.Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".

        /*Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();*/

        /*String a = "*";
        for (int i = 0; i < 10; i++) {
            System.out.print(a);
        }*/

       // 2.Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a ; i++) {
            System.out.print("*");
        }*/


       /*3. Напечатать числа в виде следующей таблицы:

        1 2 ... 10

        1 2 ... 10

        1 2 ... 10

        1 2 ... 10*/


        for (int i = 0; i < 4; i++) {
            int number = 1;
            int row = 1;
            for (int k = 0; k < 10; k++) {

                System.out.print(number + " ");
                number++;
            }
            row++;
            System.out.println();
        }


}

        }

