import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> arrayList = new ArrayList<>();
        List<Student> linkedList = new LinkedList<>();
        List<Student> vector = new Vector<>();

        Student student1 = new Student("Bob", 1, 15);
        Student student2 = new Student("Tom", 2, 17);
        Student student3 = new Student("Jack", 3, 16);
        Student student4 = new Student("Mike", 4, 27);
        Student student5 = new Student("Sam", 5, 19);

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);

        vector.add(student1);
        vector.add(student2);
        vector.add(student3);
        vector.add(student4);
        vector.add(student5);

        System.out.println("=====ArrayList=====");
        for(Student st : arrayList){
            System.out.println(st);
        }
        System.out.println("=====LinkedList=====");
        for(Student st : linkedList){
            System.out.println(st);
        }
        System.out.println("=====Vector=====");
        for(Student st : vector){
            System.out.println(st);
        }

        linkedList.addAll(arrayList);

        System.out.println("=====new LinkedList=====");
        for(Student st: linkedList){
            System.out.println(st);
        }

        System.out.println("=====Third element each collection=====");
        System.out.println(arrayList.get(2));
        System.out.println(linkedList.get(2));
        System.out.println(vector.get(2));

        arrayList.remove(3);
        System.out.println("=====ArrayListAfrerRemove=====");
        for(Student st : arrayList){
            System.out.println(st);
        }


        System.out.println("=====SubListFrom3to7=====");
        for(Student st : linkedList.subList(3,7)){
            System.out.println(st);
        }

        System.out.println("=====Sort=====");
        linkedList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        for (Student st : linkedList){
            System.out.println(st);
        }

    }
}
