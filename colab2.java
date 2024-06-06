import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class colab2 {
    public static void main(String[] args){


        final int total_poltronas = 255;
        boolean[] poltronas = new boolean[total_poltronas];
        Arrays.fill(poltronas, true);
        List<String> cpfs = new ArrayList<>();
        List<String> pecas = new ArrayList<>();
        List<String> turno = new ArrayList<>();
        List<String> lugar = new ArrayList<>();
        Scanner ler = new Scanner(System.in);


        boolean run = true;


        while(run){


            //Liberar todas poltronas
            for(int disponivel = 0; disponivel < poltronas.length; disponivel ++){
                poltronas[disponivel] = true;
            }


            System.out.println("\no que você deseja fazer?");
            System.out.println("1. Compar um novo ingresso");
            System.out.println("2. Ver cadastros realizados");
            System.out.println("3. Poltronas disponíveis");
            System.out.print("Digite aqui:");
            int menu = ler.nextInt();


            switch(menu){
                case 1:
                    //Informação do CPF
                    System.out.print("Inisira o seu CPF: ");
                    String cpf = ler.next();
                    cpfs.add(cpf);


                    //Escolha da peça
                    System.out.println("\n1. Bela e fera: ");
                    System.out.println("2. Branca de neve: ");
                    System.out.println("3. Lago dos cisneis: ");
                    System.out.print("Escreva a sessão desejada: ");
                    String peca = ler.next();
                    pecas.add(peca);


                    // Escolha do turno
                    System.out.println("\n1. Manhã ");
                    System.out.println("2. Tarde");
                    System.out.println("3. Noite: ");
                    System.out.print("Escreva o turno desejado: ");
                    String M_T_N = ler.next();
                    turno.add(M_T_N);


                    // Escolha do local
                    System.out.println("\n1. Classe A ");
                    System.out.println("2. Classe B");
                    System.out.println("3. Camarote: ");
                    System.out.println("4. Frisa: ");
                    System.out.println("5. Balcão Nobre: ");
                    System.out.print("Escreva o turno desejado: ");
                    String local = ler.next();
                    lugar.add(local);


                    boolean verdade = true;
                    do{
                        System.out.print("Insira um valor para escolher a poltrona: ");
                        int escolha = ler.nextInt() -1;
                                   
                            if (poltronas[escolha] == false) {
                            System.out.println("Poltrona ocupada\nSelecione outro lugar");
                            escolha = ler.nextInt();
                            } else {
                                System.out.println("Escolheu certo");
                                verdade = false;
                            }
               
               
                        } while(verdade);
               

                case 2:
                    // Intercalando e imprimindo as listas
                    int max1 = Math.max(cpfs.size(), pecas.size());
                    int max2 = Math.max(turno.size(), lugar.size());
                    int max = Math.max(max1, max2);


                    for (int i = 0; i < max; i++) {
                        if (i < cpfs.size()) {
                            System.out.println("\nCpf vinculado: " + cpfs.get(i));
                        }
                        if (i < pecas.size()) {
                            System.out.println("peca desejada: " + pecas.get(i));
                        }
                        if (i < turno.size()) {
                            System.out.println("Turno escolhido: " + turno.get(i));
                        }
                        if (i < lugar.size()) {
                            System.out.println("Local escolhido: " + lugar.get(i));
                        }
                    }
                                    }
            }
        }


    }


