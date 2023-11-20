package exercise4

fun main() {
    //Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
    // Buat di bawah sini }
    // Example: Accessing an element at a specific index in an array
    val numbers = arrayOf(1, 1, 1, 1, 1, 1,1 ,1 , 1, 1, 1)
    val indexToAccess = 10 // This index is out of bounds

    try {
        // Trying to access an element at the specified index
        val value = numbers[indexToAccess]

        // If successful, print the value
        println("Value at index $indexToAccess: $value")
    } catch (e: ArrayIndexOutOfBoundsException) {
        // Handling the exception if the index is out of bounds
        println("Error: ${e.message}. The specified index is out of bounds.")
    }
}