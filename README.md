🚀 Features
Addition

Subtraction

Multiplication

Division

User-friendly interface with ViewBinding

Input validation for empty fields

💻 Technologies Used
Kotlin

Android Studio

ViewBinding

📱 How It Works
Users enter two numbers in the input fields.

By clicking the operation buttons (+, −, ×, ÷), the result is calculated and displayed below.

If input fields are empty or invalid, an error message prompts the user to enter numbers.

📝 Code Overview
The app uses four main functions:

kotlin
Kopyala
Düzenle
fun mySum(view: View) { /* Addition */ }
fun mySubt(view: View) { /* Subtraction */ }
fun myDiv(view: View) { /* Division */ }
fun myMulti(view: View) { /* Multiplication */ }
Each function:

Retrieves the numbers from the input fields.

Checks for null values.

Calculates the result if inputs are valid.

Updates the result TextView with the output.

🎯 Purpose
This project was developed to practice:

Android app development fundamentals

Kotlin syntax and functions

ViewBinding implementation

Basic user input validation
