import LearningLab.*;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void implementTest(){
        Instructor instructor = new Instructor(31,31);
        boolean expect = true;
        boolean actual = instructor instanceof Teacher;
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(321,31);
        boolean expect = true;
        boolean actual = instructor instanceof Person;
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(9,8);
        Student student = new Student(2,2,20);
        double expect = 40;
        instructor.teach(student,20);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expect,actual,0.01);

    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(4,4);
        Student student = new Student(3,20,20);
        Student student1 = new Student(1,2,13);
        Student student2 = new Student(2,5,10);
        Student[] students = {student,student1,student2};
        double expect = 30;

        instructor.lecture(students,30);
       double actual = student.getTotalStudyTime();

       Assert.assertEquals(expect,actual,0.001);

    }

}
