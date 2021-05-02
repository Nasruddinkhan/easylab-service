package com.easylab.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "billing_invoice")
public class BillingAndInvoice extends BaseBean implements Serializable {

    private static final long serialVersionUID = 8947432794274402362L;
    @Id
    @JsonProperty("billing_id")
    @Column(name = "billing_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billingId;

    @JsonProperty("appointment_id")
    @Column(name = "appointment_id")
    private Long appointmentId;

    @JsonProperty("advance_amount")
    @Column(name = "advance_amount")
    private Double advanceAmount;

    @JsonProperty("due_ammount")
    @Column(name = "due_ammount")
    private Double dueAmount;

    @JsonProperty("payment_mode")
    @Column(name = "payment_mode")
    private String paymentMode;

    @JsonProperty("payment_date")
    @Column(name = "payment_date")
    private LocalDate paymentDate;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;


}
