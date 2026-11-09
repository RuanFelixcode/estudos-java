import java.util.*;

public class OperadorTernario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        String resultado = (idade>=18)? "vc e de maior" : "vc e de menor";
        System.out.println(resultado);
        entrada.close();
    }
}