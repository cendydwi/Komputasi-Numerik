package regulafalsi;

public class RegulaFalsi {
    static double fungsi(double x){
        double fungsi = (x*x*x)+(x*x)-(3*x)-3;
        return fungsi;
    }
    
    static double x3(double x1, double x2, double f1, double f2){
        double x3;
        x3 = ((x1*f2)-(x2*f1))/(f2-f1);
        return x3;
    }
    
    public static void main(String[] args) {
        double[] x = new double[2];
        double[] hasil = new double[2];
        double x3 = 0;
        double fungsi, tengah;
        
        for(int i=-5; i<=5;i++){
            fungsi = fungsi(i);
            if(fungsi<0){
                x[0]=i;
                hasil[0] = fungsi(x[0]);
                x[1]=i+1;
                hasil[1] = fungsi(x[1]);
            }
        }
        
        
        System.out.println("x1= "+x[0]+"\nx2= "+x[1]+"\nf(x1)= "+hasil[0]+"\nf(x2)= "+hasil[1]);
        
        x3 = x3(x[0], x[1], hasil[0], hasil[1]);
        System.out.printf("x3= %.1f\n",x3);
        fungsi=fungsi(x3);
        System.out.printf("f(x3)= %.1f\n",fungsi);
        
        if(fungsi>hasil[0]){
            tengah = fungsi;
        }else{
            tengah = fungsi;
        }
        System.out.printf("Hasil: %.1f\n",tengah);
    }
    
}
