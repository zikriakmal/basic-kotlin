package app

import data.Person

fun main() {
    val person = Person("Zikri","Akmal","Santoso")

    person.changeName("Zikri Akmal Santoso")
    println(person.getFirstName())
}