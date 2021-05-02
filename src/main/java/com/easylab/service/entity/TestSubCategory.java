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
@Table(name = "test_sub_categories")
public class TestSubCategory extends BaseBean implements Serializable {

    private static final long serialVersionUID = -5907025417532540312L;

    @Id
    @Column(name = "test_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("test_id")
    private Long testId;

    @Column(name = "test_name")
    @JsonProperty("test_name")
    private String testName;

    @Column(name = "short_description")
    @JsonProperty("short_description")
    private String shortDescription;

    @Column(name = "long_description")
    @JsonProperty("long_description")
    private String longDescription;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;

    @Column(name = "category_id")
    @JsonProperty("category_id")
    private Long categoryId;
}
