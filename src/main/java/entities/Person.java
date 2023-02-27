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

    public Person(int id, Birth dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.email = email;
        this.address = address;
        this.position = position;
    }
}
