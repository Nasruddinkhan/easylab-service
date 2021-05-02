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
@Table(name = "role")
public class Role extends BaseBean implements Serializable {
    private static final long serialVersionUID = -2330322560069362404L;

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "company_Id")
    private String companyId;

    @Column(name = "status")
    private String status;
}
