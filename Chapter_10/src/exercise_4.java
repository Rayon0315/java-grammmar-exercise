public class exercise_4 {
    public static void main(String[] args) {
        String[] name = {
                "张三", "李四", "王五", "赵六", "周七",
                "王哲", "白浩", "贾蓉", "慕容阿三", "黄蓉"
        };

        int len = name.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (name[i].charAt(name[i].length() - 1) == name[j].charAt(name[j].length() - 1)) {
                    System.out.println(name[i] + "<--->" + name[j] + "=====" + name[i].charAt(name[i].length() - 1));
                }
            }
        }
    }
}
