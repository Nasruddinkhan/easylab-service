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
@Table(name = "test_packages")
public class TestPackage extends BaseBean implements Serializable {

    private static final long serialVersionUID = -9175340723031003985L;

    @Id
    @Column(name = "package_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;

    @Column(name = "package_name")
    private String packageName;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "long_description")
    private String longDescription;

    @Column(name = "package_amount")
    private Double packageAmount;

    @Column(name = "status")
    private String status;


}
