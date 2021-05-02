package com.easylab.service.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "lab_master")
public class LabMaster extends BaseBean implements Serializable {

    private static final long serialVersionUID = -5343037800026345267L;
    @Id
    @Column(name = "lab_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long labId;

    @Column(name = "lab_name")
    private String labName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "website_url")
    private String websiteUrl;

    @Column(name = "report_url")
    private String reportUrl;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private String status;

}
