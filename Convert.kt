fun main() {
    var num: Int = 10;
    var currentum: String = "g";
    when (currentum) {
    "km"-> println("The conversion to miles is ${num*0.62}")
    "mi" -> println("The conversion to kilometers is ${num*1.61}")
    "cm" -> println("The conversion to inches is ${num*0.39}")
    "in" -> println("The conversion to centimeters is ${num*2.54}")
    "kg" -> println("The conversion to pounds is ${num*2.2}")
    "lb" -> println("The conversion to kilos is ${num*0.45}")
    "g" -> println("The conversion to ounces is ${num*0.04}")
    "oz" -> println("The conversion to grams is ${num*28.35}")
    else -> {
        print("No conversion")
    }
}
}
