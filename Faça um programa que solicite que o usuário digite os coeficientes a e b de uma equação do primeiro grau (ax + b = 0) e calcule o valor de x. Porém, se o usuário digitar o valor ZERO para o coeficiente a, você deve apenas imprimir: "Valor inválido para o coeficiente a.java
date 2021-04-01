import java.util.Scanner;
 public class Questao02{
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args){
        int a, b, resultado;
        System.out.print("Digite o valor de ax: ");
        a= entrada.nextInt();
        System.out.print("Digite o valor de b: ");
        b= entrada.nextInt();
        resultado= a/b;
        if(resultado==0){
            System.out.println("Valor inválido: " + resultado);
        }else{
            System.out.println("O valor de x será: " + resultado);
        }
    }
 
}
