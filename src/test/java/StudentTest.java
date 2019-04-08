import LearningLab.Learner;
import LearningLab.Person;
import LearningLab.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testImplement(){
        Student stud = new Student(31,12,20);
        boolean expect = true;

        boolean actual = stud instanceof Learner;

        Assert.assertEquals(expect,actual);

    }
    public void testInheritance(){
        Student stud = new Student(31,12,20);
        boolean expect = true;

        boolean actual = stud instanceof Person;

        Assert.assertEquals(expect,actual);

    }
    @Test
    public void testLearn(){
        Student stud = new Student(1,1,40);
        double expect = 80;
        stud.learn(40);
        double actual = stud.getTotalStudyTime();


        Assert.assertEquals(expect,actual,0.001);



    }
}