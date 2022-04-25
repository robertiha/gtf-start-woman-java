package apostila;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class DesafioAlbumDeFigurinha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // int n 1<= n <= 100 (numero total de figurinhas e epaço no album);
        // int m 1 <= m < = 300 (numero de figurinhas já compradas);
        // cada M contem um número  inteiro X (1 <= x < = N) indicando uma fig já comprada;
        //reproduzir em uma única linha contendo um inteiro representando o número de fig 
        // que faltam para completar o album

        int numeroDeFigurinhas = entrada.nextInt();
        int numeroDeFigurinhasCompradas = entrada.nextInt();
        int totalDeFigurinhas = 0;
        int[] albumDeFigurinha = new int[numeroDeFigurinhasCompradas]; //array album de figs das figs compradas

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++) { //iniciando a variável; variável deve ser maior que numde figscompradas; incremento +1
            if (entrada != null) { //se entrada for diferente de null, então...
                albumDeFigurinha[i] = entrada.nextInt(); //lê o próximo inteiro e armazena no album de figs
            } else { //senão
                break; //para
            }
        }

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++) { 
            int figurinha = albumDeFigurinha[i]; //escolhendo variável de dentro do album de figs
            int repetida = 0; //definindo a variável repetida

            for (int j = 0; j < numeroDeFigurinhasCompradas; j++) { //para que 
                if (albumDeFigurinha[j] == figurinha) { //se figurinha[j] for igual a figurinha
                    repetida++;
                } 
            }

            if (repetida >= 2) { //se repetida for maior ou igual a 2
                for (int j = 0; j < numeroDeFigurinhasCompradas; j++) {
                    if (figurinha == albumDeFigurinha[j]) {  //se figurinha for igual figurinha[j]
                        albumDeFigurinha[j] = -1; 
                        break;
                    }
                }
            }
        }

        int figuras = 0;

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++) {
            if (albumDeFigurinha[i] != -1) {
                figuras++;
            }
        }
        
        totalDeFigurinhas = numeroDeFigurinhas - figuras;
        System.out.println(totalDeFigurinhas);

        entrada.close();
    }

}
