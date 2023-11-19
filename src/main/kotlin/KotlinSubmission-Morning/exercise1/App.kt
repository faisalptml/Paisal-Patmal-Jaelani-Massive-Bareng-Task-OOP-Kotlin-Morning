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
    val namaDepan = "Paisal"
    val namaTengah = "Patmal"
    val namaBelakang = "Jaelani"
    val umur = 22
    val statSingle = false

    println("""Hallo perkenalkan nama saya $namaDepan $namaTengah $namaBelakang, 
saya berumur $umur tahun 
""".trimMargin())
    if (statSingle) {
        println("Status saat ini Single")
    } else {
        println("Status saat ini Tidak Single")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama Kelompok : $groupId")
    println("Anggota : ")
    var v = 0
    for (anggota in groupMember) {
            v++
        println("$v. $anggota")
    }

    println("Sesi : $session")

    return """
        Informasi Kelompok
        Group : $groupId
        Anggota : $groupMember
        Sesi : $session
    """.trimIndent()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggota = listOf<Any>(
        "Akmal F. M. Pasaribu",
        "Nurmila Fauziyah",
        "Paisal Patmal Jaelani",
        "Rafly Andika Tranggono",
        "M. Haerul Amri",
        "Abdi Mulia Pranidana",
        "Nurhaini Ginting",
        "M. Irbi Syi'bu Al-Huda",
        "Syamsul Buchori Pane",
        "Nugraha M. Taufik",
        "M. Rahmat Azhari")

    val MyTeam = anggota.get(2)

    return listOf(MyTeam)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Jovian", "Kak Imam")
    val countOfGroup = arrayOf<String>(
        "Akmal F. M. Pasaribu",
        "Nurmila Fauziyah",
        "Paisal Patmal Jaelani",
        "Rafly Andika Tranggono",
        "M. Haerul Amri",
        "Abdi Mulia Pranidana",
        "Nurhaini Ginting",
        "M. Irbi Syi'bu Al-Huda",
        "Syamsul Buchori Pane",
        "Nugraha M. Taufik",
        "M. Rahmat Azhari"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Massive Bareng", listOf("Akmal F. M. Pasaribu", "Nurmila Fauziyah", "Paisal Patmal Jaelani", "Rafly Andika Tranggono", "M. Haerul Amri", "Abdi Mulia Pranidana", "Nurhaini Ginting", "M. Irbi Syi'bu Al-Huda", "Syamsul Buchori Pane", "Nugraha M. Taufik", "M. Rahmat Azhari"), "Pagi")

}