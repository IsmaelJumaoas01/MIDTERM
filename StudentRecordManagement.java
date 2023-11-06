//Ismael Jose Jumao-as BSIT-2B

import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentRecordManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Course course = new Course();

        boolean exitProgram = false;

        while (!exitProgram) {
            System.out.println("\n====================================");
            System.out.println("Student Record Management");
            System.out.println("\nSelection Menu:");
            System.out.println("-------------------------------------");
            System.out.println("1. Create Student Record");
            System.out.println("2. Exit");
            System.out.println("-------------------------------------");
            System.out.print("Enter Selection: ");

            int choice = getIntInput(sc, 2);

            switch (choice) {
                case 1:
                    createStudentRecord(sc, student, course);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public static void createStudentRecord(Scanner sc, Student student, Course course) {
        System.out.println("\n====================================");
        System.out.println("Create Student Record");
        System.out.println("\nEnter Student Details:");
        System.out.println("-------------------------------------");

        student.setStudentID(getIntInput(sc, "Student ID No.: "));
        student.setFirstName(getInput(sc, "First Name: "));
        student.setMiddleName(getInput(sc, "Middle Name: "));
        student.setLastName(getInput(sc, "Last Name: "));
        student.setSuffix(getInput(sc, "Suffix: "));
        student.setAge(getIntInput(sc, "Age: "));
        student.setYearLevel(getIntInput(sc, "Year Level: "));
        student.setPhoneNumber(getIntInput(sc, "Phone Number: "));
        student.setEmail(getInput(sc, "Email: "));

        System.out.println("\nSelect a Course:");
        System.out.println("-------------------------------------");
        System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
        System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
        System.out.println("3. Associate of Computer Technology (ACT)");
        System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
        System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
        System.out.println("-------------------------------------");
        System.out.print("Enter Selection: ");
        int choice = getIntInput(sc, 5);

        switch (choice) {
            case 1:
                course.setCourseName("Bachelor of Science in Information Technology");
                course.setCourseCode("BSIT");
                course.setDepartment("College of Computer Studies Department");
                break;
            case 2:
                course.setCourseName("Bachelor of Science in Computer Science");
                course.setCourseCode("BSCS");
                course.setDepartment("College of Computer Studies Department");
                break;
            case 3:
                course.setCourseName("Associate of Computer Technology");
                course.setCourseCode("ACT");
                course.setDepartment("College of Computer Studies Department");
                break;
            case 4:
                course.setCourseName("Bachelor of Science in Mechanical Engineering");
                course.setCourseCode("BSME");
                course.setDepartment("College of Engineering Department");
                break;
            case 5:
                course.setCourseName("Bachelor of Science in Civil Engineering");
                course.setCourseCode("BSCE");
                course.setDepartment("College of Engineering Department");
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
                return;
        }

        System.out.println("\nStudent record created successfully.");

        recordManagementMenu(sc, student, course);
    }

    public static void recordManagementMenu(Scanner sc, Student student, Course course) {
        while (true) {
            System.out.println("\n====================================");
            System.out.println("Student Record Management");
            System.out.println("\nRecord Management Menu:");
            System.out.println("-------------------------------------");
            System.out.println("1. Update Student Profile Details");
            System.out.println("2. Update Student Course Details");
            System.out.println("3. Display Student Record");
            System.out.println("0. Exit");
            System.out.println("-------------------------------------");
            System.out.print("Enter Selection: ");
            int choice = getIntInput(sc, 3);

            switch (choice) {
                case 1:
                    updateStudentProfile(sc, student);
                    break;
                case 2:
                    updateStudentCourseDetails(sc, course);
                    break;
                case 3:
                    displayStudentRecord(sc, student, course);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public static void updateStudentProfile(Scanner sc, Student student) {
        while (true) {
            System.out.println("\n====================================");
            System.out.println("Student Record Management");
            System.out.println("\nStudent Profile Details Update Selection Menu:");
            System.out.println("-------------------------------------");
            System.out.println("1. Update Student ID number");
            System.out.println("2. Update First name");
            System.out.println("3. Update Middle name");
            System.out.println("4. Update Last name");
            System.out.println("5. Update Suffix");
            System.out.println("6. Update Age");
            System.out.println("7. Update Year Level");
            System.out.println("8. Update Phone Number");
            System.out.println("9. Update Email");
            System.out.println("0. Return");
            System.out.println("-------------------------------------");
            System.out.print("Enter Selection: ");
            int choice = getIntInput(sc, 9);

            switch (choice) {
                case 1:
                    student.setStudentID(getIntInput(sc, "Enter updated Student ID No.: "));
                    break;
                case 2:
                    student.setFirstName(getInput(sc, "Enter updated First Name: "));
                    break;
                case 3:
                    student.setMiddleName(getInput(sc, "Enter updated Middle Name: "));
                    break;
                case 4:
                    student.setLastName(getInput(sc, "Enter updated Last Name: "));
                    break;
                case 5:
                    student.setSuffix(getInput(sc, "Enter updated Suffix: "));
                    break;
                case 6:
                    student.setAge(getIntInput(sc, "Enter updated Age: "));
                    break;
                case 7:
                    student.setYearLevel(getIntInput(sc, "Enter updated Year Level: "));
                    break;
                case 8:
                    student.setPhoneNumber(getIntInput(sc, "Enter updated Phone Number: "));
                    break;
                case 9:
                    student.setEmail(getInput(sc, "Enter updated Email: "));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public static void updateStudentCourseDetails(Scanner sc, Course course) {
        System.out.println("\n====================================");
        System.out.println("Student Record Management");
        System.out.println("\nUpdate Student Course Details");
        System.out.println("\nSelect a Course:");

        System.out.println("-------------------------------------");
        System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
        System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
        System.out.println("3. Associate of Computer Technology (ACT)");
        System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
        System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
        System.out.println("0. To Return");
        System.out.println("-------------------------------------");
        System.out.print("Enter Selection: ");
        int choice = getIntInput(sc, 5);

        switch (choice) {
            case 1:
                course.setCourseName("Bachelor of Science in Information Technology");
                course.setCourseCode("BSIT");
                course.setDepartment("College of Computer Studies Department");
                break;
            case 2:
                course.setCourseName("Bachelor of Science in Computer Science");
                course.setCourseCode("BSCS");
                course.setDepartment("College of Computer Studies Department");
                break;
            case 3:
                course.setCourseName("Associate of Computer Technology");
                course.setCourseCode("ACT");
                course.setDepartment("College of Computer Studies Department");
                break;
            case 4:
                course.setCourseName("Bachelor of Science in Mechanical Engineering");
                course.setCourseCode("BSME");
                course.setDepartment("College of Engineering Department");
                break;
            case 5:
                course.setCourseName("Bachelor of Science in Civil Engineering");
                course.setCourseCode("BSCE");
                course.setDepartment("College of Engineering Department");
                break;
            case 0:
                return;
            
            default:
                System.out.println("Invalid selection. Please try again.");
                return;
        }

        System.out.println("Student Course Details updated successfully.");
    }

    public static void displayStudentRecord(Scanner sc, Student student, Course course) {
    while (true) {
        System.out.println("\n====================================");
        System.out.println("Student Record Management");
        System.out.println("\nStudent Record");
        System.out.println("-------------------------------------");
        System.out.println("1. Return to Record Management Menu");
        System.out.println("0. Exit");
        System.out.println("-------------------------------------");

        System.out.println(student);
        System.out.println("-------------------------------------");
        System.out.println(course);
        System.out.println("-------------------------------------");
        System.out.print("Enter Selection: ");
        int choice = getIntInput(sc, 1);

        switch (choice) {
            case 1:
                return; 
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid selection. Please try again.");
        }
    }
}

    public static String getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.nextLine();
        return input;
    }

    public static int getIntInput(Scanner sc, String prompt) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter an integer: ");
                sc.nextLine();
            }
        }
    }

    public static int getIntInput(Scanner sc, int max) {
        int choice;
        while (true) {
            try {
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice >= 0 && choice <= max) {
                        sc.nextLine();
                        return choice;
                    } else {
                        System.out.print("Invalid input. Please enter a number between 0 and " + max + ": ");
                        sc.nextLine();
                    }
                } else {
                    System.out.print("Invalid input. Please enter a number: ");
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                sc.nextLine();
            }
        }
    }
}

class Student {
    private int studentID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private int yearLevel;
    private int phoneNumber;
    private String email;

    public Student() {

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student Profile Details:\n" +
                "Student ID number: " + studentID + "\n" +
                "First name: " + firstName + "\n" +
                "Middle name: " + middleName + "\n" +
                "Last name: " + lastName + "\n" +
                "Suffix: " + suffix + "\n" +
                "Age: " + age + "\n" +
                "Year Level: " + yearLevel + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private String department;

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student Course Details:\n" +
                "Course Name: " + courseName + "\n" +
                "Course Code: " + courseCode + "\n" +
                "Department: " + department;
    }
} 
