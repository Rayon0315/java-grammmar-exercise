class BankCard {
  protected int deposit;

  public BankCard(int dep) {
      deposit = dep;
  }

  public void show() {
      System.out.println(deposit);
  }
};

class DepositCard extends BankCard {
  public int idk;

  public DepositCard(int dep, int i) {
      super(dep);
      idk = i;
  }
};

class CreditCard extends BankCard {
    public int idk2;

    public CreditCard(int dep, int i2) {
        super(dep);
        idk2 = i2;
    }
}

public class train_1 {
    public static void main(String[] args) {
        DepositCard dep = new  DepositCard(1000, 1);
        CreditCard cre = new CreditCard(2000, 2);
        dep.show();
        cre.show();
    }
}
