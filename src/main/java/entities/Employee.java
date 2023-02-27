package entities;

public class Employee extends Person {
    public enum Education {
        None,
        Middle,
        Height;
    }

    private double salary;
    private int experience;
    private Education education;

    public Employee(int id, Birth  dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position, double salary, int experience, Education education) {
        super(id,dateOfBirth, name, surname, sex, email, address, position);
        this.salary = salary;
        this.experience = experience;
        this.education = education;
    }
}
