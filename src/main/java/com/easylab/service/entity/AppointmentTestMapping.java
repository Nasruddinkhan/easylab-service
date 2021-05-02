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
@Table(name = "appointment_test_mapping")
public class AppointmentTestMapping extends BaseBean implements Serializable {

    private static final long serialVersionUID = -3551257536687524381L;
    @Id
    @Column(name = "app_test_mapping_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appTestMappingId;

    @Column(name = "test_id")
    private Long testId;

    @Column(name = "package_id")
    private Long packageId;

    @Column(name = "status")
    private String status;


}
