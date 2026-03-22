import java.lang.reflect.Field;
import com.mr.Demo2;

public class FieldDemo {
    public static void main(String[] args) {
        Demo2 example = new Demo2();
        Class exampleC = example.getClass();
        Field[] declaredFields = exampleC.getDeclaredFields();

        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];

            System.out.println("名称为" + field.getName());

            Class fieldType = field.getType();
            System.out.println("类型为：" + fieldType);

            boolean isTurn = true;
            while (isTurn) {
                try {
                    isTurn = false;
                    System.out.println("修改前的值为：" + field.get(example));

                    if (fieldType.equals(int.class)) {
                        System.out.println("利用setInt()修改");
                        field.setInt(example, 168);
                    } else if (fieldType.equals(float.class)) {
                        System.out.println("利用setFloat()修改");
                        field.setFloat(example, 99.9F);
                    } else if (fieldType.equals(boolean.class)) {
                        System.out.println("利用setBoolean()修改");
                        field.setBoolean(example, true);
                    } else {
                        System.out.println("利用set()修改");
                        field.set(example, "ABC");
                    }

                    System.out.println("修改后的值为：" + field.get(example));
                } catch (Exception e) {
                    System.out.println("在设置成员变量时抛出异常， 下面执行setAccessible()方法");
                    field.setAccessible(true);
                    isTurn = true;
                }
            }
            System.out.println();
        }
    }
}
