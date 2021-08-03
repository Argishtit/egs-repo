package com.training.innerClasses.bassementForClasses;
import com.training.innerClasses.Exercise6;
import com.training.innerClasses.basementForInterfaces.Display;

public class SeparateThird extends Exercise6 {
    public Display method(){
        Exercise6 outerDisplay = new Exercise6();
        Display display = outerDisplay.inner();
        return display;
    }
}
