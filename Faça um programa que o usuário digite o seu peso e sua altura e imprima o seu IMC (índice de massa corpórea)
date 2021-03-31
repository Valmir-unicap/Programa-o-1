import java.util.Scanner;
 public class Imc2 {
    public static void main(String[] args) {
 
        double imc= calcular();
        System.out.println("Seu imc é: " + imc);
        if(imc<=0 || imc>=15){
            System.out.println("Você está magro. ");
        }else{
            System.out.println("Você está normal. ");
        }
    }
 
    public static double calcular(){
        double peso, altura, imc;
        Scanner entrada= new Scanner(System.in);
 
        System.out.print("Digite seu peso: ");
        peso= entrada.nextDouble();
        System.out.print("Digite sua altura: ");
        altura= entrada.nextDouble();
        imc= peso/(altura * altura);
        return imc;
    }
}
