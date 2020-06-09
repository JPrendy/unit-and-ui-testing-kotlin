package com.example.unit_and_ui_testing_kotlin

class Person {
    var name = ""

    constructor(personName: String){
        name = personName
    }

    fun greeting(): String {
        return "Nice to meet you $name"
    }
}