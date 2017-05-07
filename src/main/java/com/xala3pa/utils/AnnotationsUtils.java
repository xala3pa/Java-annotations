package com.xala3pa.utils;

import com.xala3pa.annotated.Annotated;
import com.xala3pa.annotations.Statistics;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AnnotationsUtils {
    public static void runAnnotation(Class<?> clazz, Map<String, Long> statistics) {
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Statistics.class)) {
                try {
                    calculateStatistics(statistics, method);
                    method.invoke(Annotated.class.newInstance(), "Alvaro\n");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        }

    }

    private static void calculateStatistics(Map<String, Long> statistics, Method method) {
        String methodName = method.getName();
        Long count = statistics.getOrDefault(methodName, 0L);
        statistics.put(methodName, ++count);
    }
}
