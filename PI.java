import java.util.Arrays;
import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        boolean running = true;
        
        String[] id_cpfs = new String[0];

        do {
            running = false;
            String id_cpf_at;

            System.out.println("Informe seu cpf:");
            id_cpf_at = ler.nextLine();
            
            boolean cpfExists = false;

            for (String cpf : id_cpfs) {
                if (cpf.equals(id_cpf_at)) {
                    cpfExists = true;
                    break;
                }
            }
            
            if (cpfExists) {                            
                System.out.println("CPF já existe");
            } else {
                System.out.println("CPF não existe");
                id_cpfs = Arrays.copyOf(id_cpfs, id_cpfs.length + 1);
                id_cpfs[id_cpfs.length - 1] = id_cpf_at;
            }
            
        } while (running);
    }
}
