package apostila;

import java.util.Scanner;

public class DesafioCoxinhaDeBueno {
    public static void main(String[] args) {
       
        //int h = 0;
        //int p = 0;
       
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de coxinhas consumidas: ");
        double h = scan.nextInt();

        System.out.println("Insira a quantidade de participantes: ");
        double p = scan.nextInt();


        double media = (h/p);

        System.out.printf("%.2f", media);
        scan.close();


    }
    
}
