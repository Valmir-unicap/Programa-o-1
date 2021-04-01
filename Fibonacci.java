import java.util.Scanner;
 public class Fibonacci {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int num1;
        System.out.print("Digite o primeiro número: ");
        num1= entrada.nextInt();
        System.out.println("O fibonacci é: " +calculo(num1));
    }
    public static int calculo(int num1){
        int i, numanterior=0, numproximo=1, numresultado=1;
        for(i=1; i <= num1 - 1 ; i= i+1){
           numresultado= numproximo + numanterior;
           numanterior= numproximo ;
           numproximo= numresultado;
        }
        return numresultado;
    }
}
