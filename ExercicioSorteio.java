import java.util.*;

public class ExercicioSorteio {

    public static void main(String[] args) {
        int numero_sorteado = (int) (Math.random() * 100) + 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("sorteando um numero aleatorio entre 1 a 100...");
        
        while (true){
            System.out.println("digite um numero entre 1 a 100 digite 0 pra desistir e ver a resposta");
            int numero_escolhido = entrada.nextInt();

            if (numero_escolhido==0) {
                System.out.println("voce desistiu! o numero sorteado era: " + numero_sorteado);
                break;
         
            }
            if (numero_escolhido==numero_sorteado){
                System.out.println("parabens vc acertou");
                break;
            }
            else if (numero_sorteado >= 1 && numero_sorteado <= 20)
            {
                System.out.println("perto o numero esta entre 1 e 20");
            }
            else if (numero_sorteado >= 21 && numero_sorteado <= 40)
            {
                System.out.println("perto o numero esta entre 21 e 40");
            }
            else if (numero_sorteado >= 41 && numero_sorteado <= 60)
            {
                System.out.println("perto o numero esta entre 41 e 60");
            }
            else if (numero_sorteado >= 61 && numero_sorteado <= 80)
            {
                System.out.println("perto o numero esta entre 61 e 80");
            }
            else if (numero_sorteado >= 81 && numero_sorteado <= 100)
            {
                System.out.println("perto o numero esta entre 81 e 100");
            }
            else if (numero_escolhido>100)
            {
                System.out.println("numero fora do sorteio");
            }
            
        }
        entrada.close();
    }
}