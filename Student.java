
import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

   
    public Student() {
      
    }

    public Student(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

  
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

   
    public String getFullName() {
        String fullName = getFirstName() + " ";
        if (!getMiddleName().isEmpty()) {
            fullName += getMiddleName() + " ";
        }
        fullName += getLastName();
        if (!getSuffix().isEmpty()) {
            fullName += " " + getSuffix();
        }
        return fullName;
    }


    public void displayFullName() {
        System.out.println("Full Name: " + getFullName());
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Enter the student's first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter the student's middle name:");
        String middleName = scanner.nextLine();

        System.out.println("Enter the student's last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter the student's suffix:");
        String suffix = scanner.nextLine();

        Student student = new Student(firstName, middleName, lastName, suffix);

       
        student.displayFullName();
    }
}
