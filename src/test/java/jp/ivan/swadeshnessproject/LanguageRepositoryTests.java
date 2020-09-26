package jp.ivan.swadeshnessproject;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.repository.LanguageRepository;
import org.apache.commons.codec.language.bm.Lang;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureEmbeddedDatabase
@DataJpaTest
public class LanguageRepositoryTests {
    @Autowired
    private LanguageRepository languageRepository;

    @Test
    void testEmbeddedDatabase() {
        Optional<Language> languageOptional = languageRepository.findById(1L);

        assertThat(languageOptional).hasValueSatisfying(language -> {
            assertThat(language).isNotNull();
            assertThat(language.getId()).isNotNull();
            assertThat(language.getName()).isNotNull();
            assertThat(language.getVersion()).isNotNull();
            assertThat(language.getFamily().getName()).isEqualTo("Slavic");
        });
    }
}
