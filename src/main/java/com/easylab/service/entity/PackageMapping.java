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
@Table(name = "package_mapping")
public class PackageMapping extends  BaseBean implements Serializable {

    private static final long serialVersionUID = 5717084120940028202L;
    @Id
    @Column(name = "package_mapping_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("package_mapping_id")
    private Long packageMappingId;

    @Column(name = "package_id")
    @JsonProperty("package_id")
    private Long packageId;

    @Column(name = "test_id")
    @JsonProperty("test_id")
    private Long testId;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;

}
