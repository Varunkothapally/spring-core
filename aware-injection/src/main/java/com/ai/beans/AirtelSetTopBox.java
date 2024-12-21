package com.ai.beans;

import com.ai.helper.SetTopBox;
import org.springframework.stereotype.Component;

@Component
public class AirtelSetTopBox implements SetTopBox {
    @Override
    public void onSetTopBox() {
        System.out.println("AirtelSetTopBox");
        
    }
}
