import java.util.Scanner;
 public class Tabuada {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int num, i;
        System.out.print("Digite um número: ");
        num= entrada. nextInt();
        for(i=0; i<=10; i=i+1){
            System.out.println(num + "x" + i + "=" +num*i);
        }
    }
 
}
