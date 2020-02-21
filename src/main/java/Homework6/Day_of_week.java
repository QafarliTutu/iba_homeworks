package Homework6;

public enum Day_of_week {
    MONDAY(1,"Monday"),
    TUESDAY(2,"Tuesday"),
    WEDNESDAY(3,"Wednesday"),
    THURSDAY(4,"Thursday"),
    FRIDAY(5,"Friday"),
    SATURDAY(6,"Saturday"),
    SUNDAY(7,"Sunday");

    private int code;
    private String name;

    private Day_of_week(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Day_Of_Week{" + "code=" + code + ", name=" + name + '}';
    }


}
