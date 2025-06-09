package org.example

fun main() {
//    tipe data number secara harfiah terbagi menjadi 2
//    ada integer(int)
//    di integer sendiri ada 4 bagian ada byte,short,int,dan long
    var umur: Byte = 50
    var cobaShort: Short = 100
    var cobaInt: Int = 200
    var cobaLong: Long = 100_000_00L

    println(umur)
    println(cobaShort)
    println(cobaInt)
    println(cobaLong)

//    di float(bilangan decimal) ada koma terbagi menjadi 2 yaitu  Float dan Double
    var angka: Float = 100.51F
    var cobaDouble: Double = 500.55

    println(angka)
    println(cobaDouble)

//    konversi angka pokoknya keyword nya gunakan method to<mau konversi kemana> contoh = angka.toDouble()
    var jadiInt = angka.toInt()
    println(jadiInt)
}