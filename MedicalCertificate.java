import java.util.Date;

public class MedicalCertificate{
    private String Certificateid;
    private String Name;
    private Date IssueDate;

    public void GenerateCertificate(){
        System.out.println("From class MedicalCertificate = GenerateCertificate");
    }
    public void PrintCertificate(){
        System.out.println("From class MedicalCertificate = PrintCertificate");
    }
}