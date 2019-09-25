import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("**************************************\n***Lad os få udregnet din nettoløn!***\n" +
                "**************************************\n");


        System.out.println("Hvad er din timeløn: ");
        double timeloen = input.nextDouble();

        System.out.println("Hvor mange timer har du arbejdet denne måned? ");
        double timer = input.nextDouble();

        System.out.println("Hvad er din skattesats (I procent)? ");
        double skat = input.nextDouble();
        double skat1 = skat /100;

        calculateNetSalary(timeloen, timer, skat1);

        System.out.println("Din løn efter skat er: " + calculateNetSalary(timeloen, timer, skat1) +" kr");

    }

    private static double calculateNetSalary(double timeloen, double timer, double skat) {

        double resultat1 = timeloen*timer;
        double realResultat = resultat1-(resultat1*skat);
        return realResultat;
    }

}
