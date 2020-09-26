package jp.ivan.swadeshnessproject.controller;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.service.LanguageFamilyService;
import jp.ivan.swadeshnessproject.service.LanguageService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class LanguageController {
    @Autowired
    LanguageService languageService;

    @Autowired
    LanguageFamilyService languageFamilyService;

    @GetMapping("/language")
    ResponseEntity<List<Language>> listLanguages() {
        val languageList = languageService.findAll();
        return ResponseEntity.ok(languageList);
    }

    @GetMapping("/languageFamily")
    ResponseEntity<List<LanguageFamily>> listLanguageFamilies() {
        val languageFamiliesList = languageFamilyService.findAll();
        return ResponseEntity.ok(languageFamiliesList);
    }
}
