public class LearnString {
    public static void main(String[] args) {
//        String s ="hello";
//        System.out.println(s);
//        s=s.toUpperCase();
//        System.out.println(s);
        String s1 = "hello";
//        String s2 ="Hello";
//        System.out.println(s1==s2);、
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.contains("ll"));
//        System.out.println(s1.contains("11"));
//        System.out.println("hellollo".indexOf("l"));
//        System.out.println("hellollo".lastIndexOf("l"));

        String Str = new String("菜鸟编程:www.runoob.com");
        String Substr1 = new String("runoob");
        String Substr2 = new String("com");

        System.out.println("查找字符串o最后出现的位置：");
        System.out.println(Str.lastIndexOf('o'));

        System.out.println("查找从第14个位置查找字符o最后出现的位置：");
        System.out.println(Str.lastIndexOf('o', 14));

        System.out.println("字符串substr1最后出现的位置：");
        System.out.println(Str.lastIndexOf(Substr1));

        System.out.println("字符串substr2最后出现的位置：");
        System.out.println(Str.lastIndexOf(Substr2));

        System.out.println("从第十五个位置开始搜索字符串substr1最后出现的位置：");
        System.out.println(Str.lastIndexOf(Substr1, 15));

        System.out.println("字符串是否以指定的前缀开始：");
        System.out.println(s1.startsWith("he"));

        System.out.println("字符串是否以指定的前缀开始：");
        System.out.println(s1.startsWith("He"));

        System.out.println("字符串是否以指定的后缀结束：");
        System.out.println(s1.endsWith("lo"));

        System.out.println("提取字符串从第2位开始：");
        System.out.println(s1.substring(2));

        System.out.println("提取字符串从第2位开始到第4位，不包含第4：");
        System.out.println(s1.substring(2, 4));

        String s3 = "   hello， lily  ";
        String s4 = "   hello， lily\u3000";
        System.out.println(s3);
        System.out.println("移除首尾空白字符串：");
        //strip 类似中文的空格字符 \u3000 也会被移除
        System.out.println(s3.strip());
        System.out.println(s4.strip());

        //trim可以移除字符串首尾空白字符，空包字符包括  \t \r \n;没有改变字符串，只是返回了一个新字符串
        System.out.println("  \tHello\r\n ".trim());

        //是否空字符串；长度为空
        System.out.println("".isEmpty());  //true
        System.out.println("    ".isEmpty());  //false

        //是否空白字符串；只有空白字符'
        System.out.println("   ".isBlank());  //true
        System.out.println("\t\n\r   ".isBlank());  //true
        System.out.println("hello \t\n\r   ".isBlank());  //false

        //替换字符串
        System.out.println("hello".replace('l', 's')); //hesso
        System.out.println("hello".replace("ll", "--")); //he--o
        System.out.println("hello".replace("ll", "a")); //he--o
        //通过正则表达式替换
        System.out.println("A,,B;C,D".replaceAll("[\\,\\;\\s]+", ",")); //A,B,C,D
        //分割字符串
        String s5 = "a,b,c,d";
        String[] ss = s5.split("\\,");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }//{"a", "b", "c", "d"}
        //拼接字符串;join 指定的字符串链接字符串数组
        System.out.println("hello," + " hangzhou");
        String[] arr = {"hello", "hangzhou", "autumn"};
        System.out.println(String.join("**", arr));//hello**hangzhou**autumn
        //格式化字符串:formatted()方法和format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串
        //formatted() java13开始
        String s6 = "Hi %s, your score is %d!";
        //System.out.println(s6.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
        //类型转换，把任意基本类型或引用类型转换为字符串，可以使用静态方法valueof；编译器会根据参数自动选择合适的方法
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(54.67));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new Object()));
        //字符串转换为其他类型
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.parseInt("ff", 16));//按十六进制转换，255
        //字符转换为布尔
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("FALSE"));
        //Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：
        System.out.println(Integer.getInteger("java.version"));
        //转换为char[] string 和 char[]
        char[] cs = "Hello".toCharArray();//string 转换为char[]
        String s = new String(cs);//char[]转换为string
        //这是因为通过new String(char[])创建新的String实例时，它并不会直接引用传入的char[]数组，而是会复制一份，所以，修改外部的char[]数组不会影响String实例内部的char[]数组，因为这是两个不同的数组。
        //
        //从String的不变性设计可以看出，如果传入的对象有可能改变，我们需要复制而不是直接引用。


    }
}
