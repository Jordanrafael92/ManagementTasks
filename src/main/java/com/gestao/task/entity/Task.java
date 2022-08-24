package com.gestao.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
   // @NotNull(message="{NotNull.Task.name}")
    private String name;

    @Column
    //@NotNull(message="{NotNull.Task.description}")
    private String description;

}