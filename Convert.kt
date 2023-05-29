fun main() {
    print("Enter a numeric value: ")
    val userInput: String? = readLine()
    val value: Int? = userInput?.toInt()

    print("Enter the current unit of measurement: ")
    val unit: String? = readLine()

    when (unit) {
        "km" -> {
            if (value != null) {
                println("The conversion to miles is ${value * 0.62}")
            } else {
                println("Invalid value")
            }
        }
        "mi" -> {
            if (value != null) {
                println("The conversion to kilometers is ${value * 1.61}")
            } else {
                println("Invalid value")
            }
        }
        "cm" -> {
            if (value != null) {
                println("The conversion to inches is ${value * 0.39}")
            } else {
                println("Invalid value")
            }
        }
        "in" -> {
            if (value != null) {
                println("The conversion to centimeters is ${value * 2.54}")
            } else {
                println("Invalid value")
            }
        }
        "kg" -> {
            if (value != null) {
                println("The conversion to pounds is ${value * 2.2}")
            } else {
                println("Invalid value")
            }
        }
        "lb" -> {
            if (value != null) {
                println("The conversion to kilos is ${value * 0.45}")
            } else {
                println("Invalid value")
            }
        }
        "g" -> {
            if (value != null) {
                println("The conversion to ounces is ${value * 0.04}")
            } else {
                println("Invalid value")
            }
        }
        "oz" -> {
            if (value != null) {
                println("The conversion to grams is ${value * 28.35}")
            } else {
                println("Invalid value")
            }
        }
        "l" -> {
            if (value != null) {
                println("The conversion to cups ${value * 4.17}")
            } else {
                println("Invalid value")
            }
        }
        "cup" -> {
            if (value != null) {
                println("The conversion to liters ${value * 0.24}")
            } else {
                println("Invalid value")
            }
        }
        "C" -> {
            if (value != null) {
                println("The conversion to farenheit ${(value * 9/5)+32}")
            } else {
                println("Invalid value")
            }
        }
        "F" -> {
            if (value != null) {
                println("The conversion to celsius ${(value -32)*5/9}")
            } else {
                println("Invalid value")
            }
        }
        else -> {
            println("Invalid unit of measurement")
        }
    }
}
