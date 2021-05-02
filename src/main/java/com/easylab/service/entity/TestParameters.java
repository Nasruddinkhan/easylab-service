package com.easylab.service.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "test_parameters")
public class TestParameters extends BaseBean implements Serializable {
    private static final long serialVersionUID = 5925479130700377298L;
    @Id
    @Column(name = "parameter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("parameter_id")
    private Long parameterId;

    @Column(name = "parameter_name")
    @JsonProperty("parameter_name")
    private String parameterName;

    @Column(name = "short_description")
    @JsonProperty("short_description")
    private String shortDescription;

    @Column(name = "long_description")
    @JsonProperty("long_description")
    private String longDescription;


    @Column(name = "test_id")
    @JsonProperty("test_id")
    private Long testId;

    @Column(name = "status")
    @JsonProperty("status")
    private String status;

}
