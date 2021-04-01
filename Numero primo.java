import java.util.Scanner;
 public class Primo {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int num1;
        System.out.print("Digite um número: ");
        num1= entrada.nextInt();
        System.out.println("Esse número é: " +primo(num1));
    }
    public static boolean primo(int num1){
        int i, qtdDivisores=0;
        for(i=1; i<=num1; i=i+1){
           if(num1%i==0){
                qtdDivisores= qtdDivisores +1;
            }
        }
        if(qtdDivisores==2){
            return true;
        }else{
            return false;
        } 
    }
}
 
