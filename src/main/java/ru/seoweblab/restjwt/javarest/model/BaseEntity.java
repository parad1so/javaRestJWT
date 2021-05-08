package ru.seoweblab.restjwt.javarest.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@MappedSuperclass //супер класс не нужна отдельная таблица
@Data // lombok генерит get set и тд pojo
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "created")
    private Data created;

    @LastModifiedDate
    @Column(name = "updated")
    private Data updated;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusEntity statusEntity;
}
