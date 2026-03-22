package com.mr;

public class Demo3 {
    static void staticMethod() {
        System.out.println("staticMethod()执行了捏");
    }

    public int publicMethod(int i) {
        System.out.println("publicMethod()执行了捏");
        return i * 100;
    }

    protected int protectedMethod(String s, int i) throws NumberFormatException {
        System.out.println("protectedMethod()执行了捏");
        return Integer.valueOf(s) + i;
    }

    private String privateMethod(String ...strings) {
        System.out.println("privateMethod()执行了捏");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
}
