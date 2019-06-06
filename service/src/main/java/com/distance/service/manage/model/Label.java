package com.distance.service.manage.model;

import com.distance.service.common.model.History;
import com.distance.service.project.model.Project;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@DynamicInsert
@DynamicUpdate
@Data
public class Label extends History<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @ManyToMany(cascade = CascadeType.REFRESH, mappedBy = "labels")
    private List<Project> projects;
}
