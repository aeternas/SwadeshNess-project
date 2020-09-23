package jp.ivan.swadeshnessproject.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Language implements Serializable {
    @Id
    @Column
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    @Version
    Long version;

    @Column
    String name;
}
