
/**
 * Write a description of class Exercicio_II here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Date;

public class Exercicio_II
{
    public double celsiusParaFarenheit(double graus) {
        return graus*1.8 + 32;
    }

    public int maximoNumeros(int a, int b) {

        if (a >= b) 
            return a;
        
        else return b;
    }

    public String criaDescricaoConta(String nome, double saldo) {

        return "Nome: " + nome + " Saldo: " + String.valueOf(saldo);

    }

    public double eurosParaLibras(double valor, double taxaConversao) {
        return valor*taxaConversao;
    }

    public int[] media(int a, int b) {
        int[] res = {0,0,0};
        if(a > b) {
            res[0] = a;
            res[1] = b;
        } else {
            res[0] = b;
            res[1] = a;
        }
        res[2] = (a+b)/2;

        return res;
    }

    public long factorial(int num) {

        long res = 1;

        for(int i = 1; i < num; i++) {
            res += res * i;
        }

        return res;
    }

    public long tempoGasto() {

        Date now = new Date();
        long t1 = now.getTime();

        int res = 1;
        for(int i = 1; i < 500000; i++) 
            res += res * i;

        now = new Date();
        long t2 = now.getTime();

        return t2 - t1;

    }
}
