package exercise2

fun main() {
    // Latihan 1 List
    // Membuat list untuk menyimpan bilangan genap dari 1 hingga 100
    val evenNumbers = mutableListOf<Int>()

    // Menggunakan for loop dan logika if untuk mengisi bilangan genap pada list
    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }

    // Menampilkan isi list
    println("Bilangan Genap dari 1 hingga 100: $evenNumbers")

    // Latihan 2 Map
    // Buat variabel bertipe Map untuk daftar nama bulan
    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    // Cetak semua nama bulan dengan fungsi forEach
    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    // Cetak nama bulan sekarang dan bulan lahir dengan format string
    val monthNow = "November" // Ganti dengan nama bulan sekarang
    val birthMonth = "April" // Ganti dengan bulan lahir Anda
    println("It's $monthNow now, I was born in $birthMonth")


}