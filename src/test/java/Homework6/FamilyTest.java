package Homework6;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    @Test
    public void testToString(){
        Human[] children=new Human[3];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        family.addChild(child1);
        String expected = "Family{" + "mother=null"  + ", father=null" + ", children=" + Arrays.toString(children) + ", pet=null"  + '}';
        assertEquals(expected, family.toString());

    }
    @Test
    public void testDeleteChild(){
        Human[] children=new Human[3];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        Human child2=new Human("Jack","Miller",2015);
        family.addChild(child1);
        family.addChild(child2);
        family.deleteChild(child1);
        Human[] children1=new Human[3];
        children1[0]=child2;
        assertArrayEquals(children1,children);
    }
    @Test
    public void testDeleteChildByIndex(){
        Human[] children=new Human[3];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        Human child2=new Human("Jack","Miller",2015);
        family.addChild(child1);
        family.addChild(child2);
        family.deleteChild(0);
        Human[] children1=new Human[3];
        children1[0]=child2;
        assertArrayEquals(children1,children);
    }
    @Test
    public void testAddChild(){
        Human[] children=new Human[3];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        family.addChild(child1);
        Human[] children1=new Human[3];
        children1[0]=child1;
        assertArrayEquals(children1,children);

    }
    @Test
    public void testCountFamily(){
        Human[] children=new Human[2];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        Human child2=new Human("Jack","Miller",2015);
        family.addChild(child1);
        family.addChild(child2);
        int a=family.countFamily();
        assertEquals(4,a);
    }

}