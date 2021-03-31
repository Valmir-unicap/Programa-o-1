import java.util.Scanner;
 
 public class questao1 {
 
    Scanner entrada = new Scanner(System.in);
 
    public static void main(String[] args) {
        System.out.println("1- Opção de ordem crescente.");
        System.out.println("2- Opção de ordem decrescente.");
        System.out.println("3- Sair.");
 
        System.out.print("Escolha uma opção: ");
 
        int escolha;
        escolha= entrada.nextInt();
 
        if(escolha==1){
            int num, num2;
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            System.out.print("Digite outro número: ");
            num2= entrada.nextInt();
            while(num>=0 && num2<=100){
              num= num + 1;
              System.out.println(num);
              if( num == num2){
                  break;
              }
            }
        }else if(escolha==2){
            int num, num2;
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            System.out.print("Digite outro número: ");
            num2= entrada.nextInt();
            while(num>=0 && num2<=100){
              num= num - 1;
              System.out.println(num);
              if( num == num2){
                  break;
              }
            }
        }else if(escolha==3){
            System.out.println("Tente outra vez. :)");
        }
    }
}
