package Homework7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private Family family;
    private Human child1 = new Human("Alice","Miller",2013);
    private Human child2=new Human("Jack","Miller",2015);
    private Human[] children1=new Human[3];

    @BeforeEach
    public void BeforeEach(){
        this.family=new Family();
        Human[] children=new Human[3];
        family.setChildren(children);
        family.addChild(child1);
        family.addChild(child2);
    }
    @Test
    public void testDeleteChild(){
        family.deleteChild(child1);
        children1[0]=child2;
        assertArrayEquals(children1,family.getChildren());
    }
    @Test
    public void testDeleteChildByIndex(){
        family.deleteChild(0);
        children1[0]=child2;
        assertArrayEquals(children1,family.getChildren());
    }
    @Test
    public void testAddChild(){
        children1[0]=child1;
        children1[1]=child2;
        assertArrayEquals(children1,family.getChildren());
    }
    @Test
    public void testCountFamily(){
        assertEquals(4,family.countFamily());
    }
    @Test
    public void testToString(){
        String expected = "Family{" + "mother=null"  + ", father=null" + ", children=" + Arrays.toString(family.getChildren()) +  '}';
        assertEquals(expected, family.toString());
    }
    @Test
    public  void testForEquals(){
        Human woman1= new Woman();
        woman1.setName("Isabel");
        woman1.setSurname("Miller");
        Human woman2= new Woman();
        woman2.setName("Lucy");
        woman2.setSurname("Miller");
        assertTrue(woman1.equals(woman2));
    }

}