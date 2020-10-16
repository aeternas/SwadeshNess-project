package jp.ivan.swadeshnessproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "language")
public class Language implements Serializable {
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
