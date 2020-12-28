package jp.ivan.swadeshnessproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "language")
public class LegacyLanguage implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    @Version
    Long version;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name = "family_id")
    @JsonIgnore
    LanguageFamily family;
}
