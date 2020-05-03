package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person
{
    private String certificateNumber;
    private LocalDate issueDate;
    private RegisterOffice issueDepartment;

    public Child() {
    }

    public Child(String surName, String givenName, String patronymic, LocalDate datOfBirth) {
        super(surName, givenName, patronymic, datOfBirth);
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public RegisterOffice getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(RegisterOffice issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    @Override
    public String toString() {
        return "Child{" +
                "certificateNumber='" + certificateNumber + '\'' +
                ", issueDate=" + issueDate +
                ", issueDepartment=" + issueDepartment +
                "} " + super.toString();
    }
}
