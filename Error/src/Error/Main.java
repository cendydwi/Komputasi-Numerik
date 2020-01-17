package Error;

public class Main {
    public static void main(String[] args) {
        double[][] nilai = new double[4][6];
        int mad = 0,mape = 0, sse = 0;
        
        nilai[0][0]=70;
        nilai[0][1]=60;
        nilai[1][0]=80;
        nilai[1][1]=70;
        nilai[2][0]=50;
        nilai[2][1]=80;
        nilai[3][0]=60;
        nilai[3][1]=70;
        System.out.println("Y  | YP | |e| | er | e^2 | akar^2 e^2 |");
        for (int i = 0; i < 4; i++) {
            nilai[i][2] = nilai[i][0] - nilai[i][1];
            nilai[i][3] = (nilai[i][2]/nilai[i][0]) * 100;
            nilai[i][4] = nilai[i][2] * nilai[i][2];
            nilai[i][5] = Math.sqrt(nilai[i][4]);
            mad = (int) (mad + nilai[i][2]);
            mape = (int) (mape + nilai[i][3]);
            sse = (int) (sse + nilai[i][5]);
            System.out.println((int) nilai[i][0]+" | "+(int) nilai[i][1]+" |  "+(int) nilai[i][2]+" | "+(int) nilai[i][3]+" | "+(int) nilai[i][4]+" | "+(int) nilai[i][5]);
        }
        System.out.println("Mean Absolute Deviasi(MAD)= "+mad);
        System.out.println("Mean Absolute Package Error(MAPE)= "+mape);
        System.out.println("Sum Square Error(SSE)= "+sse);
    }
}
