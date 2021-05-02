package com.easylab.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @author Nasruddin Khan
 */
@MappedSuperclass
public class BaseBean {

    @Column(name = "created_by")
    @JsonProperty("created_by")
    private String createdBy;

    @Column(name = "created_date")
    @JsonProperty("created_date")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "update_by")
    @JsonProperty("update_by")
    private String updateBy;

    @Column(name = "update_date")
    @JsonProperty("update_date")
    @UpdateTimestamp
    private LocalDateTime  updateDate;
}
