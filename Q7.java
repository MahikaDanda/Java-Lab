import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    private int fatherAge;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Age cannot be negative");
        }
        this.fatherAge = age;
        
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age should be less than Father's age");
        }
        this.sonAge = sonAge;
        System.out.println("Father's Age: " + fatherAge);
        System.out.println("Son's Age: " + sonAge);
    }
}

public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Father's Age: ");
            int fatherAge = scanner.nextInt();
            Father father = new Father(fatherAge);

            System.out.print("Enter Son's Age: ");
            int sonAge = scanner.nextInt();
            Son son = new Son(fatherAge, sonAge);

        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}