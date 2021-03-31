import java.util.Scanner;
 public class Questao1f {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Digite um número: ");
        a= entrada.nextInt();
        System.out.print("Digite outro número: ");
        b= entrada.nextInt();
        System.out.print("Digite outro valor: ");
        c= entrada.nextInt();
        System.out.println("A soma é: " + soma(a,b));
        System.out.println("A média é: " + media(a,b));
        System.out.println("A media2 é: " + media2(a,b,c));
        System.out.println("O maior valor entre a e b será: " + maior(a,b));
        System.out.println("O maior valor entre a, b ou c será: " + maior2(a,b,c));
    }
    public static int soma(int a, int b){
        int soma= a + b;
        return soma;
    }
    public static double media(int a, int b){
        int media= (a + b)/2;
        return media;
    }
    public static double media2(int a,int b, int c){
        double media2;
        media2= (a + b + c)/3;
        return media2;
    }
    public static int maior(int a, int b){
        int maior;
        if(a>b || b<a){
            return a;
        }else{
            return b;
        }
    }
    public static int maior2(int a, int b, int c){
        int maior2;
        if(a>b && a>c){
            return a;
        } if(b>a && b>c){
            return b;
        } if(c>a && c>b){
            return c;
        }else{
            return 0; 
        }
    }
}
