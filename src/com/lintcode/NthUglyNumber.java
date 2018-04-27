package com.lintcode;

import java.util.ArrayList;
import java.util.List;

public class NthUglyNumber {

	public static void main(String[] args) {
		System.out.println(NthUglyNumber.nthUglyNumber(9));
	}
	
	/**
	 * 要得到第N个丑陋数，最直接的想法就是从1开始递增循环，直到找到第N个丑陋数，但是这样明显开销太大，而且我们没有用到已经生成的丑陋数的信息。
	 * 如果有一个方法能够顺序只生成丑陋数就好了。仔细观察可以发现，丑陋数的因子也必定是丑陋数，它一定是某个丑陋数乘2、3、5得到的。
	 * 但问题在于，小的丑陋数乘5不一定比大的丑陋数乘2要小，我们没法直接使用目前最大的丑陋数来乘2、3、5顺序得到更大的丑陋数。
	 * 不过，我们可以确定的是，小的丑陋数乘2，肯定小于大的丑陋数乘2。
	 * 所以我们使用三个指针，分别记录乘2、3、5得出的目前最大丑陋数，这样我们通过比较这三种最大丑陋数（这里最大是相对于只乘2、只乘3、只乘5三种不同情况下最大的丑陋数），
	 * 就得到了所有数里最大的丑陋数。
	 * @param n
	 * @return
	 */
	public static int nthUglyNumber(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while(res.size() < n){
            int m2 = res.get(i2) * 2;
            int m3 = res.get(i3) * 3;
            int m5 = res.get(i5) * 5;
            int min = Math.min(m2, Math.min(m3, m5));
            res.add(min);
            if(min == m2) i2++;
            if(min == m3) i3++;
            if(min == m5) i5++;
        }
        return res.get(res.size()-1);
    }

}
