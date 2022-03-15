import java.util.Arrays;

public class F2Ex1
{
    /***
     * Pré-condição: valores.length > 0
     */
    public int minimo(int[] values) {
        int min = Integer.MAX_VALUE;

        for(int v : values) {
            if(v < min) min = v;
        }

        return min;
    }

    public int[] entreIndicies(int[] values, int a, int b) {

        return Arrays.copyOfRange(values, a, b + 1);
    }

    public int[] comuns(int[] a, int[] b) {
        int[] res = new int[Integer.min(a.length, b.length)];
        int len = 0;
        boolean found = false;
        
        for (int va : a) {
            found = false;
            for (int i = 0; i < b.length && !found; i++) {
                if(va == b[i]) {
                    res[len++] = va;
                    found = true;
                }
            }
        }
        return Arrays.copyOfRange(res, 0, len);
    }

}
