enum MonthEnum {
    Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
};

public class train_1 {
    public static void main(String[] args) {
        MonthEnum[] months = MonthEnum.values();
        for (MonthEnum month : months) {
            System.out.println(month + " : " + (month.ordinal() + 1));
        }
    }
}
