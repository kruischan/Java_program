class father {
    public void printinfo() {
        System.out.println("this is father");
    }
}

class son extends father {
    public void printinfo() {
        System.out.println("this is son");
    }
}

class daughter extends father {
    public void printinfo() {
        System.out.println("this is daughter");
    }
}

public class polym {
    public static void main(String args[]) {
        son s = new son();
        daughter d = new daughter();

        father f = s;
        f.printinfo();   
        f = d;
        f.printinfo();   
    }    

    public static void print(father f) {
        f.printinfo();
    } 
}