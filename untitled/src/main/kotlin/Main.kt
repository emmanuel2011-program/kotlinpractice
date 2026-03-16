// this is user calculator where users can calculate arithmetic numbers

fun main() {
    println("--- Smart 3MTT Calculator ---") // this will print what am about to code

    while (true) { // This keeps the program running forever until you stop it
        print("\nEnter first number (or type 'exit' to quit): ")
        val input1 = readln()

        if (input1.lowercase() == "exit") break // this lets the user leave when they type exit

        val num1 = input1.toDoubleOrNull()
        if (num1 == null) {
            println("❌ Error: That's not a valid number. Try again.")
            continue // this Skips the rest and starts the loop over
        }

        print("Enter an operator (+, -, *, /): ") // these are the operators the user will have to select
        val op = readln()

        print("Enter second number: ")       // this is the second number selected by the user
        val num2 = readln().toDoubleOrNull()

        if (num2 == null) {
            println("❌ Error: Invalid second number.")
            continue      // makes the code to continue running not to exit
        }
            // using val makes the input not to be changeable
        val result = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else "Division by Zero Error!"
            else -> "Unknown Operator"
        }

        println("✅ Result: $result")
    }
    println("Goodbye!")
}