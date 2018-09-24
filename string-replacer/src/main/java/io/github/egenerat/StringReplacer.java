package io.github.egenerat;

import org.apache.commons.text.StringSubstitutor;

import java.util.HashMap;
import java.util.Map;

public class StringReplacer {
    public static void main(String... args) {
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("firstName", "Emile");
        valuesMap.put("lastName", "Generat");
        String templateString = "Hello ${firstName} ${lastName}!";
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String resolvedString = sub.replace(templateString);
        System.out.println(resolvedString);
    }
}