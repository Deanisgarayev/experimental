package com.traning.dineas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.Name;

@RestController
public class NameController {
    private final NameInterface nameInterface;
    @Autowired
    public NameController(NameInterface nameInterface ) {
        this.nameInterface = nameInterface ;
    }

    @GetMapping("/nameYourName")
    public String name(String yourName) {
        String name = nameInterface.isItDineas(yourName);
        return name;
    }
}
