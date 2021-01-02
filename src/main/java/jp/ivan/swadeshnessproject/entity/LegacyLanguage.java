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
public class LegacyLanguage implements Serializable {
    Long id;

    Long version;

    String name;

    LanguageFamily family;
}
