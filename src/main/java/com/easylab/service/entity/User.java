package com.easylab.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author : Nasruddin khan
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseBean implements Serializable {

    private static final long serialVersionUID = -2844733570939490183L;
    @Id
    @Column(name = "reg_id")
    @JsonProperty("reg_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String regId;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;

    @Column(name = "middle_name")
    @JsonProperty("middle_name")
    private String middleName;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String lastName;

    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    @Column(name = "dob")
    @JsonProperty("dob")
    private LocalDate dob;

    @Column(name = "mobile_no")
    @JsonProperty("mobile_no")
    private String mobileNo;

    @Column(name = "alt_mobile_no")
    @JsonProperty("alt_mobile_no")
    private String altMobileNo;

    @Column(name = "email_id")
    @JsonProperty("email_id")
    private String emailId;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

    @Column(name = "secret_key")
    @JsonProperty("secret_key")
    private String secretKey;

    @Column(name = "company_id")
    @JsonProperty("company_id")
    private String companyId;

    @Column(name = "role")
    @JsonProperty("role")
    private String role;

    @Column(name = "pan_card_no")
    @JsonProperty("pan_card_no")
    private String panCardNo;

    @Column(name = "aadhaar_card_no")
    @JsonProperty("aadhaar_card_no")
    private String aadhaarCardNo;

    @Column(name = "status")
    @JsonProperty("status")
    private String status;

    @Column(name = "is_smartphone")
    @JsonProperty("is_smartphone")
    private Boolean isSmartPhone;

}
