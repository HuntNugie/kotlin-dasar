fun main() {
//    Operasi boolean merupakan operasi yang membandingkan antar tipe data boolean
    var uts = 90
    var uas = 80
    var quiz = 80
    var tugas = 100
    var hadir = 'B'
    var rata = ( uts + uas + quiz + tugas ) / 4

    var cek = rata >80

    var hasil = cek && hadir == 'A'
     hasil = cek || hadir == 'A'
     hasil = !cek

    println(hasil)
}