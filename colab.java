import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class colab {
    public static void main(String[] args){

        final int total_poltronas = 255;
        boolean[] poltronas = new boolean[total_poltronas];
        Arrays.fill(poltronas, true);

        Scanner ler = new Scanner(System.in);

            //Liberar todas poltronas

                    boolean verdade = true;
                    do{
                        System.out.print("Insira um valor para escolher a poltrona: ");
                        int escolha = ler.nextInt() -1;
                                   
                            if (poltronas[escolha] == false) {
                            System.out.println("Poltrona ocupada\nSelecione outro lugar");
                            escolha = ler.nextInt();
                            } else {
                                System.out.println("Escolheu certo");
                                poltronas[escolha] = false;
                            }
               
               
                        } while(verdade);
            }
        }



