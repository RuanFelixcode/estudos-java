import java.util.*;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu nome na linha abaixo:");
        
        String nome = entrada.nextLine();
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("ola " + nome + " vc tem " + idade + " anos de idade ");
        entrada.close();
    }
}