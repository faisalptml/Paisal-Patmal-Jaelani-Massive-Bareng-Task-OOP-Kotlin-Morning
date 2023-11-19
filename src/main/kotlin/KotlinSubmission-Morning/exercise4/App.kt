package id.infinitelearning.KotlinSubmission.exercise4


fun main() {

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main(args: Array <String>){
        val num1 = 76
        val num2 = 0
        val num3 = 57
        val num4 = 14

        try{
            val result = num1 / num2
            println(result)
        }
        catch (e: ArithmeticException) {
            println("This is Arithmetic Exception")
        }
        println("After The Check")
        println()

    try{
        val result = num3 / num4
        println(result)
    }
    catch (e: ArithmeticException) {
        println("This is Arithmetic Exception")
    }
    println("After The Check")
}
