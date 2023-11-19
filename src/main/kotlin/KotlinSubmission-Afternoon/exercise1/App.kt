package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    val firstName: String = "Reza"
    val lastName: String = "Yahya"
    val age: Int = 21
    val isSingle: Boolean = true
    val isnotSingle: Boolean = false

    println("My Profile")
    println("Hello, \nMy name is $firstName $lastName \nI'am $age years old")
    println("Am I still single? That's $isSingle")
    println()

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupName: String, groupMember: List<Any>, session: String): Any {
    println("Group Name = $groupName ")
    println("Group Member = $groupMember")
    println("Session = $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(i: Int): List<Any> {

    val member = listOf("Reza Yahya Pahlevi Palimirma",
                  "Nur Lailatul Hidayah",
                  "Elria Eldaa Servanda N",
                  "Oktariza Dwi Putri",
                  "Messy Wirdianti",
                  "Hary Putra Wardana",
                  "Kukuh Imanura Bagaskara",
                  "Andre Putra Agustian",
                  "Ahmad Ainul Yaqin",
                  "Fransiska Jesika Siwa",
                  "Galung Wendi Wijaya")

    if (i < 10) {
        return listOf(member[0])
    }else{
        return member
    }
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Malik", "Kak Reynaldi")
    val countOfGroup = 11

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()
    var a = 1
    val myTeam = myTeam(a)
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Kuda Terbang", myTeam(a+10), "Afternoon")

}