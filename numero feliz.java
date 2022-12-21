
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
            //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
             while (true) {
                   int soma = 0;
                   String number = String.valueOf(n);
                   char[] num = number.toCharArray();
 
                   for (int i = 0; i < num.length; i++) {
                   int digito = Integer.parseInt(String.valueOf(num[i]));
                   soma += (digito * digito);
                      }
 
                   n = soma;

                   if (soma != 1 && num.length == 1){
                      System.out.println("false");
                      break;
                //System.out.println(soma);
                    }else if (soma == 1) {
                     System.out.println("true");
                //System.out.println(soma);
                     break;
                  }
            
             }
    	}
}