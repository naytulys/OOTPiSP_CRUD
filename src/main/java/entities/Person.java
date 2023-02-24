package entities;

public abstract class Person {
    public enum Sex {
        Male,
        Female;
    }

    public enum Position {
        Student,
        Manager,
        Designer,
        Programmer,
        Tester;
    }

    private Integer id;
    private Birth dateOfBirth;
    private String name;
    private String surname;
    private Sex sex;
    private String email;
    private Address address;
    private Position position;
}
