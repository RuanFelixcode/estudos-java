import java.util.*;

public class EscolhaCaso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o numero mes");
        int num_mes = entrada.nextInt();
        switch (num_mes) {
        case 1: // <- valor da variavel
            System.out.println("janeiro"); 
            break;
       
        case 2:
            System.out.println("março");
            break;

        case 3 :
            System.out.println("maio");
            break;
        default :
        System.out.println("mes n esta no programa");
       }
        entrada.close();
    }
}