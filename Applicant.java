public class Applicant {
    private int applicant_id;
    private String applicant_name;
    private String applicant_address;
    private Gender applicant_gender;
    private char applicant_tel;

    public Applicant(int id, String name, String address, Gender gender, char tel) {
        this.applicant_id = id;
        this.applicant_name = name;
        this.applicant_address = address;
        this.applicant_gender = gender;
        this.applicant_tel = tel;
    }

    public void insertApplicant() {
        System.out.println("Insert Applicant");
    }

    public void updateApplicant() {
        System.out.println("Update Applicant");
    }
}
