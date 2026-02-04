import java.util.Date;

public class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.Waiting;
    private Applicant applicant;

    public Proposal(String code, String title, String text, Date date, Applicant applicant) {
        this.proposal_code = code;
        this.proposal_title = title;
        this.proposal_text = text;
        this.proposal_date = date;
        this.applicant = applicant;
    }

    public void viewProposal() {
        System.out.println("View Proposal");
    }

    public void viewStatus() {
        System.out.println("Status: " + proposal_status);
    }

    public void updateProposal() {
        System.out.println("Update Proposal");
    }

    public void deleteProposal() {
        System.out.println("Delete Proposal");
    }

    public void archiveProposal() {
        System.out.println("Archive Proposal");
    }

    public void viewApplicant() {
        System.out.println("Applicant: " + applicant);
    }

    public void changeStatus(StatusProposal status) {
        this.proposal_status = status;
    }
}
