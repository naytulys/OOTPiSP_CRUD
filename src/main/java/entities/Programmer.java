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
}
