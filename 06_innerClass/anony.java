
interface inter {
    public abstract void printInfo();
} 

class ncls implements inter {
    public void printInfo() {
        System.out.println("this bingo");
    }
}

public class anony {
    public static void main(String args[]) {
        ncls n = new ncls();
        print(n);

        print(new ncls() {
            public void printInfo() {
                System.out.println("this ncls noname");
            }
        });
    }

    public static void print(inter ine) {
        ine.printInfo();
    }
}

