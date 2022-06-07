package com.example.debttrackerapp

import java.util.*

class LineItems {

    // Create the map to store input values
    val debtMap = mutableMapOf<String, String>()

    // create a new scanner
    private val reader = Scanner(System.`in`)


    // CREATE NEW LINE ITEM
    fun newLine() {
        // prompt for input
        println("Please enter the name of the debt: ")
        var nameInput = readln()
        println("Please enter the total: ")
        var total = reader.nextDouble()
        var totalFormatted = String.format("%.2f", total)

        // save to a mutableMap
        debtMap.put(nameInput, totalFormatted)

        // Display all line items display()
        display()

    }


    // DELETE LINE ITEM
    fun deleteLine() {
        // prompt for input
        println("Which item would you like to delete? ")
        var deleteItem = readln()

        // delete from the mutableMap
        debtMap.remove(deleteItem)

        // Display all line items display()
        display()


    }

    // EDIT LINE ITEM
    fun editLine() {
        // prompt for input
        println("Enter the name of the item you like to edit " +
                "(type exactly as it appears on the list): ")
        var editItem = readln()
        println("Enter the new total: ")
        var newValue = reader.nextDouble()
        var valueFormatted = String.format("%.2f", newValue)

        // edit mutableMap item
        debtMap.put(editItem, valueFormatted)

        // Display all line items display()
        display()

    }

    // DISPLAY LIST OF LINE ITEMS
    fun display() {
        // HEADER
        println("\n        Debt List:")
        println("------------------------")
        println("Name\t\t\t Amount")
        println("------------------------")

        // LINE ITEMS
        // for loop to iterate items
        for ((key, value) in debtMap) {
            println("$key\t\t\t $$value")
        }

        println("\n")
    }
}