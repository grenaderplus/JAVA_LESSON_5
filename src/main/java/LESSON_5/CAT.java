package LESSON_5;

public class CAT {
    private String name;
    private String color;
    private int age;

    public CAT(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public CAT(String name) {
        this.name = name;
        this.color = "white";
        this.age = 0;
    }

    public CAT() {
        this("Noname");
    }



    public void info() {
        System.out.printf("Cat %s %s %d\n",name,color,age);
    }

    public void jump() {
        System.out.println("Cat " + name + " jump!");
    }

    public void sleep() {
        System.out.println("Cat " + name + " sleep...");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("age can not be negative");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "CAT{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
