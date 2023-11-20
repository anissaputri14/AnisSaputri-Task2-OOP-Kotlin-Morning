package exercise1
fun myProfile() {
    val firstName: String = "Anis"
    val lastName: String = "Saputri"
    val age: Int = 21
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}

fun groupDetail(groupId: String, groupMembers: List<Any>, session: String) {
    println("Group ID: $groupId")

    println("Group Members:")
    for (member in groupMembers) {
        println("- $member")
    }

    println("Session: $session")
}

fun myTeam(): List<Any> {
    val teamMembers = listOf("Gatot", "Raihan", "Fauzan", "Vito", "Anis")
    val myName = teamMembers[4] // Assuming your name is the fifth element

    return listOf(myName)
}

fun totalMember(): Int {
    // You can populate mentor and countOfGroup arrays if needed
    val mentor = arrayOf<String>("kak raihan", "kak fateh")
    val countOfGroup = arrayOf<String>("Gatot", "Raihan", "Fauzan", "Vito", "Anis", "Della",
        "Erika", "hamdani", "hafizh", "ihsan")
    val totalmember = mentor.size + countOfGroup.size
    return totalmember
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group: $totalMember")

    // Adjust the arguments based on your group data
    groupDetail("ShelterNerd", listOf("Gatot", "Raihan", "Fauzan", "Vito", "Anis", "Della",
        "Erika", "hamdani", "hafizh", "ihsan"), "SesiPertama")
}
