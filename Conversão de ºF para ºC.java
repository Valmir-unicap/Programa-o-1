import java.util.Scanner;
 public class Fparac {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int celsius, formula;
        System.out.print("Digite o valor em celsius: ");
        celsius= entrada.nextInt();
        formula= (celsius-32)*5/9;
        System.out.println("O valor convertido para Fahrenheit será: F" + formula);
    }
}
