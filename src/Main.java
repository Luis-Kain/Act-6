import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Para utilizar este programa favor de seguir las siguientes instrucciones.\n" +
                "Ingresa tu nombre:");
        myCalculator.setName(sc.nextLine());

        for (int i = 0; i< myCalculator.myGrades.length;i++){
            System.out.print("\n ingresa tu calificación " + (i+1) + ":");
            myCalculator.myGrades[i] = sc.nextFloat();
        }

        myCalculator.printGrades();
    }
}