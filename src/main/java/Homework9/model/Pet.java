package Homework9.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pet {
    private   String species;
    private   String nickname;
    private   int age;
    private   int trickLevel;
    Set<String> habits = new HashSet<>();

    public Pet(){
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname=nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, Set habits) {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.habits=habits;
        this.trickLevel=trickLevel;
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
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

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
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

    public static void eat(){
        System.out.println("I am eating");
    }
    public static void respond(String nickname){
        System.out.println("Hello, owner.I am - "+ nickname + "." + "I miss you!" );
    }
    public static void foul(){
        System.out.println("I need to cover it up");
    }

}
