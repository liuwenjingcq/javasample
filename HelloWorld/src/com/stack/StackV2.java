package com.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackV2 {
    public static void main(String[] args) {
        String hex = toHex(12500);
        System.out.println("hex = " + hex);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        Deque<String> stack = new LinkedList<>();
        String[] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (n == 0)
            return "0";
        while (n > 0) {
            int tmp = n % 16;
            stack.push(str[tmp]);
            n = n / 16;
        }
        String ans = "";
        while (true) {
            try {
                String tmp = stack.pop();
                ans = ans + tmp;
            } catch (Exception e) {
                break;
            }
        }
        return ans;
    }
}
