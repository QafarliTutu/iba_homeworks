package Homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class FamilyTest {
    private Family family;
    private Human child1=new Human("Alex","Miller",2016);
    private Human child2=new Human("Martin","Miller",2019);
    private List<Human> children = new ArrayList<>();

    @BeforeEach
    public void BeforeEach(){
        this.family=new Family();
        children.add(child1);
        children.add(child2);
        family.setChildren(children);
    }
    @Test
    public void testAddChild(){
      assertEquals(2, children.size());
    }
    @Test
    public void testDeleteChildByName(){
      family.deleteChild(child1);
      assertEquals(1, children.size());
     }
    @Test
    public void testDeleteChildByIndex(){
        family.deleteChild(0);
        assertEquals(1,children.size());
    }
    @Test
    public void testCountFamily(){
        assertEquals(4,family.countFamily());
    }
    @Test
    public void testToString(){
        String expected="Family{" +
                "mother=null"  +
                ", father=null" +
                ", pet=[]" +
                ", children=" + children +
                '}';
        assertEquals(expected,family.toString());
    }

}