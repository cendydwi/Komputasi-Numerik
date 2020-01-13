/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Error;

/**
 *
 * @author NOTHING
 */
public class Error {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int loop1 = 0;
        double loop2=0, loop3=0;
        for(int x = -5; x < 5; x++){
            int fungsi = 2*x-10;
            if(fungsi<0){
                loop1=x+1;
            }
        }
        loop2=loop1;
        for(int i=0;i<=10;i++){
            double fungsi1 = 2*loop2-10;
            if(fungsi1<0){
                loop3=loop2-0.1;
            }
            loop2=loop2+0.1;
        }
        
        System.out.println(loop3);
        
    }
    
}
