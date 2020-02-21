package Homework6;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private   Species species;
    private   String nickname;
    private   int age;
    private   int trickLevel;
    private   String[] habits;




    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.habits=habits;
        this.trickLevel=trickLevel;
    }

    public Pet(Species species,String nickname) {
        this.species = species;
        this.nickname=nickname;
    }
    public Pet(){

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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
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
                ", habits=" + Arrays.toString(habits) +
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
                Objects.equals(nickname, pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
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
