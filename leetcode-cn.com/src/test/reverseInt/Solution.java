package test.reverseInt;

import java.math.BigInteger;

/**
 * Created by Phony on 2018/6/15.
 */
public class Solution {
    public int reverse(int x) {
        String str = String.valueOf(x);
        StringBuffer sb = null;
        if (str.lastIndexOf("-") == -1) {
            sb = new StringBuffer(str);
            sb.reverse();
        } else {
            sb = new StringBuffer(str.substring(1));
            sb.reverse();
            sb.insert(0, "-");
        }
        BigInteger res = new BigInteger(sb.toString());
        BigInteger max = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger min = new BigInteger(String.valueOf(Integer.MIN_VALUE));
        int result = 0;
        if (res.compareTo(max) == 1 || res.compareTo(min) == -1) {
            result = 0;
        } else {
            result = res.intValue();
        }

        return result;
    }

    public int reverse2(int x) {
        boolean negative = x < 0;
        if (negative) x = -x;
        long r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (negative) r = -r;
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
        return (int) r;
    }
}
