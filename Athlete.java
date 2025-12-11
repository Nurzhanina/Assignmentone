public class Athlete {
    private String fullname;
    private int age;
    private Sport sport;

    public Athlete(String fullname, int age, Sport sport) {
        this.fullname = fullname;
        this.age = age;
        this.sport = sport;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return fullname + " (" + age + " y/o), Sport: " + sport.getName();
    }
}
