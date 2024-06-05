import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PI {
    public static void PI(String[] args) {

        Scanner ler = new Scanner(System.in);
        final int total_poltrona = 255;
        boolean[] poltronas = new boolean[total_poltrona];
        List<String> cpfs = new ArrayList<>();
        
        boolean decisao = true;
        
        while (decisao) {
    
            
            // Todas poltronas ficam liberadas
            for (int disponivel = 0; disponivel < poltronas.length; disponivel++) {
            poltronas[disponivel] = true;
            }
                    
            System.out.println("O que você deseja:\n1. Fazer uma nova compra\n2. Olhar cadastro\n3. Poltronas disponíveis");
            System.out.print("Escolha uma opção: ");
            String escolher = ler.next();

            switch (escolher) {

                case "1":
                    System.out.println("Insira o seu cpf: ");
                    String cpf = ler.next();
                    cpfs.add(cpf);
                    System.out.println("CPF ADICIONADO COM SUCESSO!\n");
                    System.out.println("CPF: " + cpfs);

                    

                    // Escolha da poltrona
                    System.out.println("Insira um valor para escolher a poltrona: ");
                    int escolha = ler.nextInt();

                    while(poltronas[escolha] == false){
                        System.out.println("A poltrona escolhida já estava reservada");
                        System.out.println("Escolha outra poltrona");
                        escolha = ler.nextInt();
                    }
                    
                    
                    } // Colocando como poltrona reservada
                    if (escolha >= 0 && escolha < poltronas.length) {
                        if (poltronas[escolha]) {
                            poltronas[escolha] = false;
                            System.out.println("A poltrona foi reservada com sucesso");
                        }
                    }
                    break;

                case "2":
                    System.out.println("CPFs cadastrados:");
                    for (String cpfCadastrado : cpfs) {
                        System.out.println("CPF: " + cpfCadastrado);
                    }
                    break;

                case "3":
                    // Printar as poltronas disponíveis
                    for (int i = 0; i < poltronas.length; i++) {
                        if (i == 0 ) {
                            System.out.println("poltronas da plateia A :");
                        } else {
                            
                        System.out.println("Poltrona " + i + ": " +
                                (poltronas[i] ? "Disponivel" : "Reservada"));
                        // Determinar se a poltrona está na plateia A
                        }
                    }
                    break;
                    
        }
            }
        }
    }
}
