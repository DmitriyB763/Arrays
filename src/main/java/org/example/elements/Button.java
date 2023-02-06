package org.example.elements;

public class Button extends BasicElement{
    public Button(String name) {
        super(name);
    }

    public Button() {
        name = "defaultButton";
    }

    public void click(){
        System.out.println("click on " + name);
    }

    public void click(String value){
        System.out.println("click on " + value);
    }

    @Override
    public void isDisplayed(){
        System.out.println(name +" displayed");
    }


}
