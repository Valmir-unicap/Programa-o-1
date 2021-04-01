import java.util.Scanner;
 public class Parouimpar {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int num1;
        System.out.print("Digite um número: ");
        num1= entrada.nextInt();
        if(num1%2==0){
            System.out.println("Esse número é par.");
        }else{
            System.out.println("Esse número é impar.");
        }
    }
}
 
