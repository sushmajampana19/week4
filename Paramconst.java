class Student {
    public String fullName;
    double semPercentage;

    Student() {
        System.out.println("College Name = MVGR");
        System.out.println("College Code = 33");
    }

    Student(String fullName, double semPercentage) {
        System.out.println("Name = " + fullName);
        System.out.println("Sem Percentage = " + semPercentage);
    }
}

public class Paramconst {
    public static void main(String[] args) {
        Student sushma = new Student();
        Student sushmajampana = new Student("sushma", 91.7);
    }
}

