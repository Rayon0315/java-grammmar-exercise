enum ToiletEnum {
  male("男厕所"), female("女厕所"), helicopter("武装直升机厕所");

  private String toilet;
  private ToiletEnum(String toilet) {
      this.toilet = this.toString() + "----->" + toilet;
  }

    public String getToilet() {
        return toilet;
    }
}

public class exercise_2 {
    public static void main(String[] args) {
        ToiletEnum[] toilets = ToiletEnum.values();
        for (ToiletEnum toilet : toilets) {
            System.out.println(toilet.getToilet());
        }
    }
}
