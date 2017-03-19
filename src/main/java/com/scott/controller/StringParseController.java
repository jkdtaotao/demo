package com.scott.controller;

import com.scott.service.StringParseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringParseController {
    Logger logger = LoggerFactory.getLogger(StringParseController.class);

    @Autowired
    StringParseService stringParseService;

    @RequestMapping("/parseString")
    public String getParseStringResult(@RequestParam("inputStr") String inputStr) {
        logger.info("parseString: {}", inputStr);
        return stringParseService.filterString(inputStr);
    }

}
