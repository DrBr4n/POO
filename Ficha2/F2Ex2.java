import java.util.Arrays;

public class F2Ex2
{

    private int[][] notasTurma = new int[5][5];


    public void setNotas(int aluno, int[] notas) {
        this.notasTurma[aluno] = Arrays.copyOf(notas, notas.length);
    }

    public int[] getNotas(int aluno) {
        return this.notasTurma[aluno];
    }

    public int[][] getNotas() {
        return this.notasTurma;
    }

    public int somaUc(int uc) {
        int res = 0;

        for (int[] notas : getNotas()) res += notas[uc];
        
        return res;
    }

    public int mediaAluno(int aluno) {
        int res = 0;

        for (int nota : getNotas(aluno)) res += nota;

        res /= getNotas(aluno).length;

        return res;
    }

    public int mediaNotas(int uc) {
        int res = 0;

        for (int[] notas : getNotas()) res += notas[uc];

        res /= getNotas(uc).length;

        return res;
    }

    public int[] notaMaisAlta() {
        int[] max = {0,0,0,0,0};

        for (int[] notas : getNotas()) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > max[i]){
                    max[i] = notas[i];
                }
            }
        }

        return max;
    }


    public int[] notaMaisBaixa() {
        int[] min = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};

        for (int[] notas : getNotas()) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < min[i]){
                    min[i] = notas[i];
                }
            }
        }

        return min;
    }

    public int[] notasAcima(int valor) {
        int[] res = {};

        for (int[] notas : getNotas()) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > valor){
                    res = Arrays.copyOf(res, res.length + 1);
                    res[res.length - 1] = notas[i];
                }
            }
        }
        return res;
    }


    public int mediaMaisAltaUc() {
        int[] res = {0,0,0,0,0};

        for (int[] notas : getNotas()) {
            for (int i = 0; i < notas.length; i++) {
                res[i] += notas[i];
            }
        }

        res[0] /= 5;
        res[1] /= 5;
        res[2] /= 5;
        res[3] /= 5;
        res[4] /= 5;

        int max = Integer.MIN_VALUE;
        int maxInd = 0;

        for (int i = 0; i < res.length; i++) {
            if (res[i] > max) {
                max = res[i];
                maxInd = i;
            }
        }
        
        return maxInd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int [] notas : this.getNotas()) {
            sb.append(Arrays.toString(notas));
            sb.append("\n");
        }

        return sb.toString();
    }

}
