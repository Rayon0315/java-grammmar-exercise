import javax.rmi.ssl.SslRMIClientSocketFactory;

class Miami<T> {
    T name;
    T times;
    T years;

    public void setName(T name) {
        this.name = name;
    }
    public void setTimes(T times) {
        this.times = times;
    }
    public void setYears(T years) {
        this.years = years;
    }

    public T getName() {
        return name;
    }
    public T getTimes() {
        return times;
    }
    public T getYears() {
        return years;
    }

    @Override
    public String toString() {
        return getName() + "-" + getTimes() + "-" + getYears();
    }
}

class Detroit extends Miami<String> {
    @Override
    public String getName() {
        return "底特律活塞队";
    }

    @Override
    public String getTimes() {
        return "3";
    }

    @Override
    public String getYears() {
        return "1989/1990/2004";
    }
}

class Philadelphia extends Miami<String> {
    @Override
    public String getName() {
        return "费城76人队";
    }

    @Override
    public String getTimes() {
        return "3";
    }

    @Override
    public String getYears() {
        return "1955/1967/1983";
    }
}

public class train_4 {
    public static void main(String[] args) {
        Miami<String> miami = new Miami<>();
        miami.setName("迈阿密热火队");
        miami.setTimes("3");
        miami.setYears("2006/2012/2013");

        Detroit detroit = new Detroit();
        Philadelphia philadelphia = new Philadelphia();

        System.out.println(miami);
        System.out.println(detroit);
        System.out.println(philadelphia);
    }
}
