fun main() {
//    aritmatika adalah operasi matematika di bahasa pemograman
//    ada operaasi (+) (-) (/) (*) (%)
    var a = 5
    var b = 6
    var tambah = a + b
    var kurang = a-b
    var bagi = a/b
    var kali = a*b
    var modulus = a%b

    println(tambah)
    println(kurang)
    println(bagi)
    println(kali)
    println(modulus)

//    augmented assigment (+=) (-=) (*=) (/=) (%=)
    tambah += a
    kurang -= a
    bagi /= b
    kali *= b
    modulus %= 3

    println(tambah)
    println(kurang)
    println(bagi)
    println(kali)
    println(modulus)

//    unery operator (++) (--) (-) (+) (!)
    println(a++)
    println(b--)
    println(-b)
    println(b) // default nya sudah positif
    var sehat = true

    println(!sehat)

}