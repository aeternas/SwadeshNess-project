package jp.ivan.swadeshnessproject.service;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;

import java.util.List;

public interface LanguageService {
    public List<Language> translate(String text, LanguageFamily languageFamily);
}
