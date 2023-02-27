package entities;

public class Designer extends Employee {
    public enum Designer_Skills {
        HTML,
        CSS,
        Illustrator,
        InDesign;
    }

    public enum Designer_Type {
        Game,
        WEB,
        Graphic;
    }
    private Designer_Skills designer_Skills;
    private Designer_Type designer_Type;

    public Designer(int id, Birth dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position, double salary, int experience, Education education, Designer_Skills designer_Skills, Designer_Type designer_Type) {
        super(id,dateOfBirth, name, surname, sex, email, address, position, salary, experience, education);
        this.designer_Skills = designer_Skills;
        this.designer_Type = designer_Type;
    }
}
