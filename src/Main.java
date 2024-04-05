import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Scanner task = new Scanner(System.in);
//        System.out.print("nece reqemli array oldugunu daxil edin: ");
//        int arrayLength = task.nextInt();
//
//        int[] array = new int[arrayLength];
//        int i=0;
//
//        while (i<arrayLength){
//            System.out.print(i+1  + " reqemi daxil edin: ");
//            array[i] = task.nextInt();
//            i++;
//        }
//        for (int a:array){
//            System.out.println(a);
//        }







//        Bir array yaradın.  array-dəki ən böyük 2 ədədin cəmi ilə , ən kiçik 2 ədədin cəmini tapın.
//                Sonra isə Scanner-dən əməliyyat daxil edin.(vurma,toplama ,çıxma, bölmə) .
//        Seçilən əməliyyata görə, prosesləri edin.



        int[] array = {17,12,5,7,25,9,15};
        int min = array[0];
        int min2 = array[0];
        int max = array[0];
        int max2 = array[0];

        for (int i=0; i<array.length; i++){
            if (min > array[i]){
                min2 = min;
                min = array[i];
            }
            else if (min2 > array[i]){
                min2 = array[i];
            }
        }
//        System.out.println(min);
//        System.out.println(min2);
        int minCem = min + min2;


        for (int i=0; i<array.length; i++){
            if (max < array[i]){
                max2 = max;
                max = array[i];
            }
            else if (max2 < array[i]){
                max2 = array[i];
            }
        }
//        System.out.println(max);
//        System.out.println(max2);
        int maxCem = max + max2;


        Scanner task = new Scanner(System.in);
        System.out.print("icra edilecek emeliyyati daxil edin: ");
        String operation = task.nextLine();

        switch (operation){
            case "*" -> System.out.println(minCem * maxCem);
            case "/" -> System.out.println(minCem / maxCem);
            case "+" -> System.out.println(minCem + maxCem);
            case "-" -> System.out.println(minCem - maxCem);
        }
    }
}