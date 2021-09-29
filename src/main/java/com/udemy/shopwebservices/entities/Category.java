package com.udemy.shopwebservices.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String string;

    @Setter(AccessLevel.NONE)
    @Transient
    private Set<Product> products = new HashSet<>();

    public Category(Long id, String string) {
        this.id = id;
        this.string = string;
    }
}
