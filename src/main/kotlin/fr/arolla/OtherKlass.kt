package fr.arolla

class OtherKlass(private val myKlass: MyKlass) {

    fun writeValue(): String {
        return myKlass.isOne().toString()
    }

}