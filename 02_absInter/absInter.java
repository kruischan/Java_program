


abstract class father {
    private int money;
    public int getMoney() { return money; }
    public void setMoney(int m) { money = m; }

    public abstract void study();
}

interface inter1 {
    int i = 10;
    public abstract int getNum();
}

interface inter2 {
    public static String name = "kruis";
    public abstract String getName();
}

class ext extends father implements inter1, inter2 {
    public String getName() { return name; }
    public int getNum() { return i; }
    public void study() { System.out.println("father study."); }
}

class son extends father {
    public void study() {
        System.out.println("implement father's abstract ");
    }
}


public class absInter {
    public static void main(String args[]) {
        son s = new son();
        s.study();

        ext e = new ext();
        System.out.println(e.getName());
        System.out.println(e.getNum());
        System.out.println(e.getMoney());
    }
}

