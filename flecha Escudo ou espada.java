
import java.util.Scanner;  

public class PedraPapelTesoura {  
    public static void main(String[] args){  

        Scanner leitor = new Scanner(System.in);  

        int jogadaJogador = leitor.nextInt();  
        int jogadaInimigo = leitor.nextInt();  
        
    int resultado = jogadaJogador - jogadaInimigo;
    if (resultado == 0){
        System.out.println("Empatou");
        }
    else if (resultado == -1 || resultado ==2)
        System.out.println("Perdeu");
    else{     
         System.out.println("Ganhou");
         }
     //TODO: Crie as condições necessárias para verificar quem vencerá o embate;
     }
}