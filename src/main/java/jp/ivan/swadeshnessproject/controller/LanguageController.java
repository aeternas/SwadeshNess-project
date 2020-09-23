package jp.ivan.swadeshnessproject.controller;

import jp.ivan.swadeshnessproject.entity.Language;
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

    @GetMapping("/language")
    ResponseEntity<List<Language>> listClients() {
        val languageList = languageService.findAll();
        return ResponseEntity.ok(languageList);
    }
}
