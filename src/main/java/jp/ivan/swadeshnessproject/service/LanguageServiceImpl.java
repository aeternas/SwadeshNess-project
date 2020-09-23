package jp.ivan.swadeshnessproject.service;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl {
    @Autowired
    LanguageRepository languageRepository;

    public List<Language> findAll() {
        return languageRepository.findAll();
    }
}
