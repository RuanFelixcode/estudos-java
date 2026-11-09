import java.util.*;
public class Condicionais {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        if (idade >=18){
            System.out.println("sua idade e "+idade+" vc e de maior");
        }
        else {
            System.out.println("sua idade e "+idade+" vc e de menor");
        }


        if (idade >=30) System.out.println("vc esta na flor da idade adulta");

        else if ( idade <= 18) System.out.println("puberto");

        else if (idade > 18 ) {
            System.out.println("ta na media da idade");
        }
        

        entrada.close();
    }
}