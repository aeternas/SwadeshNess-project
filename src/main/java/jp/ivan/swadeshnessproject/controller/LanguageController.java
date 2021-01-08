package jp.ivan.swadeshnessproject.controller;

import jp.ivan.swadeshnessproject.entity.Language;
import jp.ivan.swadeshnessproject.entity.LanguageFamily;
import jp.ivan.swadeshnessproject.service.LanguageFamilyService;
import jp.ivan.swadeshnessproject.service.LanguageService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {
    @Autowired
    LanguageService languageService;

    @Autowired
    LanguageFamilyService languageFamilyService;

    @GetMapping("/v2/language")
    ResponseEntity<List<Language>> listLanguages() {
        val languageList = languageService.translate("", new LanguageFamily())
        return ResponseEntity.ok(languageList);
    }

    @GetMapping("/v2/languageFamily")
    ResponseEntity<List<LanguageFamily>> listLanguageFamilies() {
        val languageFamiliesList = languageFamilyService.findAll();
        return ResponseEntity.ok(languageFamiliesList);
    }
}
