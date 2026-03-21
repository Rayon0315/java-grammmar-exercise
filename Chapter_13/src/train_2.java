import java.util.Objects;

enum DayEnum {
    Mon("星期一"), Tue("星期二"), Wed("星期三"), Thu("星期四"),
    Fri("星期五"), Sat("星期六"), Sun("星期日");

    private String chinese;
    private DayEnum(String chinese) {
        this.chinese = this.toString() + " : " + chinese;
    }
    public String getChinese() {
        return chinese;
    }
}

public class train_2 {
    public static void main( String[] args) {
        DayEnum[] days = DayEnum.values();
        for (DayEnum day : days) {
            System.out.println(day.getChinese());
        }
    }
}
