import LearningLab.Peoples;
import LearningLab.Person;
import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    @Test
    public void addTest(){
        Peoples peoples = new Peoples();
        Peoples op = new Peoples();
        Person person = new Person(23,32);
        boolean expect = false;
        peoples.add1(person);
        boolean actual = peoples.equals(op);

        Assert.assertEquals(expect,actual);

    }
    @Test
    public void removeTest(){
        Peoples peoples = new Peoples();
        Peoples oo = new Peoples();
        Person person = new Person(312,312);
        oo.add1(person);
        peoples.add1(person);
        boolean expect = false;
        oo.remove1(person);
        boolean actual = peoples.equals(oo);

        Assert.assertEquals(expect,actual);
    }
    @Test
    public void testFindById(){
        Peoples peoples = new Peoples();
        Person q = new Person(25,2131);
        peoples.add1(q);
        String expect = "2131";
        String actual = peoples.findById(25);

        Assert.assertEquals(expect,actual);
    }
}
