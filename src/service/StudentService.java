package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Mike", 3.8));
        students.add(new Student(2, "Jessy", 1.9));
        students.add(new Student(3, "Soul", 3.5));
        students.add(new Student(4, "Skyler", 1.7));
        students.add(new Student(5, "Wolter", 3.9));
    }

    public void removeLowGPA() {
        for (Student student : students) {
            if (student.getGpa() < 2.0) {
                students.remove(student);
            }
        }
    }

    public void findHighestGPA() {
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > best.getGpa()) {
                best = s;
            }
        }
        System.out.println("Highest GPA: " + best);
    }

    public void insertAtIndex() {
        int id = students.size() + 1;
        students.add(2, new Student(id, "New Student", 3.2));
    }

    public void printStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
