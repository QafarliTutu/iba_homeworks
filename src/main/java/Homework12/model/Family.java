package Homework12.model;



import java.util.*;

public class Family  {
    private Human mother;
    private Human father;
    private int id;
    private static int count = 0;
    List<Human> children = new ArrayList<>();
    Set<Pet> pets = new HashSet<>();

    public Family(){

    }

    public Family(Human mother, Human father) {
        this.id = ++count;
        this.mother = mother;
        this.father = father;

    }

    public Family(Human mother, Human father, List<Human> children) {
        this.id = ++count;
        this.mother = mother;
        this.father = father;
        this.children = children;

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

    public Set<Pet> getPet() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String prettyFormat() {
        return String.format("ID:%d Family:\n  \t\t%s\n  \t\t%s\n  \t\tchildren:\n  \t\t\t\t%s\n  \t\tpets: \t%s", id, mother,father,childs(),pets);
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
    public StringBuilder childs(){
        StringBuilder sb = new StringBuilder();
        for(Human child : children){
            sb.append(child);
            sb.append("\n");
            sb.append("\t");
            sb.append("\t");
            sb.append("\t");
            sb.append("\t");
        }
        return sb;


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
        return prettyFormat();
    }
}
