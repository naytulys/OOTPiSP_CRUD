package entities;

public class Manager extends Employee {
    private double bonus;

    public Manager(int id, Birth dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position, double salary, int experiense, Education education, double bonus) {
        super(id,dateOfBirth, name, surname, sex, email, address, position, salary, experiense, education);
        this.bonus = bonus;
    }
}
