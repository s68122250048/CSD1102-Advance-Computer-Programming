import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department d = new Department(1, "IT");
        User u = new User(1, d, "admin", "1234",
                "Kittiwat", Gender.M, "kittiwat@email.com", RoleUser.Manager);

        Applicant a = new Applicant(1, "Thomas", "Bangkok", Gender.M, '9');
        Proposal p = new Proposal("P001", "Request", "New System", new Date(), a);
        Report r = new Report(101, new Date(), p);

        u.userLogin();
        p.changeStatus(StatusProposal.Accepted);
        r.createReports();
    }
}
