package data

class Person(firstNameParam: String, middleNameParam: String?, lastNameParam: String): PersonInterface{

    init {
        println("Initializer Function $firstNameParam $middleNameParam $lastNameParam")
    }

    private var firstName: String = firstNameParam
    private var middleName: String? = middleNameParam
    private var lastName: String = lastNameParam
    override fun changeName(firstName: String) {
        this.firstName = firstName
    }
    override fun getFirstName(): String {
        return this.firstName
    }
}