fun main() {
//    tipe data range adalah tipe data ketika kita menginginkan angka berurutan
//    ascending menaik
    var range = 1..100 step 2
//    descending menurun
    var down = 100 downTo 1

//    fungsi yang bisa di gunakan
    println(range)
    println(down)

//    fungsi count itu berfungsi untuk menghitung sebanyak apa total range nya tergantung step
    println(range.count())
//    fungsi contains itu berfungsi untuk mengecek apakah angka ini berada di range dan mengembalikan true dan false
    println(range.contains(51))
//    fungsi first berfungsi untuk mengambil range ini di mulai di angka apa
    println(range.first)
//    fungsi last berfungsi untuk mengambil range ini berakhir di angka berapa
    println(range.last)
//    fungsi step berfungsi untuk mengambil bahwa range ini menggunakan berapa langkah
    println(range.step)
}