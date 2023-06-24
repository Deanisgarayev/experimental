package com.traning.dineas;

import exceptions.Brother;
import exceptions.Father;
import exceptions.Mother;
import exceptions.WrongPersonException;
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
        String name;
        try {
            name = nameInterface.isItDineas(yourName);
        } catch (WrongPersonException e) {
            return "Ты не Денис, так не интересно";
        } catch (Brother brother) {
            return "О я слышал что ты брат Дениса, круто!!!";
        } catch (Mother mother) {
            return "О я слышал что ты мать Дениса, благодарю за вашего сына!!!";
        } catch (Father father) {
            return "О я слышал что ты отец Дениса, ваш сын мне как отец, ммм наверное";
        }
        return "О " + name + " привет!!!";
    }
}
