package fr.arolla;

public class OtherClass {

    private final MyClass myClass;

    public OtherClass(MyClass myClass) {
        this.myClass = myClass;
    }

    public String writeValue() {
        return String.valueOf(myClass.isOne());
    }
}
