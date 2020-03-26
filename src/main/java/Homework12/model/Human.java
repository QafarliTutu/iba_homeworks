package Homework12.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String mother;
    private String father;
    private Type type;
    private long birthDate;
    private int iq;
    private Pet pet;
    Map schedule=new HashMap();

    public Human() {
    }

    public Human(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        LocalDate birthdate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate = Timestamp.valueOf(birthdate.atStartOfDay()).getTime();
    }
    public Human(Type type, String name, String surname, String birthDate) {
        this.type = type;
        this.name = name;
        this.surname = surname;
        LocalDate birthdate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate = Timestamp.valueOf(birthdate.atStartOfDay()).getTime();
    }
    public Human(Type type, String name, String surname, String birthDate, int iq) {  //for adoptChild
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        LocalDate birthdate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate = Timestamp.valueOf(birthdate.atStartOfDay()).getTime();
    }

    public Human(String name, String surname, String birthDate, int iq, Map schedule) {
        this.name = name;
        this.surname = surname;
        LocalDate birthdate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate = Timestamp.valueOf(birthdate.atStartOfDay()).getTime();
        this.iq = iq;
        this.schedule = schedule;
    }
    public Human(Type type,String name, String  surname, int birthYear,int birthMonth, int birthDay, int iq) {
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        LocalDate birthdate = LocalDate.of(birthYear,birthMonth,birthDay);
        this.birthDate = Timestamp.valueOf(birthdate.atStartOfDay()).getTime();
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getIq(int i) {
        return iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        LocalDate bdNew = Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        return bdNew;
    }

    public void setBirthDate(String birthDate) {
        LocalDate birthdate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.birthDate = Timestamp.valueOf(birthdate.atStartOfDay()).getTime();
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map getSchedule() {
        return schedule;
    }

    public void setSchedule(Map schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    public String describeAge() {
        LocalDate birthdate = Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
       return birthdate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, mother, father, birthDate, iq, pet, schedule);
    }

    @Override
    public String toString() {
        return  type + ": {" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", birth date=" + describeAge() +
               ", iq=" + iq +
               ", schedule=" + schedule +
               '}';
    }
}
