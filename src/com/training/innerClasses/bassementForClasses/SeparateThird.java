package com.training.innerClasses.bassementForClasses;
import com.training.innerClasses.OuterDisplay;
import com.training.innerClasses.basementForInterfaces.Display;

public class SeparateThird extends OuterDisplay {
    public Display method(){
        OuterDisplay outerDisplay = new OuterDisplay();
        Display display = outerDisplay.inner();
        return display;
    }
}
