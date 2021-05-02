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
@Table(name = "appointment_lab_mapping")
public class AppointmentLabMapping extends BaseBean implements Serializable {

    @Id
    @Column(name = "app_lab_mapping_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appLabMappingId;

    @Column(name = "lab_id")
    private Long labId;

    @Column(name = "appointment_id")
    private Long appointmentId;

    @Column(name = "status")
    private String status;

}
