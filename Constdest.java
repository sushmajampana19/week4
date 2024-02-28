import java.util.Scanner;

class Student {
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;

    void displaydetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Sem Percentage: " + semPercentage);
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
    }

    Student() {
        System.out.println("The Student ID has been Created !");
    }
}

public class Constdest {
    public static void main(String[] args) {
        Student sushma = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        sushma.fullName = input.nextLine();

        System.out.print("Enter the Roll Number: ");
        sushma.rollNum = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter the Sem percentage: ");
        sushma.semPercentage = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the College Name: ");
        sushma.collegeName = input.nextLine();

        System.out.print("Enter the College Code: ");
        sushma.collegeCode = input.nextInt();

        input.close();

        sushma.displaydetails();
    }
}
