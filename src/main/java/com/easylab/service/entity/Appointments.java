package com.easylab.service.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "appointments")
public class Appointments extends BaseBean implements Serializable {

    private static final long serialVersionUID = -4541204037627219236L;
    @Id
    @Column(name = "appointment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @Column(name = "patient_id")
    private Long patientId;


    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "referred_by")
    private String referredBy;

    @Column(name = "total_amounts")
    private Double totalAmounts;

    @Column(name = "discount_amount")
    private Double discountAmount;

    @Column(name = "discount_reason")
    private String discountReason;

    @Column(name = "assign_to")
    private Long assignTo;

    @Column(name = "status")
    private String status;

}
