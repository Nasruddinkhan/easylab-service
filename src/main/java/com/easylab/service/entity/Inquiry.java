package com.easylab.service.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inquiry")
public class Inquiry {
    @Id
    @Column(name = "inq_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inqId;
    @Column(name = "name")
    private String name;
    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "status")
    private String status;
    @Column(name = "company_Id")
    private Long companyId;
}
