package Homework4;

import java.util.Arrays;


public class Pet {

     private   String species;
     private   String nickname;
     private   int age;
     private   int trickLevel;
     private   String[] habits;


     public Pet(String species,String nickname,int age,int trickLevel,String[] habits) {
          this.species=species;
          this.nickname=nickname;
          this.age=age;
          this.habits=habits;this.trickLevel=trickLevel;
     }

     public Pet(String species,String nickname) {
          this.species = species;
          this.nickname=nickname;
     }
     public Pet(){

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


