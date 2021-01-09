package jp.ivan.swadeshnessproject;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.repository.LanguageRepository;
import jp.ivan.swadeshnessproject.service.LanguageServiceImpl;
import lombok.val;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LanguageServiceImplTests {
    @InjectMocks
    private LanguageServiceImpl service;

    @Mock
    private LanguageRepository languageRepository;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void after() {
        languageRepository = null;
        service = null;
    }

    @Test
    public void testLanguageService() {
        // given
        val expectedLanguage = mock(Language.class);
        List<Language> languagesList = Arrays.asList(new Language[] { expectedLanguage });
        LanguageFamily languageFamily = new LanguageFamily();
        when(languageRepository.findAll()).thenReturn(languagesList);

        // when
        val result = service.translate("", languageFamily);

        // then
        assertThat(result).isNull();
    }
}
