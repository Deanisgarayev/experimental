package com.traning.dineas;

import org.springframework.stereotype.Service;

@Service
public class NameInterfaceImpl implements NameInterface {
    @Override
    public String isItDineas(String yourName) {
        return yourName;
    }
}
