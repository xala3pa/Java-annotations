package com.xala3pa.annotated;

import com.xala3pa.annotations.Statistics;

public class Annotated {

    @Statistics
    public void greeting(String name){
        System.out.printf("Hola, %s", name);
    }

    @Statistics
    public void sayGoodbye(String name) {
        System.out.printf("Goodbye, %s", name);
    }
}
