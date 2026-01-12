public class TestStudentMain {
    public static void main(String[] args) {
        Student std1 = new Student("Id001", "Aom", "comsci", 3.5);
        Student std2 = new Student("Id002", "P", "comsci", 3.2);

        std1.displayInfo();
        std2.displayInfo();

        Student[] students = new Student[3];
        students[0] = new Student("Id003", "Boom", "comsci", 3.0);
        students[1] = new Student("Id004", "Wai", "comsci", 2.8);
        students[2] = new Student("Id005", "Best", "comsci", 2.5);

        for (Student i : students) {
            i.displayInfo();
        }
    }
}
