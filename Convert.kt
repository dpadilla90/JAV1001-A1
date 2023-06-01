fun main() {
    val convkmtomiles=0.62
    val convmilestokm=1.61
    val convcmtoin= 0.39
    val convintocm=2.54
    val convkgtolb=2.2
    val convlbtokg=0.45
    val convgtooz=0.04
    val convoztog=28.35
    val convltocup=4.17
    val convcuptol=0.24
    print("Enter a numeric value: ")
    val userInput: String? = readLine() //Retireves the user numeric value
    val value: Double? = userInput?.toDouble() //Converts the user input from string to Int and stores in value 

    print("Enter the current unit of measurement: ") // Retrieves the current unit of measurement
    val unit: String? = readLine() //Stores the string from the user in the variable unit

    //Used a when because of the many units to convert
    //had to evalute if the value stored in value isnt null, because Int is declared as nullable Int.
    //If the value isnt Null it proceeds to make the conversion if it is prints "Invalid value"
    //Repeats the same in every conversion case
    when (unit) {
        "km" -> {
            if (value != null) {
                println("The conversion to miles is ${value * convkmtomiles}")
            } else {
                println("Invalid value")
            }
        }
        "mi" -> {
            if (value != null) {
                println("The conversion to kilometers is ${value * convmilestokm}")
            } else {
                println("Invalid value")
            }
        }
        "cm" -> {
            if (value != null) {
                println("The conversion to inches is ${value * convcmtoin}")
            } else {
                println("Invalid value")
            }
        }
        "in" -> {
            if (value != null) {
                println("The conversion to centimeters is ${value * convintocm}")
            } else {
                println("Invalid value")
            }
        }
        "kg" -> {
            if (value != null) {
                println("The conversion to pounds is ${value * convkgtolb}")
            } else {
                println("Invalid value")
            }
        }
        "lb" -> {
            if (value != null) {
                println("The conversion to kilos is ${value * convlbtokg}")
            } else {
                println("Invalid value")
            }
        }
        "g" -> {
            if (value != null) {
                println("The conversion to ounces is ${value * convgtooz}")
            } else {
                println("Invalid value")
            }
        }
        "oz" -> {
            if (value != null) {
                println("The conversion to grams is ${value * convoztog}")
            } else {
                println("Invalid value")
            }
        }
        "l" -> {
            if (value != null) {
                println("The conversion to cups ${value * convltocup}")
            } else {
                println("Invalid value")
            }
        }
        "cup" -> {
            if (value != null) {
                println("The conversion to liters ${value * convcuptol}")
            } else {
                println("Invalid value")
            }
        }
       
        else -> {
            println("Invalid unit of measurement")
        }
    }
}
