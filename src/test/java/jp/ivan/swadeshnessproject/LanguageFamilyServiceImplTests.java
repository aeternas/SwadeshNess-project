package jp.ivan.swadeshnessproject;

import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.repository.LanguageFamilyRepository;
import jp.ivan.swadeshnessproject.service.LanguageFamilyServiceImpl;
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

public class LanguageFamilyServiceImplTests {
    @InjectMocks
    private LanguageFamilyServiceImpl service;

    @Mock
    private LanguageFamilyRepository familyRepository;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void after() {
        familyRepository = null;
        service = null;
    }

    @Test
    public void testLanguageFamilyService() {
        // given
        val expectedLanguageFamily = mock(LanguageFamily.class);
        List<LanguageFamily> familyList = Arrays.asList(new LanguageFamily[] { expectedLanguageFamily });
        when(familyRepository.findAll()).thenReturn(familyList);

        // when
        val result = service.findAll();

        // then
        assertThat(result).hasSize(1);
        assertThat(result.get(0)).isEqualTo(expectedLanguageFamily);
    }
}