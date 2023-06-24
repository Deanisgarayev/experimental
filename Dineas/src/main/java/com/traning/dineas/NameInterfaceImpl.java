package com.traning.dineas;

import exceptions.Brother;
import exceptions.Father;
import exceptions.Mother;
import exceptions.WrongPersonException;
import org.springframework.stereotype.Service;

@Service
public class NameInterfaceImpl implements NameInterface {
    @Override
    public String isItDineas(String yourName) {
        String denny = "Денис";
        String brother = "Айнур";
        String mother = "Рауза";
        String father = "Ахсан";
        if (!yourName.equals(denny)) {
            throw new WrongPersonException("Wrong name");
        }
        if (yourName.equals(brother)) {
            throw new Brother("Айнур");
        }
        if (yourName.equals(mother)) {
            throw new Mother("Рауза");
        }
        if (yourName.equals(father)) {
            throw new Father("Ахсан");
        }
        return yourName;
    }
}
