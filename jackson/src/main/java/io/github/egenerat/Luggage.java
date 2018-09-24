package io.github.egenerat;

import java.util.ArrayList;
import java.util.List;

public class Luggage {

    private List<String> content = new ArrayList<>();

    public Luggage() { }

    public void addContent(String content) {
        this.content.add(content);
    }

    public List<String> getContent() {
        return content;
    }

    public int getElementsNb() {
        return content.size();
    }

    // By default, jackson will not call this method as it does not start with "get"
    public int countElements() {
        return content.size();
    }
}
