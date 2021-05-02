package com.easylab.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentsDto  {

    @JsonProperty("appointment_id")
    private Long appointmentId;

    @JsonProperty("patient_id")
    private Long patientId;


    @JsonProperty("appointment_date")
    private LocalDate appointmentDate;

    @JsonProperty("start_time")
    private LocalTime startTime;

    @JsonProperty("end_time")
    private LocalTime endTime;

    @JsonProperty("referred_by")
    private String referredBy;

    @JsonProperty("total_amounts")
    private Double totalAmounts;

    @JsonProperty("discount_amount")
    private Double discountAmount;

    @JsonProperty("discount_reason")
    private String discountReason;

    @JsonProperty("assign_to")
    private Long assignTo;

    @JsonProperty("status")
    private String status;

}
