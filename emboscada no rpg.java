
import java.util.Scanner; 
 
public class RPG { 
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();
        
        
        int atqComDados = ataqueDoJogador;
        int defComDados = defesaDoJogador;

        if (dados >= 8 && dados <= 10) {
            atqComDados += dados * 2;
            defComDados += dados * 2;
        } else {
            atqComDados += dados;
            defComDados += dados;
        }

        int danoSofrido = (ataqueDoInimigo - (defComDados));
        int danoCausado = (atqComDados);

        if (danoSofrido >= vidaDoJogador) {
            System.out.println("Jogador nao sobreviveu");
        } else if (danoSofrido < vidaDoJogador && danoCausado < vidaDoInimigo) {
            System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
        } else if (danoSofrido < vidaDoJogador && danoCausado > vidaDoInimigo) {
            System.out.println("Jogador sobreviveu e derrotou o inimigo");
        }
     //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
     }
}