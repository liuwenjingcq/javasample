package com.stack;

/**
 * stack 先进后出
 * 把元素压栈：push(E)/addFirst(E)；
 * 把栈顶的元素“弹出”：pop(E)/removeFirst()；
 * 取栈顶元素但不弹出：peek(E)/peekFirst()。
 * stack jvm在处理java方法调用的实际通过这种数据结构维护方法调用的层次
 * 调用栈有容量限制，嵌套过多会造成溢出 stackOverflowError
 */
public class StackV1 {
    public static void main(String[] args) {
       foo(123);
    }

    static String foo(int x) {
        return "F-" + bar(x + 1);
    }

    static int bar(int x) {
        return x << 2;
    }
}
/**
 * 计算中带括号的数学表达式实际是中缀表达式  1+2 *（9-5）
 * 在计算机执行的时候，编译器把中缀转换为后缀表达式  1 2 9 5 - * +
 * 扫描后缀表达式  1 2 9 5 push栈
 * 遇到-  pop顶上两个元素 9 -5 = 4，把4push栈
 * 遇到*  pop顶上两个元素 2*4 =8 ，把8 push栈
 * 遇到+  pop顶上两个元素 1+8=9 ，把9push栈
 * 扫描结束后，没有计算了，弹出唯一的元素 结果是9
 */
