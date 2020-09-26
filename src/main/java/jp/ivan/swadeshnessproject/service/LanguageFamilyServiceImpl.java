package jp.ivan.swadeshnessproject.service;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.repository.LanguageFamilyRepository;
import jp.ivan.swadeshnessproject.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageFamilyServiceImpl implements LanguageFamilyService {
    @Autowired
    LanguageFamilyRepository languageFamilyRepository;

    public List<LanguageFamily> findAll() {
        return languageFamilyRepository.findAll();
    }
}
