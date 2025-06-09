<h1>Belajar kotlin dasar</h1>
<p>By Nugie kurniawan</p>

<div>
kotlin adalah bahasa pemograman untuk android dimana kotlin sendiri berjalan di atas jvm(java virtual machine)
</div>

<h2>Fungsi untuk mencetak sesuatu</h2>
di dalam kotlin ada sebuah fungsi untuk mencetak sesuatu yaitu dengan
  <ul>
    <li>println()</li>
    <li>print()</li>
  </ul>

<h3>Perbeadaan:</h3>
<div style="text-align:justify">

<ul>
    <li>println() = akan mengprint 1 baris sehingga jika masih ada println() atau print() selanjutnya tidak akan di cetak dalam baris yang sama </li>
    <li>sedangkan print() hanya akan mencetak isinya tetapi tidak akan membuat baris baru sehingga jika ada println() atau print() di selanjutnya hasilnya akan tercetak dalam 1 baris</li>
</ul>
</div>

<h2>tipe data number</h2>
tipe data number yaitu tipe data yang berisi angka angka
tipe data number di bagi menjadi 2 yaitu integer(bilangan bulat) dan float(bilangan desimal)

<h3>bilangan bulat(integer)</h3>
di bagi menjadi 4 yaitu :
<ul>
    <li>byte</li>
    <li>short</li>
    <li>int</li>
    <li>long</li>
</ul>

<h4>cara penggunaan nya</h4>
 <ul>
    <li>var umur: Byte = 50</li>
    <li>var cobaShort: Short = 100</li>
    <li>var cobaInt: Int = 200</li>
    <li>var cobaLong: Long = 100_000_00L</li>
</ul>
    
catatan :
    untuk long perlu di akhiri dengan L agar memberitahu ini adalah tipe data long
    
<h3>bilangan decimal(float)</h3>
bilangan decimal di bagi menjadi 2 yaitu
float dan double

<h4>cara penggunaanya :</h4>
<ul>
        <li>var angka: Float = 100.51F</li>
        <li>var cobaDouble: Double = 500.55</li>
</ul>
    
catatan : 
jika ingin menggunakan float haruslah diakhiri dengan F untuk menandai bahwa tipe data tersebut adalah float dan agar tidak error

<h2>konversi number</h2>
di dalam kotlin terdapat konversi number sama seperti java
<ul>
    <li>.toByte() = menjadi byte</li>
    <li>.toShort() = menjadi short</li>
    <li>.toInt() = menjadi integer</li>
    <li>.toLong() = menjadi long</li>
    <li>.toFloat() = menjadi float</li>
    <li>.toDouble() = menjadi double</li>
</ul>

catatan:
berhati hati dalam konversi karna tetap kotlin akan menerapkan ukuran dari masing masing tipe data

<h2>Tipe data Char(character)</h2>
tipe data char(character) adalah tipe data yang khusus untuk satu huruf saja 

<h3>Cara penggunaannya:</h3>
 <ul>
    <li>var n: Char = 'N'</li>
    <li>var g: Char = 'G'</li>
    <li>var k: Char = 'K'</li>
</ul>
    
catatan: 
tipe data char di kotlin hanya boleh menggunakan tanda petik 1 agar bisa digunakan dan tidak boleh lebih dari 1 huruf


<h2>Tipe data Boolean</h2>
tipe data boolean merupakan tipe data yang hanya menampung 2 nilai yaitu <strong>true</strong> dan <strong>false</strong> dan akan terasa jika digunakan untuk perkondisian

<h3>Cara penggunaanya : </h3>
<ul>
    <li> var benar: Boolean = true</li>
   <li> var salah: Boolean = false</li>
</ul>

catatan :
Tipe data boolean di kotlin ini lebih banyak di gunakan untuk perkondisian seperti if else ataupun ternary


    
<h2>Tipe data String</h2>
<div style="text-align: justify;">
tipe data string adalah tipe data gabungan yang terdiri dari beberapa karakter huruf atau banyak karakter atau mungkin simple nya adalah <strong>Text</strong>
</div>

<h3>Cara penggunaan : </h3>
<ul>
    <li>var depan: String = "Nugie"</li>
    <li>var belakang: String = "Kurniawan"</li>
    <li>var alamat1: String = """
        |Perumahan Orowodol 5,
        |Kab Sumedang
        |jawa barat
        |indonesia
    """</li>
</ul>

<div style="text-align: justify;">
   catatan : untuk tipe data string kita wajib menggunakan kutip 2 ("") atau kita dapat menggunakan kutip 3 ("""") untuk membuat string yang tidak hanya satu baris tapi juga beberapa baris, ditambah jika ingin menggunakan kutip 3 kita dapat menggunakan sebuah method/fungsi bawaan kotlin yaitu <strong>.trimMargin()</strong> secara default akan menghilangkan tab atau spasi yang memliki "|" di awal baris. atau jika tidak ingin menggunakan "|" kita dapat menggunakan tanda yang lain asalkan parameter yang kita berikan di method trimMargin() sesuai dengan tanda yang kita gunakan.
</div>

<h3>Penggabungan string</h3>
di dalam kotlin kita dapat menggabungakan 2 string atau lebih dengan menggunakan operator "+" contoh nya :
<p>var namaLengkap = depan + " " + belakang</p>

<h3>String template</h3>
di dalam kotlin penggabungan string menggunakan operator "+" kurang di sarankan oleh karna itu kita dapat menggunakan fitur dari kotlin yaitu <strong>String template</strong> <br>
<div style="text-align: justify;">
    string template merupakan fitur bawaan nya kotlin dimana kita dapat menyusun beberapa string atau banyak dengan rapih dan mudah
</div>
<h4>Cara Penggunaan : </h4>
<p> println("$namaLengkap panjang huruf nya adalah ${namaLengkap.length}")</p>
catatan :
di dalam string template jika hanya mengisi satu expresi kita dapat hanya menggunakan $ tetapi jika lebih dari satu expresi kita menggunakan ${}
    