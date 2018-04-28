package com.zz.arithmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 使用随机算法产生一个数，要求把1-1000W之间这些数全部生成。
 * （考察高效率，解决产生冲突的问题）
 */
public class TestRandom {
    public static void createRandom() {

        Random random = new Random();
        long start = System.currentTimeMillis();

        int value = 1000000;

        ArrayList<Integer> list = new ArrayList<Integer>(value);
        for (int j = 1; j <= value; ++j) {
            list.add(j);
        }

        int index = 0;
        int count = 0;
        int tmp = 0;
        while (value > 0) {
            index = random.nextInt(value);
            // System.out.println(list.get(index));
            tmp = list.get(count + index);
            list.set(count + index, list.get(count));
            list.set(count, tmp);
            ++count;
            --value;
        }

        long end = System.currentTimeMillis();

        //----验证是否正确
        Collections.sort(list);
        int i = 0, size = list.size();
        for (; i < size; ++i) {
            if (list.get(i) != (i + 1))
                System.out.println(i + "error" + list.get(i));
        }
        //----验证是否正确


        System.out.println("creat3------");
        System.out.println("执行耗时 : " + (end - start) / 1000f + " 秒 ");
        System.out.println("集合大小为" + list.size());
    }

    public static void createRandom4() {

        Random random = new Random();
        long start = System.currentTimeMillis();

        int value = 10000000;

        int[] list = new int[value];

        for (int j = 0; j < value; ++j) {
            list[j] = j + 1;
        }

        int index = 0;
        int count = 0;
        int tmp = 0;
        while (value > 0) {
            index = random.nextInt(value);
//             System.out.println(list[count + index]);
            tmp = list[count + index];
            list[count + index] = list[count];
            list[count] = tmp;
            ++count;
            --value;
        }

        long end = System.currentTimeMillis();

        //----验证是否正确
//        Collections.sort(list);
//        int i = 0, size = list.length;
//        for (; i < size; ++i) {
//            if (list[i] != (i + 1))
//                System.out.println(i + "error" + list[i]);
//        }
        //----验证是否正确

        System.out.println("creat4------");
        System.out.println("执行耗时 : " + (end - start) / 1000f + " 秒 ");
        System.out.println("完了，集合大小为" + list.length);
    }
}
