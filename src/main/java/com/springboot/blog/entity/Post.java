package com.springboot.blog.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name="post", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="title", nullable = false)
    private String title;
    @Column(name="description", nullable = false)
    private String description;
    @Column(name="content", nullable = false)
    private String Content;
    @CreatedDate
    @Column(name="DateTime")
    private Date dataTime;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private Set<Comment> comments = new HashSet<>();

}
