import java.util.Scanner;
 public class Potencia {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int base, expoente;
        System.out.print("Digite a base do número: ");
        base= entrada.nextInt();
        System.out.print("Digite o expoente:" );
        expoente= entrada.nextInt();
        System.out.println("O resultado é: " +calcular(base,expoente));
    }
    public static int calcular(int base, int expo){
        int i, resultado = 1;
        if(expo == 0 || base == 1){
            return 1;
        } else {
            for(i=1; i<=expo; i=i +1){
                resultado= resultado * base; 
            }
            return resultado;
        }
    }
}
 
