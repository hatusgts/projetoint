import java.util.Arrays;
import java.util.Scanner;

public class polt {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int escpolt = 0, peca = 0;
        boolean[][] horapolt =  new boolean [3] [3];
        for (int i = 0; i < horapolt.length; i++) {
            for (int j = 0; j < horapolt[i].length; j++) {
                horapolt[i][j] = true;
            }
        }

        System.out.println("Escolha a peça que deseja assistir:\n 1. Peça 1 \n 2. Peça 2 \n 3. Peça 3");
        peca = ler.nextInt();
        System.out.println("Escolha sua poltrona ");
        escpolt = ler.nextInt();


    }
}
