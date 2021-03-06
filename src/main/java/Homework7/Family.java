package Homework7;


import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    int i;

    public Family() {
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

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

    public Family(Human mother,Human father) {
        this.mother = mother;
        this.father = father;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children);
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

    public boolean deleteChild(Human child) {
        boolean response=false;
        for (int i = 0; i < children.length; i++) {
            Human childIndex = children[i];
            if (childIndex.equals(child)) {
                for(int j = i; j < children.length - 1; j++){
                    children[j] = children[j+1];
                    response=true;
                }
                break;
            }
        }return response;
    }

    public boolean deleteChild(int index) {
        boolean response = false;
        for (int i = 0; i < children.length; i++) {
            if (index == i) {
                for(int j = i; j < children.length - 1; j++){
                    children[j] = children[j+1];
                    response=true;
                }
                break;
            }
        }
        return response;
    }



    public int countFamily() {
        return this.i + 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
