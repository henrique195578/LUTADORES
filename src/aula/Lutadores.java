package aula;
import java.util.Scanner;

public class Lutadores {

    public static void main(String[] args) {
      
        double Altura, Peso, Massacorporal, Idade;
        String Nome;
      
        Scanner entrada = new Scanner(System.in);
      
        System.out.println("Como se chama docinho ?");
        Nome = entrada.nextLine();
        System.out.println("Qual o seu peso querido ? (Exemplo:85,4)");
        Peso = entrada.nextDouble();
        System.out.println("Qual sua altura, por gentileza? (Exemplo:1,55)");
        Altura = entrada.nextDouble();
        System.out.println("Sua idade ? (Para competir deverá ser maior");
        Idade = entrada.nextDouble();
       
        Massacorporal = Peso / (Altura * Altura);
      
         if (Massacorporal >= 1.0 && Massacorporal <= 18.5) {
            System.out.println("Hey " + Nome + ",Sua categoria é definida como Mosca ");
        } else if (Massacorporal >= 18.6 && Massacorporal <= 44.9) {
            System.out.println("Hey " + Nome + " Ótimo você esta na media dos demais lutadores. Boa sorte!");
        
        } else if (Massacorporal >= 45.0 && Massacorporal <= 49.9) {
            System.out.println("Hey " + Nome + ",Sua categoria é definida como Grilo: ");
        
        } else if (Massacorporal >= 50.0 && Massacorporal <= 59.9) {
            System.out.println("Hey " + Nome + ",Sua categoria é definida como Galo: ");
        
        } else if (Massacorporal >= 60.0 && Massacorporal <= 68.0)  {
            System.out.println("Hey " + Nome + ",Sua categoria é definida como Cachorro:");
        
        } else if (Massacorporal >= 68.1 && Massacorporal <= 88.0) {
            System.out.println("Hey " + Nome + ",Sua categoria é definida como Monstro:");
        
        } else if (Massacorporal >= 89.0 && Massacorporal <= 95.0) {
            System.out.println("Hey " + Nome + ",  Sua categoria é definida como Big boss");
        }
        if (Idade <= 17) {
            System.out.println("Você é menor de idade, você precisa de autorização do seus pais!");
        }

    }
}