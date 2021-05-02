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
@Table(name = "assign_role")
public class AssignRole extends BaseBean implements Serializable {

    private static final long serialVersionUID = -7723345007205238601L;
    @Id
    @Column(name = "assign_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignRoleId;

    @Column(name = "role_id")
    private Long roleId;


    @Column(name = "user_id")
    private Long userId;

}
