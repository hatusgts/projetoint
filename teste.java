import java.util.Scanner;
import java.util.Arrays;

public class teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean[] poltM = new boolean[10];
        Arrays.fill(poltM, true);

        boolean run = true;
        int escPol = 0;

        do{
            System.out.println("Qual poltrona você quer? Existem 10 poltronas!");
            escPol = ler.nextInt() - 1;
            if (poltM[escPol] == false) {
            System.out.println("Poltrona ocupada \nEscolha outra poltrona!");
                } else {
                poltM[escPol] = false;
            }
        } while(run);
        //System.out.println(poltM);
    }
}