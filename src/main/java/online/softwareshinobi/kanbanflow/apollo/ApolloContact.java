package online.softwareshinobi.kanbanflow.apollo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "apollo_contacts")
public class ApolloContact {

    private static final Logger log = LoggerFactory.getLogger(ApolloContact.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "First Name")
    private String firstName;

    @Column(name = "Last Name")
    private String lastName;

    @Column(name = "Title")
    private String title;

    @Column(name = "Company Name")
    private String companyName;

    @Column(name = "Company Name for Emails")
    private String companyNameForEmails;

    @Column(name = "Email")
    private String email;

    @Column(name = "Email Status")
    private String emailStatus;

    @Column(name = "Primary Email Source")
    private String primaryEmailSource;

    @Column(name = "Primary Email Verification Source")
    private String primaryEmailVerificationSource;

    @Column(name = "Email Confidence")
    private String emailConfidence;

    @Column(name = "Primary Email Catch-all Status")
    private String primaryEmailCatchAllStatus;

    @Column(name = "Primary Email Last Verified At")
    private String primaryEmailLastVerifiedAt;

    @Column(name = "Seniority")
    private String seniority;

    @Column(name = "Departments", columnDefinition = "TEXT")
    private String departments;

    @Column(name = "Sub Departments", columnDefinition = "TEXT")
    private String subDepartments;

    @Column(name = "Contact Owner")
    private String contactOwner;

    @Column(name = "Work Direct Phone")
    private String workDirectPhone;

    @Column(name = "Home Phone")
    private String homePhone;

    @Column(name = "Mobile Phone")
    private String mobilePhone;

    @Column(name = "Corporate Phone")
    private String corporatePhone;

    @Column(name = "Other Phone")
    private String otherPhone;

    @Column(name = "Do Not Call")
    private String doNotCall;

    @Column(name = "Stage", columnDefinition = "TEXT")
    private String stage;

    @Column(name = "Lists", columnDefinition = "TEXT")
    private String lists;

    @Column(name = "Last Contacted")
    private String lastContacted;

    @Column(name = "Account Owner")
    private String accountOwner;

    @Column(name = "# Employees")
    private String numberOfEmployees;

    @Column(name = "Industry")
    private String industry;

    @Column(name = "Keywords", columnDefinition = "TEXT")
    private String keywords;

    @Column(name = "Person Linkedin Url")
    private String personLinkedinUrl;

    @Column(name = "Website", columnDefinition = "TEXT")
    private String website;

    @Column(name = "Company Linkedin Url")
    private String companyLinkedinUrl;

    @Column(name = "Facebook Url", columnDefinition = "TEXT")
    private String facebookUrl;

    @Column(name = "Twitter Url", columnDefinition = "TEXT")
    private String twitterUrl;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Country")
    private String country;

    @Column(name = "Company Address", columnDefinition = "TEXT")
    private String companyAddress;

    @Column(name = "Company City", columnDefinition = "TEXT")
    private String companyCity;

    @Column(name = "Company State", columnDefinition = "TEXT")
    private String companyState;

    @Column(name = "Company Country", columnDefinition = "TEXT")
    private String companyCountry;

    @Column(name = "Company Phone")
    private String companyPhone;

    @Column(name = "Technologies", columnDefinition = "TEXT")
    private String technologies;

    @Column(name = "Annual Revenue")
    private String annualRevenue;

    @Column(name = "Total Funding")
    private String totalFunding;

    @Column(name = "Latest Funding")
    private String latestFunding;

    @Column(name = "Latest Funding Amount")
    private String latestFundingAmount;

    @Column(name = "Last Raised At")
    private String lastRaisedAt;

    @Column(name = "Subsidiary of", columnDefinition = "TEXT")
    private String subsidiaryOf;

    @Column(name = "Subsidiary of (Organization ID)", columnDefinition = "TEXT")
    private String subsidiaryOfOrganizationId;

    @Column(name = "Email Sent")
    private String emailSent;

    @Column(name = "Email Open")
    private String emailOpen;

    @Column(name = "Email Bounced")
    private String emailBounced;

    @Column(name = "Replied")
    private String replied;

    @Column(name = "Demoed")
    private String demoed;

    @Column(name = "Number of Retail Locations")
    private String numberOfRetailLocations;

    @Column(name = "SIC Codes")
    private String sicCodes;

    @Column(name = "NAICS Codes")
    private String naicsCodes;

    @Column(name = "Apollo Contact Id")
    private String apolloContactId;

    @Column(name = "Apollo Account Id")
    private String apolloAccountId;

    @Column(name = "Apollo Record Id")
    private String apolloRecordId;

    @Column(name = "Secondary Email")
    private String secondaryEmail;

    @Column(name = "Secondary Email Source")
    private String secondaryEmailSource;

    @Column(name = "Secondary Email Status")
    private String secondaryEmailStatus;

    @Column(name = "Secondary Email Verification Source")
    private String secondaryEmailVerificationSource;

    @Column(name = "Tertiary Email")
    private String tertiaryEmail;

    @Column(name = "Tertiary Email Source")
    private String tertiaryEmailSource;

    @Column(name = "Tertiary Email Status")
    private String tertiaryEmailStatus;

    @Column(name = "Tertiary Email Verification Source")
    private String tertiaryEmailVerificationSource;

    @Column(name = "Primary Intent Topic")
    private String primaryIntentTopic;

    @Column(name = "Primary Intent Score")
    private String primaryIntentScore;

    @Column(name = "Secondary Intent Topic")
    private String secondaryIntentTopic;

    @Column(name = "Secondary Intent Score")
    private String secondaryIntentScore;

    @Column(name = "Qualify Contact")
    private String qualifyContact;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNameForEmails() {
        return companyNameForEmails;
    }

    public void setCompanyNameForEmails(String companyNameForEmails) {
        this.companyNameForEmails = companyNameForEmails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getPrimaryEmailSource() {
        return primaryEmailSource;
    }

    public void setPrimaryEmailSource(String primaryEmailSource) {
        this.primaryEmailSource = primaryEmailSource;
    }

    public String getPrimaryEmailVerificationSource() {
        return primaryEmailVerificationSource;
    }

    public void setPrimaryEmailVerificationSource(String primaryEmailVerificationSource) {
        this.primaryEmailVerificationSource = primaryEmailVerificationSource;
    }

    public String getEmailConfidence() {
        return emailConfidence;
    }

    public void setEmailConfidence(String emailConfidence) {
        this.emailConfidence = emailConfidence;
    }

    public String getPrimaryEmailCatchAllStatus() {
        return primaryEmailCatchAllStatus;
    }

    public void setPrimaryEmailCatchAllStatus(String primaryEmailCatchAllStatus) {
        this.primaryEmailCatchAllStatus = primaryEmailCatchAllStatus;
    }

    public String getPrimaryEmailLastVerifiedAt() {
        return primaryEmailLastVerifiedAt;
    }

    public void setPrimaryEmailLastVerifiedAt(String primaryEmailLastVerifiedAt) {
        this.primaryEmailLastVerifiedAt = primaryEmailLastVerifiedAt;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getSubDepartments() {
        return subDepartments;
    }

    public void setSubDepartments(String subDepartments) {
        this.subDepartments = subDepartments;
    }

    public String getContactOwner() {
        return contactOwner;
    }

    public void setContactOwner(String contactOwner) {
        this.contactOwner = contactOwner;
    }

    public String getWorkDirectPhone() {
        return workDirectPhone;
    }

    public void setWorkDirectPhone(String workDirectPhone) {
        this.workDirectPhone = workDirectPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCorporatePhone() {
        return corporatePhone;
    }

    public void setCorporatePhone(String corporatePhone) {
        this.corporatePhone = corporatePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getDoNotCall() {
        return doNotCall;
    }

    public void setDoNotCall(String doNotCall) {
        this.doNotCall = doNotCall;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getLists() {
        return lists;
    }

    public void setLists(String lists) {
        this.lists = lists;
    }

    public String getLastContacted() {
        return lastContacted;
    }

    public void setLastContacted(String lastContacted) {
        this.lastContacted = lastContacted;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getPersonLinkedinUrl() {
        return personLinkedinUrl;
    }

    public void setPersonLinkedinUrl(String personLinkedinUrl) {
        this.personLinkedinUrl = personLinkedinUrl;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyLinkedinUrl() {
        return companyLinkedinUrl;
    }

    public void setCompanyLinkedinUrl(String companyLinkedinUrl) {
        this.companyLinkedinUrl = companyLinkedinUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getTotalFunding() {
        return totalFunding;
    }

    public void setTotalFunding(String totalFunding) {
        this.totalFunding = totalFunding;
    }

    public String getLatestFunding() {
        return latestFunding;
    }

    public void setLatestFunding(String latestFunding) {
        this.latestFunding = latestFunding;
    }

    public String getLatestFundingAmount() {
        return latestFundingAmount;
    }

    public void setLatestFundingAmount(String latestFundingAmount) {
        this.latestFundingAmount = latestFundingAmount;
    }

    public String getLastRaisedAt() {
        return lastRaisedAt;
    }

    public void setLastRaisedAt(String lastRaisedAt) {
        this.lastRaisedAt = lastRaisedAt;
    }

    public String getSubsidiaryOf() {
        return subsidiaryOf;
    }

    public void setSubsidiaryOf(String subsidiaryOf) {
        this.subsidiaryOf = subsidiaryOf;
    }

    public String getSubsidiaryOfOrganizationId() {
        return subsidiaryOfOrganizationId;
    }

    public void setSubsidiaryOfOrganizationId(String subsidiaryOfOrganizationId) {
        this.subsidiaryOfOrganizationId = subsidiaryOfOrganizationId;
    }

    public String getEmailSent() {
        return emailSent;
    }

    public void setEmailSent(String emailSent) {
        this.emailSent = emailSent;
    }

    public String getEmailOpen() {
        return emailOpen;
    }

    public void setEmailOpen(String emailOpen) {
        this.emailOpen = emailOpen;
    }

    public String getEmailBounced() {
        return emailBounced;
    }

    public void setEmailBounced(String emailBounced) {
        this.emailBounced = emailBounced;
    }

    public String getReplied() {
        return replied;
    }

    public void setReplied(String replied) {
        this.replied = replied;
    }

    public String getDemoed() {
        return demoed;
    }

    public void setDemoed(String demoed) {
        this.demoed = demoed;
    }

    public String getNumberOfRetailLocations() {
        return numberOfRetailLocations;
    }

    public void setNumberOfRetailLocations(String numberOfRetailLocations) {
        this.numberOfRetailLocations = numberOfRetailLocations;
    }

    public String getSicCodes() {
        return sicCodes;
    }

    public void setSicCodes(String sicCodes) {
        this.sicCodes = sicCodes;
    }

    public String getNaicsCodes() {
        return naicsCodes;
    }

    public void setNaicsCodes(String naicsCodes) {
        this.naicsCodes = naicsCodes;
    }

    public String getApolloContactId() {
        return apolloContactId;
    }

    public void setApolloContactId(String apolloContactId) {
        this.apolloContactId = apolloContactId;
    }

    public String getApolloAccountId() {
        return apolloAccountId;
    }

    public void setApolloAccountId(String apolloAccountId) {
        this.apolloAccountId = apolloAccountId;
    }

    public String getApolloRecordId() {
        return apolloRecordId;
    }

    public void setApolloRecordId(String apolloRecordId) {
        this.apolloRecordId = apolloRecordId;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public String getSecondaryEmailSource() {
        return secondaryEmailSource;
    }

    public void setSecondaryEmailSource(String secondaryEmailSource) {
        this.secondaryEmailSource = secondaryEmailSource;
    }

    public String getSecondaryEmailStatus() {
        return secondaryEmailStatus;
    }

    public void setSecondaryEmailStatus(String secondaryEmailStatus) {
        this.secondaryEmailStatus = secondaryEmailStatus;
    }

    public String getSecondaryEmailVerificationSource() {
        return secondaryEmailVerificationSource;
    }

    public void setSecondaryEmailVerificationSource(String secondaryEmailVerificationSource) {
        this.secondaryEmailVerificationSource = secondaryEmailVerificationSource;
    }

    public String getTertiaryEmail() {
        return tertiaryEmail;
    }

    public void setTertiaryEmail(String tertiaryEmail) {
        this.tertiaryEmail = tertiaryEmail;
    }

    public String getTertiaryEmailSource() {
        return tertiaryEmailSource;
    }

    public void setTertiaryEmailSource(String tertiaryEmailSource) {
        this.tertiaryEmailSource = tertiaryEmailSource;
    }

    public String getTertiaryEmailStatus() {
        return tertiaryEmailStatus;
    }

    public void setTertiaryEmailStatus(String tertiaryEmailStatus) {
        this.tertiaryEmailStatus = tertiaryEmailStatus;
    }

    public String getTertiaryEmailVerificationSource() {
        return tertiaryEmailVerificationSource;
    }

    public void setTertiaryEmailVerificationSource(String tertiaryEmailVerificationSource) {
        this.tertiaryEmailVerificationSource = tertiaryEmailVerificationSource;
    }

    public String getPrimaryIntentTopic() {
        return primaryIntentTopic;
    }

    public void setPrimaryIntentTopic(String primaryIntentTopic) {
        this.primaryIntentTopic = primaryIntentTopic;
    }

    public String getPrimaryIntentScore() {
        return primaryIntentScore;
    }

    public void setPrimaryIntentScore(String primaryIntentScore) {
        this.primaryIntentScore = primaryIntentScore;
    }

    public String getSecondaryIntentTopic() {
        return secondaryIntentTopic;
    }

    public void setSecondaryIntentTopic(String secondaryIntentTopic) {
        this.secondaryIntentTopic = secondaryIntentTopic;
    }

    public String getSecondaryIntentScore() {
        return secondaryIntentScore;
    }

    public void setSecondaryIntentScore(String secondaryIntentScore) {
        this.secondaryIntentScore = secondaryIntentScore;
    }

    public String getQualifyContact() {
        return qualifyContact;
    }

    public void setQualifyContact(String qualifyContact) {
        this.qualifyContact = qualifyContact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StgApolloContact{");
        sb.append("id=").append(id);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", email=").append(email);
        sb.append(", companyName=").append(companyName);
        sb.append('}');
        return sb.toString();
    }
}