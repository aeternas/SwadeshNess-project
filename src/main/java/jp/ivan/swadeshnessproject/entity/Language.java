package jp.ivan.swadeshnessproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "language")
public class Language implements Serializable {
    @Id
    @Column
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
}
