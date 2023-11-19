package id.infinitelearning.KotlinSubmission.exercise4

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation
import java.util.concurrent.ExecutionException
import javax.xml.bind.ValidationException
import javax.xml.bind.util.ValidationEventCollector

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        try {
            println("Simple Addiction ")
            print("Input Number = ")
            val number1 = readln()!!.toInt()
            print("Input Number = ")
            val number2 = readln()!!.toInt()

            val total = number1 + number2
            println("Total from $number1 + $number2 = $total")

        }
        catch (e: NumberFormatException) {
            println("Data Input With Integer, Please")
        }
    }
