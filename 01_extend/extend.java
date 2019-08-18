class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }

    public void printInfo() {
        System.out.println("age: " + this.age);
    }

    public Person() {System.out.println("call Person()");}
    public Person(int age) {
        this.age = age;
        System.out.println("call Person(int age)");
    }
}

class student extends Person {
    private String school;

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }

    public student(String school) {
        super(5);
        System.out.println("student class construct.");
        this.school = school;
    }

    public void printInfo() {
        System.out.println("school: " + this.school + ", "
        + "age: " + getAge());      
    }
}

class father {
    private int money;

    public int getMoney() { return money; }
    public void setMoney(int m) { this.money = m; }

    public void printInfo() { System.out.println("this father");}
    private void printInfo2() {System.out.println("this father");}
}

class son extends father {
    public void printInfo() { System.out.println("this son"); }
    public void printfInfo2() { System.out.println("this son"); }
}

public class extend {
    public static void main(String args[]) {
    /*    Person p = new Person();
        p.setAge(-1);
        System.out.println(p.getAge());

        student stu = new student("mykruis");
        stu.setAge(10);
        System.out.println(stu.getAge());

        stu.printInfo();
    */
        
        
    }
}