import java.util.Scanner;

public class colab2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // declaração de variáveis e matrizes
        boolean run = true;

        // Matrizes e variáveis de uso atual
        int[][][][] poltrona_A;
        int[][][][] poltrona_B;
        int[][][][] frisa;
        int[][][][] camarote;
        int[][][][] balcao_nobre;

        // Constantes para as dimensões dos locais
        final int peca = 3;
        final int period = 3;
        final int pa_linhas = 5;
        final int pa_coluna = 5;
        final int pb_linha = 10;
        final int pb_coluna = 10;
        final int frisa_ac = 5;
        final int frisa_id = 6;
        final int cam_ac = 10;
        final int cam_id = 5;
        final int bn_linha = 5;
        final int bn_coluna = 10;

        do {
            System.out.println("O que deseja fazer? \n1. Comprar passagens\n2. Ver passagens adquiridas");
            int id_op = ler.nextInt();
            switch (id_op) {
                case 1:
                    boolean run_esc_pc = true;
                    boolean run_esc_turn = true;
                    boolean run_esc_lcl = true;

                    do {
                        // Escolha de peça
                        int esc_pc;
                        do {
                            System.out.println("Qual peça você deseja assistir?\n1. Peça 1\n2. Peça 2\n3. Peça 3");
                            esc_pc = ler.nextInt();
                            if (esc_pc < 1 || esc_pc > 3) {
                                System.out.println("Opção inválida!");
                            } else {
                                run_esc_pc = false;
                            }
                        } while (run_esc_pc);

                        // Escolha de turno
                        int esc_turn;
                        do {
                            System.out.println("Qual turno para a peça " + esc_pc + "?\n" +
                                    "1. Manhã\n2. Tarde\n3. Noite");
                            esc_turn = ler.nextInt();
                            if (esc_turn < 1 || esc_turn > 3) {
                                System.out.println("Opção inválida!");
                            } else {
                                run_esc_turn = false;
                            }
                        } while (run_esc_turn);

                        // Escolha de local
                        int esc_ln;
                        do {
                            System.out.println("Para qual local você deseja comprar?");
                            // Aqui você pode adicionar a lógica para mostrar os locais disponíveis e permitir que o usuário escolha
                            esc_ln = ler.nextInt();
                            // Coloquei um exemplo simples apenas para continuar a lógica, substitua por sua própria lógica
                            if (esc_ln < 1 || esc_ln > 5) {
                                System.out.println("Opção inválida!");
                            } else {
                                run_esc_lcl = false;
                            }
                        } while (run_esc_lcl);

                        // Aqui você deve adquirir a passagem com base nas escolhas do usuário
                        System.out.println("Passagem adquirida para a peça " + esc_pc + ", turno " + esc_turn +
                                ", local " + esc_ln);

                        System.out.println("Deseja comprar mais passagens? (1 - Sim, 2 - Não)");
                        int continuar = ler.nextInt();
                        if (continuar == 2) {
                            run = false;
                        }
                    } while (run);
                    break;
                case 2:
                    // Aqui você pode adicionar a lógica para mostrar as passagens adquiridas
                    System.out.println("Aqui estão as passagens adquiridas.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (run);
    }
}