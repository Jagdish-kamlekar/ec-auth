package easycoder.com.ec_auth.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "mst_auth_request")
public class AuthRequest
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "contact",nullable = false, unique = true)
    private String contact;

    @Column(name = "email",nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "is_contact_verified", nullable = false)
    private Boolean isContactVerified = false;

    @Column(name = "is_email_verified", nullable = false)
    private Boolean isEmailVerified = false;

    @Column(name = "usk_id")
    private String uskId;

    @Column(name = "status")
    private Integer status = 0;


    @Column(name = "is_basic_details_submission")
    private Boolean isBasicDetailsSubmission = false;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "role_id")
    private Long roleId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = true)
    private PersonInfo personInfo;

    public AuthRequest(Long id, String contact, String email, String password, Boolean isContactVerified, Boolean isEmailVerified, String uskId, Integer status, Boolean isBasicDetailsSubmission, LocalDateTime createdAt, Long roleId, PersonInfo personInfo) {
        this.id = id;
        this.contact = contact;
        this.email = email;
        this.password = password;
        this.isContactVerified = isContactVerified;
        this.isEmailVerified = isEmailVerified;
        this.uskId = uskId;
        this.status = status;
        this.isBasicDetailsSubmission = isBasicDetailsSubmission;
        this.createdAt = createdAt;
        this.roleId = roleId;
        this.personInfo = personInfo;
    }

    public AuthRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getContactVerified() {
        return isContactVerified;
    }

    public void setContactVerified(Boolean contactVerified) {
        isContactVerified = contactVerified;
    }

    public Boolean getEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public String getUskId() {
        return uskId;
    }

    public void setUskId(String uskId) {
        this.uskId = uskId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getBasicDetailsSubmission() {
        return isBasicDetailsSubmission;
    }

    public void setBasicDetailsSubmission(Boolean basicDetailsSubmission) {
        isBasicDetailsSubmission = basicDetailsSubmission;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
