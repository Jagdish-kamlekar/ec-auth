package easycoder.com.ec_auth.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "mst_person_info")
public class PersonInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "college_id")
    private Long collegeId;

    @Column(name = "person_id")
    private Long personId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "is_basic_details_submission")
    private Boolean isBasicDetailsSubmission = false;

    @Column(name = "status")
    private Integer status = 0;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "isPersonBasicDetailSubmission")
    private Boolean isPersonBasicDetailSubmission = false;

    public PersonInfo(Long id, LocalDate dob, Long collegeId, Long personId, String firstName, String lastName, Boolean isBasicDetailsSubmission, Integer status, String employeeId, String remarks, Boolean isPersonBasicDetailSubmission) {
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

    public PersonInfo() {

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

    public Long collegeId() {
        return collegeId;
    }

    public void setSchoolId(Long collegeId) {
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

    public Boolean getIsBasicDetailsSubmission() {
        return isBasicDetailsSubmission;
    }

    public void setIsBasicDetailsSubmission(Boolean isBasicDetailsSubmission) {
        this.isBasicDetailsSubmission = isBasicDetailsSubmission;
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

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public Boolean getBasicDetailsSubmission() {
        return isBasicDetailsSubmission;
    }

    public void setBasicDetailsSubmission(Boolean basicDetailsSubmission) {
        isBasicDetailsSubmission = basicDetailsSubmission;
    }

    public Boolean getPersonBasicDetailSubmission() {
        return isPersonBasicDetailSubmission;
    }

    public void setPersonBasicDetailSubmission(Boolean personBasicDetailSubmission) {
        isPersonBasicDetailSubmission = personBasicDetailSubmission;
    }
}
