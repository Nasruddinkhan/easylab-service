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
@Table(name = "test_categories")
public class TestCategory extends BaseBean implements Serializable {

    private static final long serialVersionUID = -750249795313971824L;

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("category_id")
    private Long categoryId;

    @Column(name = "category_name")
    @JsonProperty("category_name")
    private String categoryName;

    @Column(name = "short_description")
    @JsonProperty("short_description")
    private String shortDescription;

    @Column(name = "long_description")
    @JsonProperty("long_description")
    private String longDescription;

    @JsonProperty("status")
    @Column(name = "status")
    private String status;


}
