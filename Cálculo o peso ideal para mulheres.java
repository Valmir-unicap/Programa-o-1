import java.util.Scanner;
 public class Mulherpeso {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        double altura, formula;
        System.out.print("Digite sua altura: ");
        altura= entrada.nextDouble();
        formula= (62.1*altura) - 44.7;
        System.out.println("O seu peso ideal é: KG" + formula);
    }
 
}
