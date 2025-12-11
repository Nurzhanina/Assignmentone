public class Sport {
    private String name;
    private int difficultyLevel; // 1–10

    public Sport(String name, int difficultyLevel) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return name;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "Sport: " + name + " (difficulty " + difficultyLevel + ")";
    }
}

