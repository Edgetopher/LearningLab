package LearningLab;

public class Student extends Person implements Learner {
private double totalStudyTime;

    public Student(long id, long name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime = numberOfHours + totalStudyTime;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
