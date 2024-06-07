import java.util.Scanner;


public class hyanp {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        // Quantidade de cadeiras para a plateia A
        final int linhas = 5;
        final int coluna = 5;


        // Quantidade de cadeiras para a plateia B
        final int linha_2 = 10;
        final int coluna_2 = 10;


        // Quantidade de cadeiras do frisa
        final int linha_3 = 6;
        final int coluna_3 = 5;


        // Quantidade de cadeiras do camarote
        final int linha_4 = 10;
        final int coluna_4 = 5;


        // Quantidade de cadeiras do Balcão nobre
        final int linha_5 = 5;
        final int coluna_5 = 10;


        // Matrizes
        int[][] poltrona_A = new int[linhas][coluna];
        int[][] poltrona_B = new int[linha_2][coluna_2];
        int[][] frisa =  new int[linha_3][coluna_3];
        int[][] camarote =  new int[linha_4][coluna_4];
        int[][] balcao_nobre =  new int[linha_5][coluna_5];


        // Inicializando todas as poltronas como disponíveis
        inicializarPoltronas(poltrona_A);
        inicializarPoltronas(poltrona_B);
        inicializarPoltronas(frisa);
        inicializarPoltronas(camarote);
        inicializarPoltronas(balcao_nobre);


        // Mostrar as poltronas da plateia A
        mostrarPoltronas("Poltronas da plateia A:", poltrona_A);


        // Mostrar as poltronas da plateia B
        mostrarPoltronas("Poltronas da plateia B:", poltrona_B);


        // Mostrar as poltronas do frisa
        mostrarPoltronas("Poltronas do frisa:", frisa);


        // Mostrar as poltronas do camarote
        mostrarPoltronas("Poltronas do camarote:", camarote);


        // Mostrar as poltronas do balcão nobre
        mostrarPoltronas("Poltronas do balcão nobre:", balcao_nobre);


        boolean continuar = true;
        while (continuar) {
            // Escolha da área
            System.out.println("\nInsira um valor para a seleção da área:");
            System.out.println("1. Plateia A");
            System.out.println("2. Plateia B");
            System.out.println("3. Frisa");
            System.out.println("4. Camarote");
            System.out.println("5. Balcão Nobre");
            System.out.print("Insira a escolha: ");
            int escolher_area = ler.nextInt();


            // Verificar escolha válida da área
            while (escolher_area < 1 || escolher_area > 5) {
                System.out.println("Escolha inválida. Por favor, escolha uma área válida.");
                escolher_area = ler.nextInt();
            }


            // Escolha da poltrona
            System.out.print("Insira um valor de poltrona: ");
            int escolher_poltrona = ler.nextInt();


            // Verificar escolha válida da poltrona
            while (escolher_poltrona < 1 || escolher_poltrona > 5) {
                System.out.println("Poltrona inválida. Por favor, escolha uma poltrona válida.");
                escolher_poltrona = ler.nextInt();
            }


            // Marcar a poltrona como ocupada se estiver disponível
            switch (escolher_area) {
                case 1:
                    if (poltrona_A[escolher_area][escolher_poltrona] != 0) {
                        poltrona_A[escolher_area][escolher_poltrona] = 0;
                        System.out.println("Poltrona selecionada com sucesso!");
                    } else {
                        while(poltrona_A[escolher_area][escolher_poltrona] == 0) {
                            System.out.print("A poltrona está ocupada. Por favor, escolha outra: ");
                            escolher_poltrona = ler.nextInt();
                        }
                        System.out.println("Poltrona selecionada com sucesso!");
                    }
                    break;
                case 2:
                    if (poltrona_B[escolher_area][escolher_poltrona] != 0) {
                        poltrona_B[escolher_area][escolher_poltrona] = 0;
                        System.out.println("Poltrona selecionada com sucesso!");
                    } else {
                        while(poltrona_A[escolher_area][escolher_poltrona] == 0) {
                            System.out.print("A poltrona está ocupada. Por favor, escolha outra: ");
                            escolher_poltrona = ler.nextInt();
                        }
                        System.out.println("Poltrona selecionada com sucesso!");
                    }
                    break;
                case 3:
                    if (frisa[escolher_area][escolher_poltrona] != 0) {
                        frisa[escolher_area][escolher_poltrona] = 0;
                        System.out.println("Poltrona selecionada com sucesso!");
                    } else {
                        while(poltrona_A[escolher_area][escolher_poltrona] == 0) {
                            System.out.print("A poltrona está ocupada. Por favor, escolha outra: ");
                            escolher_poltrona = ler.nextInt();
                        }
                        System.out.println("Poltrona selecionada com sucesso!");
                    }
                    break;
                case 4:
                    if (camarote[escolher_area][escolher_poltrona] != 0) {
                        camarote[escolher_area][escolher_poltrona] = 0;
                        System.out.println("Poltrona selecionada com sucesso!");
                    } else {
                        while(poltrona_A[escolher_area][escolher_poltrona] == 0) {
                            System.out.print("A poltrona está ocupada. Por favor, escolha outra: ");
                            escolher_poltrona = ler.nextInt();
                        }
                        System.out.println("Poltrona selecionada com sucesso!");
                    }
                    break;
                case 5:
                    if (balcao_nobre[escolher_area][escolher_poltrona] != 0) {
                        balcao_nobre[escolher_area][escolher_poltrona] = 0;
                        System.out.println("Poltrona selecionada com sucesso!");
                    } else {
                        while(poltrona_A[escolher_area][escolher_poltrona] == 0) {
                            System.out.print("A poltrona está ocupada. Por favor, escolha outra: ");
                            escolher_poltrona = ler.nextInt();
                        }
                        System.out.println("Poltrona selecionada com sucesso!");
                    }
                    break;
                default:
                    System.out.println("O valor não é reconhecido!");
                    break;
            }
        }
    }


    // Método para inicializar todas as poltronas como disponíveis
    public static void inicializarPoltronas(int[][] area) {
        for (int i = 0; i < area[1].length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                area[i][j] = i * area[i].length + j + 1;
            }
        }
    }


    // Método para mostrar as poltronas de uma determinada área
    public static void mostrarPoltronas(String titulo, int[][] area) {
        System.out.println("\n" + titulo);
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                System.out.print("[" + area[i][j] + "]\t");
            }
            System.out.println();
        }
    }
}





