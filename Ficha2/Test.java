import java.util.Scanner;
import java.util.Arrays;

public class Test
{

    private static int[] lerArrayInt(int n) {
        Scanner sc = new Scanner(System.in);
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Valor na posição " + i  + ": ");
            res[i] = sc.nextInt();
        }
        sc.close();
        return res;
    }

    public static void TestF2Ex1() {
        Scanner sc = new Scanner(System.in);
        F2Ex1 f = new F2Ex1();
        int[] arr1;
        int[] arr2;
        System.out.println("Array1: ");
        arr1 = lerArrayInt(5);
        System.out.println("Array2: ");
        arr2 = lerArrayInt(5);
        int a,b;
        System.out.println("Indice1: ");
        a = sc.nextInt();
        System.out.println("Indice2: ");
        b = sc.nextInt();

        System.out.println("Minimo Arr1:" + f.minimo(arr1));
        System.out.println("Array entre os indices: " + Arrays.toString(f.entreIndicies(arr1, a, b)));
        System.out.println("Comuns Arr1 Arr2:" + Arrays.toString(f.comuns(arr1, arr2)));
        sc.close();
    }

    public static void TestF2Ex2(){
        F2Ex2 f1 = new F2Ex2();

        int[] notas0 = {12,23,34,45,56};
        int[] notas1 = {11,22,33,44,55};
        int[] notas2 = {10,21,32,43,54};
        int[] notas3 = {14,25,36,47,58};
        int[] notas4 = {13,24,35,46,57};

        f1.setNotas(0, notas0);
        f1.setNotas(1, notas1);
        f1.setNotas(2, notas2);
        f1.setNotas(3, notas3);
        f1.setNotas(4, notas4);

        for (int[] res : f1.getNotas()) {
            System.out.println(Arrays.toString(res));
        }

        System.out.println("MediaAluno(0): " + f1.mediaAluno(0));
        System.out.println("MediaNotas(1): " + f1.mediaNotas(1));
        System.out.println("NotaMaisAlta(): " + Arrays.toString(f1.notaMaisAlta()));
        System.out.println("NotaMaisBaixa(): " + Arrays.toString(f1.notaMaisBaixa()));
        System.out.println("NotasAcima(15): " + Arrays.toString(f1.notasAcima(15)));
        System.out.println("MediaMaisAlta(): " + f1.mediaMaisAltaUc());
        System.out.println("toString(): " + f1.toString());
    }

    public static void main(String[] args) {
    }
}