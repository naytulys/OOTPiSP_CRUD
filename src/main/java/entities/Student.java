package entities;

public class Student extends Person {
    private String university;
    private String faculty;
    private String specialisation;
    private int course;
    private String group;

    public Student(int id, Birth dateOfBirth, String name, String surname, Sex sex, String email, Address address, Position position, String university, String faculty, String specialisation, int course, String group) {
        super(id,dateOfBirth, name, surname, sex, email, address, position);
        this.university = university;
        this.faculty = faculty;
        this.specialisation = specialisation;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", course=" + course +
                ", group=" + group +
                "} " + super.toString();
    }
}
