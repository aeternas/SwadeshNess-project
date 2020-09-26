package jp.ivan.swadeshnessproject.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "language_family")
@RequiredArgsConstructor
@AllArgsConstructor
public class LanguageFamily {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    @Version
    @Getter
    Long version;

    @Column
    @Getter
    String name;

    @Getter
    @OneToMany(mappedBy = "family")
    List<Language> languages;
}
