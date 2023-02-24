package entities;

public class Designer extends Employee {
    public enum DezSkills {
        HTML,
        CSS,
        Illustrator,
        InDesign;
    }

    public enum DezType {
        Game,
        WEB,
        Graphic;
    }
    private DezSkills dezSkills;
    private DezType dezType;
}
