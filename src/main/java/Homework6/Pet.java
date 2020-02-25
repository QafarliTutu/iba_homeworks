package Homework6;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    static{ System.out.println("a new class is being loaded Pet "); }
    { System.out.println(" a new object is created Pet"); }

    private PetType species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(PetType species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(PetType species, String nickname, int age, int trickLevel) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }



    public PetType getSpecies() {
        return species;
    }

    public void setSpecies(PetType species) {
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

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    @Override
    public String toString() {
        return "Pet{" + "species=" + species + ", nickname=" + nickname + ", age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + '}';
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