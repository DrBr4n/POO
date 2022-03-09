
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;


public class Test
{

    public static void testCelsiusParaFarenheit() {
        Exercicio_II f = new Exercicio_II();
        Scanner sc = new Scanner(System.in);

        double gc, gf;
        System.out.println("Temp em C: ");
        gc = sc.nextFloat();
        gf = f.celsiusParaFarenheit(gc);
        System.out.println("Temp em F: " + gf); 

        sc.close();
    }

    public static void testMaximoNumeros() {
        Exercicio_II f = new Exercicio_II();
        Scanner sc = new Scanner(System.in);

        int a, b, r;
        System.out.println("Int a: ");
        a = sc.nextInt();
        System.out.println("Int b: ");
        b = sc.nextInt();
        r = f.maximoNumeros(a, b);
        System.out.println("Maximo entre a e b: " + r); 

        sc.close();
    }
    
    public static void testCriaDescricaoConta() {
        Exercicio_II f = new Exercicio_II();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Saldo: "); 
        double saldo = sc.nextDouble();
        String res = f.criaDescricaoConta(nome, saldo);

        System.out.println(res); 
        sc.close();
    }

    public static void testEurosParaLibras() {
        Exercicio_II f = new Exercicio_II();
        Scanner sc = new Scanner(System.in);

        double valor, taxa, resultado;
        System.out.println("Valor em €: ");
        valor = sc.nextFloat();
        System.out.println("Taxa de conversão: ");
        taxa = sc.nextFloat();
        resultado = f.eurosParaLibras(valor, taxa);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
    
    public static void testMedia() {
        Exercicio_II f = new Exercicio_II();
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Valor a: ");
        a = sc.nextInt();
        System.out.println("Valor b: ");
        b = sc.nextInt();
        int[] res;
        res = f.media(a,b);
        System.out.println("Resultado: " + Arrays.toString(res)); 
        
        sc.close();
    }

    public static void testFactorial() {
        Exercicio_II f = new Exercicio_II();
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Valor: ");
        a = sc.nextInt();
        long res = f.factorial(a);
        System.out.println("Fatorial: " + res); 
        
        sc.close();
    }

    public static void testTempoGasto() {
        Exercicio_II f = new Exercicio_II();
        System.out.println("Tempo gasto: " + f.tempoGasto() + " milisegundos");
    }

    
    public static void main(String[] args) {

    }
}
