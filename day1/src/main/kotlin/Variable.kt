package org.example
const val APP = "Belajar Kotlin NGK"
const val DAY = "Hari pertama"
fun main() {
//    variabel merupakan sebuah wadah dimana kita dapat menampung banyak nilai
//    variabel di kotlin ada 3 jenis yaitu var, val, dan const
//    var dapat di ubah (mutable)
    var namaDepan = "Nugie"
//    val tidak dapat di ubah (Immutable)
    val namaBelakang = "Kurniawan"
// const sebenernya sama dengan val(immutable) tidak dapat di ubah hanay saja harus di buat di global dan best practice nya menggunakan uppercase
    println("$namaDepan $namaBelakang")
    println("$APP : $DAY")
//    variabel di kotlin harus langsung di isi dan tidak bisa di delarasi kosong
//    jika ingin mengisi nya nanti kita harus mengisi nilai nya dengan null ini juga bisa di sebut variable nullabel
    var isi: String? = "Nugiekurniawan"
    isi = "Muhammad nadin nugraha"

    println(isi)
//    jika kita ingin mengakses fungsi lain menggunakan variable nullable kita perlu menambahkan tanda tanya (?)
//    tanad tanya disini bisa di artika jika variable nullable nya tidak null maka booleh mengakses fungsi selanjutnay
    println(isi?.length)
}