package interpolasi;

/**
 *
 * @author cendy
 */
public class Interpolasi {
    static double rumus(double x, double x0, double x1, double y0, double y1){
        double rumus = y0+((y1-y0)/(x1-x0))*(x-x0);
        return rumus;
    }

    public static void main(String[] args) {
        double x = 2.1;
        int x0 = (int) (x-1), x1= (int) (x+1);
        double y0= 1.5, y1= 2.5;
        double y;
        System.out.println("x= "+x);
        System.out.println("x0= "+x0);
        System.out.println("x1= "+x1);
        System.out.println("y0= "+y0);
        System.out.println("y1= "+y1);
        y = rumus(x, x0, x1, y0, y1);
        System.out.println("y= "+y0+"+"+"(("+y1+"-"+y0+")/("+x1+"-"+x0+"))*("+x+"-"+x0+")");
        System.out.println("y= "+y);
    }
    
}
