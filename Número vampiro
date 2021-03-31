public class NumerosVampiros {
 
    public static void main(String[] args) {
        System.out.println(vampiro(1260));
    }
 
    public static int qtdDigitos(int n) {
        int result = 0;
        while (n > 0) {
            result = result + 1;
            n = n / 10;
        }
        return result;
    }
 
    public static int inverter(int n) {
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        return result;
    }
 
    public static double potencia(double base, int expoente) {
        int i;
        double result = 1;
        if (expoente == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else {
            if (expoente < 0) {
                expoente = -expoente;
                base = 1 / base;
            }
            for (i = 1; i <= expoente; i = i + 1) {
                result = result * base;
            }
            return result;
        }
    }
 
    public static boolean vampiro(int n) {
        int qd = qtdDigitos(n);
        if (qd < 4 || qd % 2 != 0) {
            return false;
        }
        int fator = (int) potencia(10, qd / 2);
        int n1 = n / fator;
        int n2 = n % fator;
        int n1Inv = inverter(n1);
        int n2Inv = inverter(n2);
        return n1 * n2 == n || n1Inv * n2 == n ||
                n1 * n2Inv == n || n1Inv * n2Inv == n;
    }
 
}
