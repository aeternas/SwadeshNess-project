package jp.ivan.swadeshnessproject.service;

import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegacyLanguageFamilyService implements LanguageFamilyService {
    @Override
    public List<LanguageFamily> findAll() {
        return null;
    }
}
