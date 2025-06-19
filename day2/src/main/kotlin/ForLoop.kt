fun main() {
//    looping merupakan baris kode yang akan di ulang ulang sampai kondisi tertentu terpenuhi
//    salah satu perulanagan adalah for()

//    for dalam perulangan menambil nilai array
    val arr : Array<String> =  arrayOf("Nugie kurniawan","Rakha sagraha","Rizal hidayatulloh","Muhammad raihan setiaman")
    for (i in arr){
        println(i)
    }
// for menggunakan range
var ukuran = 10
    for (i in 0..ukuran){
        println("Sudah mengulang ke $i kali")
    }

//    for untuk array menggunakan index
//    membuat variabel untuk menampung ada berapa index
    var index = arr.size - 1
    for(i in 0..index){
        println("Index ke $i adalah ${arr.get(i)}")
    }
}