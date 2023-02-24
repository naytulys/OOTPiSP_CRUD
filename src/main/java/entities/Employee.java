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
}
