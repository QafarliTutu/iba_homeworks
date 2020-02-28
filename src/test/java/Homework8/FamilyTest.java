package Homework8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class FamilyTest {
    @Test
  public void testAddChild(){
      Human child1=new Human("Alex","Miller",2016);
      Human child2=new Human("Martin","Miller",2019);
      List<Human> children = new ArrayList<>();
      children.add(child1);
      children.add(child2);
      int a=children.size();
      int b=2;
      assertEquals(b,a);
  }
  @Test
  public void testDeleteChildByName(){
      Human child1=new Human("Alex","Miller",2016);
      Human child2=new Human("Martin","Miller",2019);
      List<Human> children = new ArrayList<>();
      children.add(child1);
      children.add(child2);
      Family family=new Family();
      family.setChildren(children);
      family.deleteChild(child1);
      int a=children.size();
      int b=1;
      assertEquals(b,a);


  }
    @Test
    public void testDeleteChildByIndex(){
        Human child1=new Human("Alex","Miller",2016);
        Human child2=new Human("Martin","Miller",2019);
        List<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        Family family=new Family();
        family.setChildren(children);
        family.deleteChild(0);
        int a=children.size();
        int b=1;
        assertEquals(b,a);
    }
    @Test
    public void testCountFamily(){
        Human child1=new Human("Alex","Miller",2016);
        Human child2=new Human("Martin","Miller",2019);
        List<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        Family family=new Family();
        family.setChildren(children);
        int a=family.countFamily();
        int b=4;
        assertEquals(b,a);
    }
    @Test
    public void testToString(){
        Family family=new Family();
        List<Human> children = new ArrayList<>();
        Human child1=new Human("Alex","Miller",2016);
        children.add(child1);
        family.setChildren(children);
        String expected="Family{" +
                "mother=null"  +
                ", father=null" +
                ", pet=[]" +
                ", children=" + children +
                '}';
        assertEquals(expected,family.toString());
    }

}