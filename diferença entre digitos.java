import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
    int primeiro = 1;
    int soma = 0;
    int resultado = 0;
    if ( numero !=0){
       for (int i=0; i < ints.length; i++){
        primeiro = primeiro * ints[i];
        soma = soma + ints[i];
        resultado = primeiro - soma;}
        System.out.println(resultado);
      }
      else {System.out.println("Digite um valor maior que zero");
    }
        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
        
    }
}