public class Clinic {
    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.RegisterVisit();

        Visit obj2 = new Visit();
        obj2.CreateVisit();

        ClinicStaff obj3 = new ClinicStaff();
        obj3.CallQueue();

        Nurse obj4 = new Nurse();
        obj4.CheckInitialSymptoms();

        Doctor obj5 = new Doctor();
        obj5.ExaminePatient();
        obj5.IssueMedicalCertificate();

        MedicalRecord obj6 = new MedicalRecord();
        obj6.SaveRecord();

        MedicalCertificate obj7 = new MedicalCertificate();
        obj7.GenerateCertificate();
        obj7.PrintCertificate();

        Medicine obj8 = new Medicine();
        obj8.Dispense();
        
    }
}