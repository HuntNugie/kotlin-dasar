fun main() {
//    Belajar when adalah operasi yang tidak banyak bahasa pemograman mempunyai operasi when
//    operasi when mirip dengan operasi if else dalam pengkondisian
    var grade = 'D'
//    sama dengan
    when(grade){
        'A' -> println("Nilai mu bagus anak anak ")
        'B' -> println("Nilai mu sudah lumayan anak anak")
        'C' -> println("Nilai mu mulai goreng anak anak")
        else -> {
            println("Geus teu lulus maneh beul")
        }
    }
//    menggunakan in
    var coba = "B"
    val lulus : Array<String> = arrayOf("A","B","C")
    when (coba){
        in lulus -> println("Lulus")
        !in lulus -> println("Tidak lulus")
    }
//    menggunakan is
    when(coba){
        is String -> println("tipe datanya adalah string")
        is Char -> println("Tipe datanya adalah char")
        else -> println("tidak ada tipe data")
    }
//    multiple kondisi
    when(coba){
        "A","B","C" -> println("nah eta mah parada lulus")
        else -> println("Astagfirullah ujang bisa bisana ga bisa lulus")
    }
//    menggunakan tanda operasi boolean
    val angka = 5
    when{
        angka > 9  -> println("Berhasil")
        angka < 8 -> println("Lumayan")
        else -> println("aweh nu di kabisa manehma")
    }
}