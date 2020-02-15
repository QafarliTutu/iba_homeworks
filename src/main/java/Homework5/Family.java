package Homework5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    int i;


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    public void addChild(Human child) {
        this.children[i] = child;
        i++;

    }

    public boolean deleteChild(int i) {
        boolean flag = false;
        for (int index = i; index <= children.length - 1; index++) {
            children[i] = children[i + 1];
            index--;
            flag = true;
        }
        if (i < 0 || i > children.length) {
            flag = false;
        }
        return flag;
    }

    public int countFamily() {
        return this.i + 2;
    }
}

