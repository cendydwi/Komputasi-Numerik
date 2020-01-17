package interpolasi;

/**
 *
 * @author cendy
 */
public class Interpolasi {
    static double rumus(int x, int x0, int x1, int y0, int y1){
        double rumus = y0+((y1-y0)/(x1-x0))*(x-x0);
        return rumus;
    }

    public static void main(String[] args) {
        int x = 4, x0 = x-1, x1= x+1;
        int y0= 3, y1= 3;
        double y;
        y = rumus(x, x0, x1, y0, y1);
        System.out.println(y);
    }
    
}
