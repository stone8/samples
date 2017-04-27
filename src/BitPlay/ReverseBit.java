package BitPlay;

import java.util.ArrayList;

/**
 * Created by wenhongliu on 11/30/16.
 * Reverse bits of an 32 bit unsigned integer

 Example 1:

 x = 0,

 00000000000000000000000000000000
 =>        00000000000000000000000000000000
 return 0

 Example 2:

 x = 3,

 00000000000000000000000000000011
 =>        11000000000000000000000000000000
 return 3221225472

 Since java does not have unsigned int, use long
 */
public class ReverseBit {

    public long reverse(long a) {

        long sum = 0;
        int digit =0;
        for(int i = 0; i<32; i++){
            if((a&1) != 0)
                digit = 1;
            else
                digit = 0;
            a >>= 1;

            sum += digit*((long) Math.pow(2.0, 32-i-1));
        }
        return sum;

    }

    public static void main(String[] args){

        System.out.printf("%d\n", new ReverseBit().reverse(3L));

    }
}
