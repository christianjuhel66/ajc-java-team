package com.springcore.services;

import com.springcore.interfaces.Decouper;
import org.springframework.stereotype.Component;

@Component
public class decoupeImprimerie implements Decouper {
    @Override
    public String getDecouper() {
        return "Je découpe du papier";
    }
}
