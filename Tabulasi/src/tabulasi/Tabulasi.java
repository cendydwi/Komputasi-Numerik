/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabulasi;

/**
 *
 * @author cendy
 */
public class Tabulasi {
    
    static double fungsi(double x){
        double fungsi = 2*x-10;
        return fungsi;
    }
    
    public static void main(String[] args) {
        System.out.println("Fungsi: 2x - 10");
        
        double loop1 = 0, loop2=0, loop3=0, loop4=0, loop5=0, loop6=0;
        for(int x = -5; x < 5; x++){
            double fungsi = fungsi(x);
            if(fungsi<0){
                loop1=x+1;
            }
        }
        loop2=loop1;
        System.out.printf("Hasil 1: %.1f\n",loop2);
        
        for(int x = 0; x <= 10; x++){
            double fungsi = fungsi(loop2);
            if(fungsi==0 || fungsi<0){
                loop3=loop2;
                break;
            }
            loop2=loop2-0.1;
        }
        System.out.printf("Hasil 2: %.1f\n",loop3);
        
        for(int x = 0; x <= 10; x++){
            double fungsi = fungsi(loop3);
            if(fungsi==0 || fungsi<0){
                loop4=loop3;
                break;
            }
            loop3=loop3-0.01;
        }
        System.out.printf("Hasil 3: %.1f\n",loop4);
        
        for(int x = 0; x <= 10; x++){
            double fungsi = fungsi(loop4);
            if(fungsi==0 || fungsi<0){
                loop5=loop4;
                break;
            }
            loop4=loop4-0.01;
        }
        System.out.printf("Hasil 4: %.1f\n",loop5);
        
        for(int x = 0; x <= 10; x++){
            double fungsi = fungsi(loop5);
            if(fungsi==0 || fungsi<0){
                loop6=loop5;
                break;
            }
            loop5=loop5-0.01;
        }
        System.out.printf("Hasil 4: %.1f\n",loop6);
        
    }
    
}
