package jp.ivan.swadeshnessproject.service;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegacyLanguageServiceImpl implements LanguageService {
    @Override
    public List<Language> translate(String text, LanguageFamily languageFamily) {
        return null;
    }
}
