package LESSON_5;

import jdk.nashorn.internal.ir.CatchNode;
import java.util.Arrays;

public class LESSON_5_HOMEWORK {
    public static void main(String[] args) {
//        CAT cat1 = new CAT("Барсик", "red", 3);
//        cat1.name = "Барсик";
//        cat1.color = "red";
//        cat1.age = 3;

//        CAT cat2 = new CAT("Мурзик", "white", 5);
//        cat2.name = "Мурзик";
//        cat2.color = "white";
//        cat2.age = 5;

//        CAT cat3 = new CAT("Tiger");


//        cat3.info();

//        cat1.getName();
//        cat1.setAge(10);
//
//        CAT.age = 7;

//        cat1.jump();
//        cat1.sleep();
//        cat2.jump();
//        cat2.sleep();

//        CAT[] cats = new CAT[3];
//        cats[0] = new CAT("Barsik","red",3);
//        cats[1] = new CAT("Murzik","white",5);
//
//        System.out.println(Arrays.toString(cats));
//        System.out.println(cats[0].toString());

//      CAT[] cats = {
//              new CAT ("Barsik", "red", 3),
//              new CAT ("Murzik", "white", 3),
//              new CAT ("Bars", "purple",1),
//              new CAT ("Mur", "black", 2)
//      };
//
//      for (int i = 0; i < cats.length; i++){
//          cats[i].jump();
//      }
//
//        for (CAT cat : cats) {
//            cat.sleep();
//        }

//        System.out.println(Math.abs(-4));

//        Employee emp1 = new Employee("Jonh Carter", "Team Leader", "Carter@lead.com", "8(190)431-03-63", 300000, 35);
//        emp1.info();

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Alex Murfie", "Developer", "Murfie@dev.com", "8(999)321-32-21", 150000, 39);
        empArr[1] = new Employee("Elen Donovan", "Developer", "Donovan@dev.com", "8(999)123-23-13", 150000, 29);
        empArr[2] = new Employee("Boris Rutmore", "Marketing Manager", "Rutmore@mark.com", "8(999)890-80-90", 80000, 42);
        empArr[3] = new Employee("Dan Weiss", "Purchasing Manager", "Weiss@purch.com", "8(999)345-45-35", 80000, 54);
        empArr[4] = new Employee("Jim Morriss", "Coordinator", "Morriss@coord.com", "8(999)567-67-57", 80000, 27);

//        for (int i = 0; i < empArr.length; i++) {
//            empArr[i].info();
//        }



        for (int i = 0; i < empArr.length; i++) {
            int j = empArr[i].getAge();
            if (j > 40) {
                empArr[i].info();
            }
        }
    }

}
