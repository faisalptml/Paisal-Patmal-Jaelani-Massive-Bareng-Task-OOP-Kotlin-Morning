package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    val score = 87

    if (score >= 90){
        val result = "Selamat! Anda mendapat nilai A."
        println(result)
    }else if (score >= 80){
        val result = "Anda mendapat nilai B."
        println(result)
    }else if (score >= 70){
        val result = "Anda mendapat nilai C."
        println(result)
    }else if (score >= 60){
        val result = "Anda mendapat nilai D."
        println(result)
    }else {
        val result = "Anda mendapat nilai E."
        println(result)
    }
}