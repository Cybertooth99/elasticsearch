package com.elasticsearch.project.entity;

import com.elasticsearch.project.util.ProjectConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = ProjectConstants.COMPENSATION_ENTITY)
public class Compensation {
    @Id
    private String id;
    private String timeStamp;
    private String employer;
    private String location;
    private String jobTitle;
    private String yearsAtEmployer;
    private String yearsOfExperience;
    private Double annualBasePay;
    private Double signingBonus;
    private Double annualBonus;
    private String annualStockValueOrBonus;
    private String gender;
    private String additionalComments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getYearsAtEmployer() {
        return yearsAtEmployer;
    }

    public void setYearsAtEmployer(String yearsAtEmployer) {
        this.yearsAtEmployer = yearsAtEmployer;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Double getAnnualBasePay() {
        return annualBasePay;
    }

    public void setAnnualBasePay(Double annualBasePay) {
        this.annualBasePay = annualBasePay;
    }

    public Double getSigningBonus() {
        return signingBonus;
    }

    public void setSigningBonus(Double signingBonus) {
        this.signingBonus = signingBonus;
    }

    public Double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(Double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public String getAnnualStockValueOrBonus() {
        return annualStockValueOrBonus;
    }

    public void setAnnualStockValueOrBonus(String annualStockValueOrBonus) {
        this.annualStockValueOrBonus = annualStockValueOrBonus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }
}
