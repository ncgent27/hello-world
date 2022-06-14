import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of weeks");
        int number = input.nextInt();
        int day = number *7;
        System.out.println(day+"days");
        int hours = day *24;
        System.out.println(hours+ "hours");
        int minutes = hours *60;
        System.out.println(minutes+ "minutes");
        int seconds = minutes *60;
        System.out.println(seconds+ "seconds");
    }

    }

