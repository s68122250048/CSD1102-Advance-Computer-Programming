public class Student {
    private String studentId;
    private String name;
    private String major;
    private Double gpa;

    public Student(String studenId, String name, String major, Double gpa) {
        this.studentId = studenId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.print("รหัสนักศึกษา: "+studentId);
        System.out.print("ชื่อนักศึกษา: "+name);
        System.out.print("สาขา: "+major);
        System.out.print("เกรดเฉลี่ย: "+gpa);
        System.out.println();
    }
}
