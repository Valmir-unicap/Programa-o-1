import java.util.Scanner;
 public class Questao4 {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        double salario, inss;
        System.out.print("Digite seu salário: ");
        salario= entrada.nextDouble();
        if(salario<=1751.81){
            inss= (salario * 8)/100;
            System.out.println("Será descontado do seu salário: R$" + inss);
        }else if(salario>=1751.82 && salario<=2919.72){
            inss= (salario * 9)/ 100;
            System.out.println("Será descontado do seu salário: R$" + inss);
        }else if(salario>=2919.73 && salario<=5839.45){
            inss= (salario * 11)/ 100;
            System.out.println("Será descontado do seu salário: R$" + inss);
        }
    }
 
}
