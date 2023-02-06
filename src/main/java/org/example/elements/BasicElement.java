package org.example.elements;

public class BasicElement {
    protected String name;

    public BasicElement(String name) {
        this.name = name;
    }

    public BasicElement() {
        name = "defaultName";
    }

    public String getName() {
        return name;
    }
    public void isDisplayed(){
        System.out.println("Element displayed");
    }
}
