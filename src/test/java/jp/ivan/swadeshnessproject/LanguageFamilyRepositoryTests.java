package jp.ivan.swadeshnessproject;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.repository.LanguageFamilyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureEmbeddedDatabase
@DataJpaTest
public class LanguageFamilyRepositoryTests {
    @Autowired
    private LanguageFamilyRepository languageFamilyRepository;

    @Test
    void testEmbeddedDatabase() {
        // when
        Optional<LanguageFamily> languageFamilyOptional = languageFamilyRepository.findById(1L);

        // then
        assertThat(languageFamilyOptional).hasValueSatisfying(family -> {
            assertThat(family).isNotNull();
            assertThat(family.getId()).isNotNull();
            assertThat(family.getName()).isNotNull();
            assertThat(family.getVersion()).isNotNull();
            assertThat(family.getLanguages().stream().findFirst().map(Language::getName).orElse("")).isEqualTo("Russian");
        });
    }
}
