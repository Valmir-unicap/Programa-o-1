import java.util.Scanner;
 public class somatorio{
 	Scanner entrada = new Scanner(System.in);
 	public static void main(String[] args){
 		int num, soma = 0;
 		System.out.print("Digite o numero inteiro: ");
 		num= entrada.nextInt();
 		while (num>= 0){
 			soma = soma + num;
 			System.out.print("Digite o numero inteiro " + "(negativo para finalizar): ");
 			num = entrada.nextInt();
 			System.out.println ("O somatorio dos numeros digitados é " + soma);
 		}
 	}
 }
