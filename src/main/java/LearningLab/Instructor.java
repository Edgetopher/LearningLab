package LearningLab;

public class Instructor extends Person implements Teacher {
    public void teach(Learner learner, double numOfHours) {
        learner.learn(numOfHours);
    }

    public void lecture(Learner[] learners, double numOfHours) {
        double with = numOfHours/learners.length;
        for (Learner student:learners){
            student.learn(with);
        }

    }

    public Instructor(long id, long name) {
        super(id, name);
    }
}
