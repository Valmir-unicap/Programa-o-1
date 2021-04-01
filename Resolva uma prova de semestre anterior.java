import java.util.Scanner;
public class Questao1 {
    Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println(" Menu: ");
            System.out.println(" 1- Área de um retangulo. ");
            System.out.println(" 2- Área de um círculo. ");
            System.out.println(" 3- Tabuada.");
            System.out.println(" 4- Progressão aritmética. ");
            System.out.println(" 5- Sair. ");
            int escolha;
            System.out.print("Escolha uma das opções citadas: ");
            escolha= entrada.nextInt();
            if(escolha==1){
                int largura, altura;
                System.out.print("Digite largura do retangulo: ");
                largura= entrada.nextInt();
                System.out.print("Digite a altura do retangulo. ");
                altura= entrada.nextInt();
                System.out.println("A área será: " +retangulo(largura,altura));
        }else if(escolha==2){
            int raio;
            System.out.print("Digite o raio: ");
            raio= entrada.nextInt();
            System.out.println("A área será: " +circulo(raio));
        }else if(escolha==3){
            int num1;
            System.out.print("Digite um número para saber a tabuada: ");
            num1= entrada.nextInt();
            System.out.println("A tuabada será: " + tabuada(num1));
        }else if(escolha==4){
            int an, a1, r, n;
            System.out.print("Digite o valor de an: ");
            an= entrada.nextInt();
            System.out.print("Digite o valor de a1: ");
            a1= entrada.nextInt();
            System.out.print("Digite o valor de n: ");
            n= entrada.nextInt();
            System.out.print("Digite o valor de r: ");
            r= entrada.nextInt();
            System.out.println("O valor desta PA é: " +pa(an,a1,n,r));
        }else if(escolha==5){
            System.out.println("Você escolheu sair. ");
        }
    }
    public static int retangulo(int altura, int largura){
        int area;
        area= largura * altura;
        return area;
    }
    public static double circulo(int raio){
        double circulo;
        circulo= 3.14 * (raio * raio);
        return circulo;
    }
    public static int tabuada(int num1){
        int tabuada;
        for(tabuada=0; tabuada<=10; tabuada=tabuada+1 ){
             System.out.println(num1 + "x" + tabuada + "=" +num1*tabuada);
        }
        return tabuada;
    }
    public static int pa(int an, int a1, int n, int r){
        int pa;
        pa= (an= a1+(n-1)*r);
        return pa;
    }
}
