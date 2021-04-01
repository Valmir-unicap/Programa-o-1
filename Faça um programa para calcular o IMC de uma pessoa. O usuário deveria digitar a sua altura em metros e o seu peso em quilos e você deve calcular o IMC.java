import java.util.Scanner;
 public class Peso {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        double peso, altura, imc;
        System.out.print("Digite seu peso: ");
        peso= entrada.nextDouble();
        System.out.print("Digite sua altura: ");
        altura= entrada.nextDouble();
        altura= altura * altura;
        imc= peso / altura;
        System.out.println("Seu imc é: " + imc);
    }
 
}
 
