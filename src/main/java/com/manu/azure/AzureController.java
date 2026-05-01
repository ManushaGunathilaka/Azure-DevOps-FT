package com.manu.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, from Azure Devops!";
    }

}
