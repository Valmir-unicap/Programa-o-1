import java.util.Scanner;
public class mediaPonderada {
	Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
			double nota1, nota2, resultado;
	         System.out.print("Digite a primeira nota: ");
	         nota1=entrada.nextDouble();
	         System.out.print("Digite a segunda nota: ");
	         nota2 = entrada.nextDouble();
	         resultado = (2*nota1 + 3*nota2) / (2+3);
	         System.out.println("Sua média é: " + resultado);
	}       
}
