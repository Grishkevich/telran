package org.telran.hw_8;

import java.util.Set;
import java.util.TreeSet;

public class TaskTwo {
    public static void main(String[] args) {
        String s1 = "svkfuirSdflfDgpqzcjr";
        String s2 = "sjvuwhdgcbnxbvplsdfgvkljsedfkljQrivBBdkcueqfdvlforknbmnxndbfwerkjh";

        Set<String> stringsSet = new TreeSet<>();

        for (var i = 0; i < s1.length(); i++) {
            stringsSet.add(s1.charAt(i) + "");
        }

        for (var i = 0; i < s2.length(); i++) {
            stringsSet.add(s2.charAt(i) + "");
        }

        System.out.println(stringsSet); // [B, D, Q, S, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, u, v, w, x, z]
    }
}
