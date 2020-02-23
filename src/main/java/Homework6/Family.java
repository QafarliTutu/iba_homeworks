package Homework6;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    static { System.out.println("a new class is being loaded Family "); }
    { System.out.println(" a new object is created Family"); }

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family() {
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public void addChilde(Human childe) {

        Human[] another = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            another[i] = children[i];
        }
        another[children.length] = childe;

        children = another;
    }

    public boolean deleteChilde(Human childe) {
        boolean response = false;

        Human[] another = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {

            Human childeIndex = children[i];
            if (childeIndex.equals(childe)) {
                response = true;
                continue;
            }
            another[k++] = children[i];
        }
        children = another;
        for (int i = 0; i < children.length; i++) {
            Human childeIndex = children[i];
            if (childeIndex.equals(childe)) {
                response = false;
            }
        }

        return response;
    }

    public boolean deleteChilde(int index) {
        boolean response = false;

        Human[] another = new Human[children.length - 1];
        Human getIndexHuman = children[index];

        for (int i = 0, k = 0; i < children.length; i++) {
            if (index == i) {
                response = true;
                continue;
            }
            another[k++] = children[i];
        }
        children = another;
        for (int i = 0; i < children.length; i++) {
            Human childeIndex = children[i];
            if (childeIndex.equals(getIndexHuman)) {
                response = false;
            }
        }
        return response;
    }

    public int countFamily() {
        return 2 + children.length;
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

    @Override
    public String toString() {
        return "Family{" + "mother=" + mother + ", father=" + father + ", children=" + Arrays.toString(children) + ", pet=" + pet + '}';
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

    @Override
    protected void finalize() {
        System.out.println("delete Family object");
    }

}


