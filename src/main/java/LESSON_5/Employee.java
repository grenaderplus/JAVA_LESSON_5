package LESSON_5;

public class Employee {
    String name;
    String position;
    String mail;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("Team member %s\nposition %s\nemail/pfone number %s / %s\nsalary %d\nage %d", name,position,mail,phone,salary,age);
    }

}
