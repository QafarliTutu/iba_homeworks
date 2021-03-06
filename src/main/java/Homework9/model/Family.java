package Homework9.model;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    List<Human> children = new ArrayList<>();
    Set<Pet> pets = new HashSet<>();

    public Family(){
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
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

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void addChild(Human child) {
        children.add(child);

    }
    public void deleteChild(Human name) {
        children.remove(name);
    }
    public void deleteChild(int index) {
       children.remove(index);
    }

    public int countFamily() {
        int n=children.size();
        return n+2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pets);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pets +
                ", children=" + children +
                '}';
    }

}
