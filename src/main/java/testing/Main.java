package testing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] oi = {100, 14, 73, -24, 99, 0};
        int i = 0;
        int q = 0;
        int p = 0;
        while(i < oi.length) {
            q = 0;
            while(q < oi.length - 1) {
                if(oi[q] < oi[q + 1]) {
                    p = oi[q + 1];
                    oi[q + 1] = oi[q];
                    oi[q] = p;
                }
                q++;
            }
            i++;
            
        }    
        /*i = 0;        
        while(i < oi.length) {
            System.out.print(oi[i] + ".");
            i++;
        }*/

        System.out.println(Arrays.toString(oi));
    }

    //Вношу изменения для тестирования source control.
    


}