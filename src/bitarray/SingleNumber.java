package bitarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wenhongliu on 12/1/16.
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example :

 Input : [1 2 2 3 1]
 Output : 3
 */
public class SingleNumber {

    public int singleNumber(final List<Integer> a) {
        int x = a.get(0);

        for(int i = 1; i<a.size(); i++){
            x ^= a.get(i);
        }
        return x;

    }

    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a = Arrays.asList(1, 2, 2, 3, 1);

        System.out.printf("%d\n", new SingleNumber().singleNumber(a));

    }

}
