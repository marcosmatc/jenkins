package com.test.jenkins.demojenkins1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcos
 * @date 16/11/19
 */
@RestController
public class TestController {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola Mundo";
    }
}
