import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        String[] books = {
                "《明史讲义》", "《明代社会生活史》", "《紫禁城的黄昏》", "《中国的黄金时代》",
                "《国史十六讲》", "《停滞的帝国》", "《唐朝定居指南》", "《明史简述》", "《明史十讲》",
                "《大明风物志》", "《西方眼中的中国》", "《皇帝与秀才》"
        };

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入书名或书名关键字(退出输入曼波)：");
            String name = sc.nextLine();

            if (name.equals("曼波"))
                break;

            System.out.println("-------搜索结果-------");
            for (String book : books) {
                if (book.contains(name)) {
                    System.out.println(book);
                }
            }
            System.out.println("---------------------");
        }
        sc.close();
    }
}
