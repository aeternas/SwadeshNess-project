package jp.ivan.swadeshnessproject.service;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    LanguageRepository languageRepository;

    @Override
    public List<Language> translate(String text, LanguageFamily languageFamily) {
        return null;
    }
}
