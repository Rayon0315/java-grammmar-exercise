import java.lang.reflect.*;

import com.mr.Demo3;

public class MethodDemo {
    public static void main(String[] args) {
        Demo3 demo = new Demo3();
        Class demoClass = demo.getClass();
        Method[] declaredMethods = demoClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method method = declaredMethods[i];

            System.out.println("名称为：" + method.getName());
            System.out.println("是否允许带有可变数量的参数：" + method.isVarArgs());

            System.out.println("入口参数类型以此为：");
            Class[] parameterTypes = method.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println(" " + parameterTypes[j]);
            }

            System.out.println("返回值类型为：" + method.getReturnType());

            System.out.println("可能抛出的异常类型有：");
            Class[] exceptionTypes = method.getExceptionTypes();
            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(" " + exceptionTypes[j]);
            }

            boolean isTurn = true;
            while (isTurn) {
                isTurn = false;

                try {
                    if ("staticMethod".equals(method.getName())) {
                        method.invoke(demo);
                    } else if ("publicMethod".equals(method.getName())) {
                        System.out.println("返回值为：" + method.invoke(demo, 168));
                    } else if ("protectedMethod".equals(method.getName())) {
                        System.out.println("返回值为：" + method.invoke(demo, "7", 5));
                    } else if ("privateMethod".equals(method.getName())) {
                        Object[] parameters = new Object[] { new String[]{"哈", "基", "米"} };
                        System.out.println("返回值为：" + method.invoke(demo, parameters));
                    }
                } catch (Exception e) {
                    System.out.println("在执行时抛出异常，下面执行setAccessible()方法");
                    method.setAccessible(true);
                    isTurn = true;
                }
            }

            System.out.println();
        }
    }
}
