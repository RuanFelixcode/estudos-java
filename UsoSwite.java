import java.util.*;

public class UsoSwite {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        String resultado = switch(idade)
        {
        case 18,19,20 -> "jovem adulto";

        default -> "criança";

        };

        System.out.println(resultado);
        entrada.close();
    }
}