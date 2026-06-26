package easycoder.com.ec_auth.dto;

import java.time.LocalDate;

public class PersonInfoDto
{
    private Long id;
    private LocalDate dob;
    private Long collegeId;
    private Long personId;
    private String firstName;
    private String lastName;
    private Boolean isBasicDetailsSubmission;
    private Integer status;
    private String employeeId;
    private String remarks;
    private Boolean isPersonBasicDetailSubmission;

    public PersonInfoDto(Long id, LocalDate dob, Long collegeId, Long personId, String firstName, String lastName, Boolean isBasicDetailsSubmission, Integer status, String employeeId, String remarks, Boolean isPersonBasicDetailSubmission) {
        this.id = id;
        this.dob = dob;
        this.collegeId = collegeId;
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isBasicDetailsSubmission = isBasicDetailsSubmission;
        this.status = status;
        this.employeeId = employeeId;
        this.remarks = remarks;
        this.isPersonBasicDetailSubmission = isPersonBasicDetailSubmission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
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

    public Boolean getBasicDetailsSubmission() {
        return isBasicDetailsSubmission;
    }

    public void setBasicDetailsSubmission(Boolean basicDetailsSubmission) {
        isBasicDetailsSubmission = basicDetailsSubmission;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getPersonBasicDetailSubmission() {
        return isPersonBasicDetailSubmission;
    }

    public void setPersonBasicDetailSubmission(Boolean personBasicDetailSubmission) {
        isPersonBasicDetailSubmission = personBasicDetailSubmission;
    }
}
