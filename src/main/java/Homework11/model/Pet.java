package Homework11.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public  abstract class Pet {
    private Species species;
    private   String nickname;
    private   int age;
    private   int trickLevel;
    Set<String> habits = new HashSet<>();

    public Pet(){
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname=nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, Set habits) {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.habits=habits;
        this.trickLevel=trickLevel;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if(trickLevel>0 && trickLevel<100) {
            this.trickLevel = trickLevel;
        }
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public abstract void respond(String nickname);
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);

    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Objects.hashCode(habits);
        return result;
    }

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }


}
