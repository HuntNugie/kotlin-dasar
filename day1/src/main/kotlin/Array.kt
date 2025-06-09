package org.example

fun main() {
//    array merupakan tipe data dimana kita dapat menampung banyak nilai dengan tipe data yang sama
    val mahasiswa: Array<String> = arrayOf("Nugie kurniawan","Muhammad Nadin Nugraha","Azib almazida","Rakha sagraha")
//    untuk mengakses nilai array kita bisa menggunakan 2 cara yaitu .get() atau []
    println(mahasiswa.get(0))
    println(mahasiswa[1])
    println(mahasiswa.size)
//    untuk mengubah isi array kita bisa menggunakan 2 cara yaitu .set() atau array[]
    mahasiswa.set(2,"Laurin agnesa putri")
    mahasiswa[3] = "Rizal hidayatullah"
//    array juga bisa disi dengan nullable
    val arr: Array<String?> = arrayOfNulls(2)
    arr.set(0,"Nugie kurniawan")
    arr.set(1,"Laurin agnesa putri")

    for (i in arr){
        println(i)
    }
}