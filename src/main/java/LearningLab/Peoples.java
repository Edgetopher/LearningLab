package LearningLab;

import java.util.ArrayList;

public class Peoples {

    ArrayList<Person> personList = new ArrayList<Person>();

    public void add1(Person person){
        personList.add(person);
    }
    public void remove1(Person person){
        personList.remove(person);
    }
    public void remove1(long id){
        for(Person p: personList){
            if (p.getId() == id){
                personList.remove(p);
            }
        }
    }
    public void removeAll(){
        for(Person l: personList){
            personList.remove(l);
        }
    }
    public int count(){
        return personList.size();
    }
    public Object[] toArray(){
       return personList.toArray();
    }

    public String findById(long id){
        String str = "";
        for(Person smal:personList){
            if(smal.getId() == id){
               str = str + smal.getName();
            }
        }
    return str;
    }

    public boolean contains(Person person){
        boolean s;
        if (personList.contains(person)){
            s = true;
        } else {
            s = false;
        }
     return s;}


}
