package Complaint_and_Query_Management_System;

public class Issue {
	private int issueId;
	private String issueType;
	private Date dateOfIssue;
	private String issueDescription;
	private int studId;
	
	public Issue() {
		this.issueId = 0;
		this.issueType = "";
		this.dateOfIssue = new Date();
		this.issueDescription = "";
		this.studId = 0;
	}
	
	public Issue(int issueId, String issueType, Date dateOfIssue, String issueDescription, int studId) {
		this.issueId = issueId;
		this.issueType = issueType;
		this.dateOfIssue = dateOfIssue;
		this.issueDescription = issueDescription;
		this.studId = studId;
	}
	
	public Issue(Issue issue) {
		this.issueId = issue.issueId;
		this.issueType = issue.issueType;
		this.dateOfIssue = issue.dateOfIssue;
		this.issueDescription = issue.issueDescription;
		this.studId = issue.studId;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", dateOfIssue=" + dateOfIssue
				+ ", issueDescription=" + issueDescription + ", studId=" + studId + "]";
	}
	
	

}
