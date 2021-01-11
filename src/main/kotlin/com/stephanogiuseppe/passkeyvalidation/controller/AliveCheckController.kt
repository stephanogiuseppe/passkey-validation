package com.stephanogiuseppe.passkeyvalidation.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alive")
public class AliveCheckController {

    @GetMapping
    fun isAlive(): Boolean {
        return true
    }

}
