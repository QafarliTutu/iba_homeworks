package Homework6;


import java.util.Arrays;
import java.util.Objects;

public class Human {

        private String name;
        private String surname;
        private int year;
        private int iq;
        private String[][] schedule;
        private Pet pet;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("vv");
    }

    public Human() {
        }

        public Human(String name, String surname, int year) {
            this.name = name;
            this.surname = surname;
            this.year = year;
        }



        public Human(String name, String surname, int year, int iq, String[][] schedule) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.iq = iq;
            this.schedule = schedule;
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

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setIq(int iq) {
            this.iq = iq;
        }



        public String[][] getSchedule() {
            return schedule;
        }

        public void setSchedule(String[][] schedule) {
            this.schedule = schedule;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", schedule =" + Arrays.deepToString(schedule) +
                    ", pet =" + pet + "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return year == human.year &&
                    iq == human.iq &&
                    Objects.equals(name, human.name) &&
                    Objects.equals(surname, human.surname) &&
                    Arrays.equals(schedule, human.schedule);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(name, surname, year, iq);
            result = 31 * result + Arrays.hashCode(schedule);
            return result;
        }

    }


