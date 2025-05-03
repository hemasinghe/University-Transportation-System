import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the programme\n"+ "Please select your position:\n"+"Enter 1 for passenger\n"+"Enter 2 for admin");

        Scanner num = new Scanner(System.in);

        int number = num.nextInt();

        switch (number){
            case 1:
                TestDriver.main(new String[]{});
                break;
            case 2:
                TestDriver2.main(new String[]{});
                break;

        }


    }

}
