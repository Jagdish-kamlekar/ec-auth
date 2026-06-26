package easycoder.com.ec_auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class AuthRequestDto {
    private Long id;

    @NotBlank(message = "Contact is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid mobile number")
    private String contact;


    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;


    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 20, message = "Password must be between 8 and 20 characters")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).*$", message = "Password must contain uppercase, lowercase, digit and special character")
    private String password;

    private Boolean isContactVerified;
    private Boolean isEmailVerified;
    private String uskId;
    private Integer status;
    private Boolean isBasicDetailsSubmission;
    private LocalDateTime createdAt;
    private Long roleId;
    private PersonInfoDto personInfo;

    public AuthRequestDto(Long id, String contact, String email, String password, Boolean isContactVerified, Boolean isEmailVerified, String uskId, Integer status, Boolean isBasicDetailsSubmission, LocalDateTime createdAt, Long roleId, PersonInfoDto personInfo) {
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

    public PersonInfoDto getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfoDto personInfo) {
        this.personInfo = personInfo;
    }
}
