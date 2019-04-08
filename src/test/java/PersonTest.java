import LearningLab.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
@Test
    public void PersonTest(){
    //Given
    Person person = new Person(2345,9);
    String expected = "2345 9";
    //When
    String actual = person.toString();

    Assert.assertEquals(expected,actual);
}
@Test
public void testSetName(){
    Person person = new Person(31231,32);
    long expect = 4;
    person.setName(4);
    long actual = person.getName();

    Assert.assertEquals(expect,actual);

}
}
