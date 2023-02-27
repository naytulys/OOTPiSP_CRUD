package entities;

public class Tester extends Employee {
    public enum TestType {
        Manual,
        Automated;
    }

    private TestType testType;

    public Tester(int id, Birth dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position, double salary, int experience, Education education, TestType testType) {
        super(id, dateOfBirth, name, surname, sex, email, address, position, salary, experience, education);
        this.testType = testType;
    }
}
