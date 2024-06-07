import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class colabtst {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        //declaração de váriaveis e matrizes
        boolean run = true;
        boolean run_esc_pc = true;
        boolean run_esc_turn = true;
        boolean run_esc_lcl = true;
        
            //variaveis de uso atual
            int id_op, esc_pc, esc_turn, esc_lcl, esc_act;

            //peças
            final int peca = 3;

            //periodos
            final int period = 3;

            // Quantidade de cadeiras para a plateia A
            final int pa_linhas = 5;
            final int pa_coluna = 5;
            
            // Quantidade de cadeiras para a plateia B
            final int pb_linha = 10;
            final int pb_coluna = 10;
            
            // Quantidade de cadeiras do frisa
            final int frisa_ac = 5;
            final int frisa_id = 6;
    
    
            // Quantidade de cadeiras do camarote
            final int cam_ac = 10;
            final int cam_id = 5;
    
    
            // Quantidade de cadeiras do Balcão nobre
            final int bn_linha = 5;
            final int bn_coluna = 10;
            
            
            
            
            // Matrizes
            int[][][][] poltrona_A = new int[peca][period][pa_linhas][pa_coluna];
            int[][][][] poltrona_B = new int[peca][period][pb_linha][pb_coluna];
            int[][][][] frisa =  new int[peca][period][frisa_ac][frisa_id];
            int[][][][] camarote =  new int[peca][period][cam_ac][cam_id];
            int[][][][] balcao_nobre =  new int[peca][period][bn_linha][bn_coluna];
    do{
        run =false;
        int Id_disponA = 0;
            for (int i = 0; i < poltrona_A[peca - 1].length; i++) {
                for (int j = 0; j < poltrona_A[period -1][i].length; j++) {
                    for (int k = 0; k < poltrona_A[i][j].length; k++) {
                        for (int l = 0; l < poltrona_A[i][j][k].length; l++) {
                            if(poltrona_A[i][j][k][l] == 0){
                            Id_disponA = Id_disponA +1;
                            }
                            System.out.println("Tem " + Id_disponA);
                        }
                    }
                }
            }
        System.out.println("O que deseja fazer? \n1. Comprar passagens\n2. Ver passagens adquiridas");
        id_op = ler.nextInt();
        do{
        id_op = 0;
            //escolha de peça
            do{
                System.out.println("Qual peça você deseja assistir?\n1. Peça 1\n2. Peça 2\n3. Peça 3");
                esc_pc = ler.nextInt();
                run_esc_pc = false;
                switch (esc_pc) {
                    case 1:          
                    poltrona_A = new int[esc_pc][period][pa_linhas][pa_coluna];
                    poltrona_B = new int[esc_pc][period][pb_linha][pb_coluna];
                    frisa = new int[esc_pc][period][frisa_ac][frisa_id];
                    camarote = new int[esc_pc][period][cam_ac][cam_id];
                    balcao_nobre = new int[esc_pc][period][bn_linha][bn_coluna];
                    break;
                    case 2:
                    poltrona_A = new int[esc_pc][period][pa_linhas][pa_coluna];
                    poltrona_B = new int[esc_pc][period][pb_linha][pb_coluna];
                    frisa = new int[esc_pc][period][frisa_ac][frisa_id];
                    camarote = new int[esc_pc][period][cam_ac][cam_id];
                    balcao_nobre = new int[esc_pc][period][bn_linha][bn_coluna];
                    break;
                    case 3:
                    poltrona_A = new int[esc_pc][period][pa_linhas][pa_coluna];
                    poltrona_B = new int[esc_pc][period][pb_linha][pb_coluna];
                    frisa = new int[esc_pc][period][frisa_ac][frisa_id];
                    camarote = new int[esc_pc][period][cam_ac][cam_id];
                    balcao_nobre = new int[esc_pc][period][bn_linha][bn_coluna];
                    break;
                
                    default:
                    System.out.println("Opção inválida!");
                    run_esc_pc = true;
                    esc_pc = 0;
                        break;
                    }
                }while(run_esc_pc);
            //escolha de turno
            do{
                run_esc_turn = false;
                System.out.println("Qual turno para a peça " + esc_pc + "?\n" +
                "1. Manhã\n2. Tarde\n3. Noite");
                esc_turn = ler.nextInt();
                switch (esc_turn) {
                    case 1:
                    poltrona_A = new int[esc_pc][esc_turn][pa_linhas][pa_coluna];
                    poltrona_B = new int[esc_pc][esc_turn][pb_linha][pb_coluna];
                    frisa = new int[esc_pc][esc_turn][frisa_ac][frisa_id];
                    camarote = new int[esc_pc][esc_turn][cam_ac][cam_id];
                    balcao_nobre = new int[esc_pc][esc_turn][bn_linha][bn_coluna];
                        break;
                    case 2:
                    poltrona_A = new int[esc_pc][esc_turn][pa_linhas][pa_coluna];
                    poltrona_B = new int[esc_pc][esc_turn][pb_linha][pb_coluna];
                    frisa = new int[esc_pc][esc_turn][frisa_ac][frisa_id];
                    camarote = new int[esc_pc][esc_turn][cam_ac][cam_id];
                    balcao_nobre = new int[esc_pc][esc_turn][bn_linha][bn_coluna];
                        break;
                    case 3:
                    poltrona_A = new int[esc_pc][esc_turn][pa_linhas][pa_coluna];
                    poltrona_B = new int[esc_pc][esc_turn][pb_linha][pb_coluna];
                    frisa = new int[esc_pc][esc_turn][frisa_ac][frisa_id];
                    camarote = new int[esc_pc][esc_turn][cam_ac][cam_id];
                    balcao_nobre = new int[esc_pc][esc_turn][bn_linha][bn_coluna];
                        break;            
                    default:
                    System.out.println("Opção inválida!");
                    run_esc_turn = true;
                        break;
                }
            }while(run_esc_turn);
            //escolha de local
            do{
            run_esc_lcl = false;
                System.out.println("Para qual local voce deseja Comprar?\nVerifique o Mapa ao " +
                "lado Para ver a localização das áreas \n1. Plateia A\n2. Plateia B\n3. Frisas\n4. Camarotes\n5. Balcão Nobre");
                esc_lcl = ler.nextInt();
                switch (esc_lcl) {
                    case 1:
                    System.out.println("Poltronas disponíveis: ");

                    for (int i = 0; i < poltrona_A.length; i++) {
                        for (int j = 0; j < poltrona_A[i].length; j++) {
                            for (int k = 0; k < poltrona_A[i][j].length; k++) {
                                for (int l = 0; l < poltrona_A[i][j][k].length; l++) {
                                    System.out.println("Elemento em [" + i + "][" + j + "][" + k + "][" + l + "]: " + poltrona_A[i][j][k][l]);
                                }
                            }
                        }
                    }
                    break;

                    case 2:
                    
                        break;
                    case 3:
                    
                        break;
                    case 4:
                    imprimirCamarotes(camarote);
                        
                        break;
                    case 5:
                        
                        break;
                
                    default:
                        break;
                }
                }while(run_esc_lcl);
                
            }while(id_op == 1);


            

        }while(run);
}

public static void imprimirCamarotes(int[][][][] camarote) {
    for (int p = 0; p < camarote.length; p++) {
        for (int i = 0; i < camarote[p].length; i++) {
            for (int j = 0; j < camarote[p][i].length; j++) {
                System.out.println("Camarotes: " + (j + 1) + ":");
                for (int k = 0; k < camarote[p][i][j].length; k++) {
                        System.out.print(camarote[p][i][j][k] + " ");
                }
                System.out.println();
                }
            }
        }
    }
}