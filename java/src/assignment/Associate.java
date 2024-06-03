package assignment;

public class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public int getId() {
        return id;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
}