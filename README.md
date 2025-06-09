Belajar kotlin dasar
By Nugie kurniawan

kotlin adalah bahasa pemograman untuk android dimana kotlin sendiri berjalan di atas jvm(java virtual machine)

fungsi untuk mencetak sesuatu
di dalam kotlin ada sebuah fungsi untuk mencetak sesuatu yaitu dengan
println() dan print()

perbeadaan:
jika println() akan mengprint 1 baris sehingga jika masih ada println() atau print() selanjutnya tidak akan di cetak dalam baris yang sama 
sedangkan print() hanya akan mencetak isinya tetapi tidak akan membuat baris baru sehingga jika ada println() atau print() di selanjutnya hasilnya akan tercetak dalam 1 baris

tipe data number
tipe data number yaitu tipe data yang berisi angka angka
tipe data number di bagi menjadi 2 yaitu integer(bilangan bulat) dan float(bilangan desimal)

bilangan bulat(integer)
di bagi menjadi 4
-byte
-short
-int
-long

cara penggunaan nya
    var umur: Byte = 50
    var cobaShort: Short = 100
    var cobaInt: Int = 200
    var cobaLong: Long = 100_000_00L
    
catatan :
    untuk long perlu di akhiri dengan L agar memberitahu ini adalah tipe data long
    
bilangan decimal(float)
bilangan decimal di bagi menjadi 2 yaitu
float dan double

cara penggunaanya :
    var angka: Float = 100.51F
    var cobaDouble: Double = 500.55
    
catatan : 
jika ingin menggunakan float haruslah diakhiri dengan F untuk menandai bahwa tipe data tersebut adalah float dan agar tidak error

konversi number
di dalam kotlin terdapat konversi number sama seperti java
.toByte() = menjadi byte
.toShort() = menjadi short
.toInt() = menjadi integer
.toLong() = menjadi long
.toFloat() = menjadi float
.toDouble() = menjadi double

catatan:
berhati hati dalam konversi karna tetap kotlin akan menerapkan ukuran dari masing masing tipe data


