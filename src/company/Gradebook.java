package company;

public class Gradebook {
   private double averageScore;
    private int course;
    private int numberOfGradebook;

    public Gradebook(double averageScore, int course, int numberOfGradebook) {
        this.averageScore = averageScore;
        this.course = course;
        this.numberOfGradebook = numberOfGradebook;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public int getCourse() {
        return course;
    }

    public int getNumberOfGradebook() {
        return numberOfGradebook;
    }

    @Override
    public String toString() {
        return "Gradebook{" +
                "averageScore=" + averageScore +
                ", course=" + course +
                ", numberOfGradebook=" + numberOfGradebook +
                '}';
    }
}