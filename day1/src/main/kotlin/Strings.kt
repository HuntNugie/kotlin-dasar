package org.example

fun main() {
//    tipe data string merupakan tipe data gabungan dari beberapa atau banyak tipe data character atau lebih simplenya adalah text
    var depan: String = "Nugie"
    var belakang: String = "Kurniawan"
    var alamat1: String = """
        |Perumahan Orowodol 5,
        |Kab Sumedang
        |jawa barat
        |indonesia
    """.trimMargin()
    println(depan)
    println(belakang)
    println(alamat1)

//    di dalam string ktia dapat menyatukan lebih dari 1 string yang berbeda ada 2 cara
//    menggunakan +
    var namaLengkap = depan + " " + belakang
    println(namaLengkap)
//    menggunakan string template $ ${}
    println("$namaLengkap panjang huruf nya adalah ${namaLengkap.length}")
}