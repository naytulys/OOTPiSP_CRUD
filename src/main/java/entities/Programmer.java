package entities;

public class Programmer extends Employee {
    public enum Category {
        Junior,
        Middle,
        Senior;
    }

    public enum ProgSkills {
        C,
        JAVA,
        SWIFT;
    }

    private Category category;
    private ProgSkills progSkills;

    public Programmer(int id, Birth dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position, double salary, int experience, Education education, Category category, ProgSkills progSkills) {
        super(id,dateOfBirth, name, surname, sex, email, address, position, salary, experience, education);
        this.category = category;
        this.progSkills = progSkills;
    }
}
