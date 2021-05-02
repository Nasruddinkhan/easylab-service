package com.easylab.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentLabMappingDto {

    @JsonProperty("app_lab_mapping_id")
    private Long appLabMappingId;

    @JsonProperty("lab_id")
    private Long labId;

    @JsonProperty("appointment_id")
    private Long appointmentId;

    @JsonProperty("status")
    private String status;

}
