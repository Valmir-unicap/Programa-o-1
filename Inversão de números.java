import java.util.Scanner;
 public class Inversao {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int num, inverso=0;
        do{
        System.out.print("Digite um número inteiro (9999-9999999): ");
        num= entrada.nextInt();
        }while(num<9999 || num>9999999);
        while(num!=0){
            inverso=num%10;
            num= num/10;
            System.out.println("Número invertido= " + inverso);
        }
    } 
}
