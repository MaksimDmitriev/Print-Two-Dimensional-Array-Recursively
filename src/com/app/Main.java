package com.app;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static Set<String> hashSet = new TreeSet<>();

    public static void main(String[] args) {
        // first - array index, second - element index
        int[][] a = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        // n - the size of each array
        // i - array index
        print(a, 0, "", 4);

        Set<String> expected = new TreeSet<>();
        expected.add("111");
        expected.add("112");
        expected.add("113");
        expected.add("114");

        expected.add("121");
        expected.add("122");
        expected.add("123");
        expected.add("124");

        expected.add("131");
        expected.add("132");
        expected.add("133");
        expected.add("134");

        expected.add("141");
        expected.add("142");
        expected.add("143");
        expected.add("144");

        expected.add("211");
        expected.add("212");
        expected.add("213");
        expected.add("214");

        expected.add("221");
        expected.add("222");
        expected.add("223");
        expected.add("224");

        expected.add("231");
        expected.add("232");
        expected.add("233");
        expected.add("234");

        expected.add("241");
        expected.add("242");
        expected.add("243");
        expected.add("244");

        expected.add("311");
        expected.add("312");
        expected.add("313");
        expected.add("314");

        expected.add("321");
        expected.add("322");
        expected.add("323");
        expected.add("324");

        expected.add("331");
        expected.add("332");
        expected.add("333");
        expected.add("334");

        expected.add("341");
        expected.add("342");
        expected.add("343");
        expected.add("344");

        expected.add("411");
        expected.add("412");
        expected.add("413");
        expected.add("414");

        expected.add("421");
        expected.add("422");
        expected.add("423");
        expected.add("424");

        expected.add("431");
        expected.add("432");
        expected.add("433");
        expected.add("434");

        expected.add("441");
        expected.add("442");
        expected.add("443");
        expected.add("444");

        // System.out.println(hashSet.equals(expected));
    }

    static void print(int[][] a, int i, String buffer, final int n) {
        for (int j = 0; j < n; j++) { // iterate over elements
            if (i < a.length) {
                print(a, i + 1, buffer + a[i][j], n);
            } else {
                System.out.println(buffer);
                hashSet.add(buffer);
            }
        }
    }
}
