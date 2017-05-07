package com.xala3pa;

import com.xala3pa.annotated.Annotated;
import com.xala3pa.utils.AnnotationsUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class AnnotationDemo {
    public static void main(String[] args) {
        Map<String, Long> statistics = new HashMap<>();
        IntStream.rangeClosed(1, 10).forEach(i -> AnnotationsUtils.runAnnotation(Annotated.class, statistics));

        statistics.forEach((key, value) -> System.out.println("Method : " + key + " - Number of executions: " + value));
    }
}
