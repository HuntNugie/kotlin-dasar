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
    
<h2>Tentang variabel</h2>
<p>Variabel adalah tempat atau wadah untuk menampung sebuah nilai secara fungsi variabel di bagi menjadi 2 yaitu mutable dan immutable</p>

<h3>Mutable(dapat di ubah)</h3>
<p>variabel dengan muttable di kotlin adalah variabel yang nilai nya suatu saat dapat di ubah</p>

<h4>Cara penggunaanya : </h4>
<p>var namaDepan = "Nugie"</p>

<div style="text-align: justify;">
catatan : dalam kotlin lebih di sarankan jika kita yakin bahwa nilai variabelnya tidak akan berubah maka lebih di saranakan menggunakan variable immutable di banding mutable 
</div>

<h3>immutable(tidak dapat di ubah)</h3>
<p>variabel immutable di kotlin berkebalikan dengan mutable yaitu adalah variabel yang nilai nya tidak dapat di ubah dan di dalam kotlin ada 2 tipe variabel yang berjenis immutable yaitu val biasa dan constanta</p>

<h4>Cara penggunaanya val biasa : </h4>
<p>val namaBelakang = "Kurniawan"</p>

<h4>Cara penggunaanya constanta : </h4>
<p>const val APP = "Belajar Kotlin NGK"</p>

<h4>Perbandingan antara val biasa dan constanta</h4>
<div style="text-align: justify;">
    <ul>
    <li>val = seperti variabel biasa</li>
    <li>const val = sama mirip dengan val hanya saja Di buat di global scope dan pembuatanya wajib menggunakan val dan di sarankan menggunakan upper case untuk nama variabel nya untuk membedakan bahwa variabel ini adalah varibael constanta</li>
</ul>
</div>

<div style="text-align: justify;">
catatan : kita tidak boleh mengganti nilai untuk variabel val ataupun constanta karena akan menghasilkan error, dan jika kita ingin membuat variabel coonstanta wajib menggunakan val dan di sarankan menggunakan upper case untuk nama variabel nya untuk membedakan bahwa variabel ini adalah constanta serta membaut nya di global scope

</div>

<h3>Variable nullable</h3>
<div style="text-align: justify;">
    di dalam kotlin kita tidak membuat deklarasi variabel kosong sehingga ktia harus mengisikan value langsung saat kita membuat variabel baru dan jika kita tidak menginginkan membuat variabel kosong yang nanti akan di isi kita dapat membuat variable nullable(walapun masih tetap tidak di sarankan)
</div>
<div style="text-align: justify;">
    Varibel nullabel merupakan variabel yang kita dapat isi nilai null sehingga kita dapat mengisikan value nya nanti
</div>

<h4>Cara penggunaanya : </h4>
<ul>
    <li>var isi: String? = null</li>
    <li> println(isi?.length)</li>
</ul>

<div style="text-align: justify;">
    catatan : untuk membuat variabel nullabel kita harus menambakan tanda tanya (?) setelah tipe data nya dan wajib menambahkan tipe data nya secara explisit dan untuk menampilkan nya pun jika kita ingin lebih dari 2 expresi maka kita wajib menambahkan tanda tanya juga setelah namavariabel nya jika tidak akan menghasilkan <small style="color: red;">ERROR</small>
</div>

<h2>Tipe data Array(larik)</h2>
<p>Tipe data array merupakan tipe data yan dapat menampung nilai nilai yang tipe data nya sama(karna dikotlin hanya dapat menampung nilai dengan tipe data sama)</p>

<h3>Cara penggunaanya : </h3>
<p> val mahasiswa = arrayOf("Nugie kurniawan","Muhammad Nadin Nugraha","Azib almazida","Rakha sagraha")</p>

<div style="text-align: justify;">
    catatan : Di dalam array ada yang namanya index(merupakan key atau istilah nya penanda untuk array) yang di mulai dari 0, dan dalam array panjang index nya statik(tetap) jadi tidak bisa di tambah panjang nya
</div>

<h3>Fungsi untuk memanggil dan mengubah isi array serta mendapatkan panjang element array</h3>
<p>untuk memanggil dan mengubah isi array bisa menggunakan .set() .get() dan .size</p>

<h3>Mengubah nilai array</h3>
<p>dalam mengubah nilai array ada 2 cara .set() dan []</p>

<h4>Cara penggunaanya : </h4>
<ul>
    <li>mahasiswa.set(2,"Laurin agnesa putri")</li>
    <li>mahasiswa[3] = "Rizal hidayatullah"</li>
</ul>

<div style="text-align: justify;">
    catatan : saat ingin mengubah nilai array kita perlu mengetahui index mana yang mau di ubah karna jika kita mengisi index yang tidak ada dalam array maka akan menghasilkan error
</div>

<h3>Mendapatkan nilai array</h3>
<p>dalam mendapatkan nilai array ada 2 cara yaitu .get() dan array[]</p>

<h4>Cara penggunaanya : </h4>
<ul>
    <li>println(mahasiswa.get(0))</li>
    <li>println(mahasiswa[1])</li>
</ul>

<div style="text-align: justify;">
    catatan : saat ingin mendapatkan nilai array kita peru mengetahui index mana yang ingin kita dapatkan karna jika kita mengisi di index yang tidak ada dalam array maka akan menghasilkan error
</div>

<h3>Mendapatkan panjang element array</h3>
<p>kita dapat menggunakan fungsi bawaan dari kotlin untuk mendapatkan panjang dari element array yaitu dengan .size</p>

<h4>Cara penggunaanya : </h4>
<p>mahasiswa.size</p>

<div style="text-align: justify;">
    catatan : fungsi .size itu untuk mencari panjang dari element array dan <strong>BUKAN</strong> untuk mencari panjang index array, untuk mendapatkan panjang index array kita bisa menggunakan rumus mahasiswa.size -1 agar mendapatkan panjang index array
</div>

<h3>Array Nullabel</h3>
<p>Dalama array kita juga dapat mengformat nullable walaupun tidak dengan pembuatan array standar</p>

<h4>Cara penggunaanya : </h4>
    <p>val arr: Array &lt;string?&gt;
 = arrayOfNulls(2)</p>

<div style="text-align: justify;">
    catatan : Untuk membuat array nullable kita harus menambahkan tanda tanya setelah tipe datanya dan kita harus menggunakan arrayOfNulls(2) untuk mengset array nullable dan kita harus menambahkan panjang nya langsung
</div>

<p>Tambahan : jika ingin mencetak semua nya kita dapat mencetak seluruh array tanpa perlu satu persatu dengan perulangan (looping)</p>

<h2>Tipe data Range</h2>
<p>Tipe data range adalah tipe data yang isinya adalah angka berurutan mau menaik (ascending) ataupun menurun (descending)</p>

<h3>Cara penggunaanya : </h3>
<ul>
    <li>  var range = 1..100 </li>
    <li>  var down = 100 downTo 1</li>
</ul>

<div style="text-align: justify;">
    catatan : Dalam range itu di buat dengan <strong>titik-titik (..)</strong>, untuk melakukan nya terbalik menurun bisa menggunakan <strong>downTo</strong>
</div>

<h3>Step</h3>
<div>Terkadang kita ingin kenaikan atau menurun nya suatu range itu mau di custom oleh kita oleh karna itu dalam range kita dapat menggunakan step untuk mengatur kenaikan atau menurun nya suatu angka berurutan</div>

<h4>Cara penggunaanya : </h4>
<ul>
    <li>  var range = 1..100 step 2 </li>
    <li>  var down = 100 downTo 1 step 3</li>
</ul>

<div style="text-align: justify;">
    catatan : berhati hati jika menggunakan step otomatis angka berakhir nya akan berubah  serta angka berurutan yang ada di range pun berubah
</div>

<h3>Fungsi dalam range</h3>
<p>Di dalam range mempunyai fungsi tambahan : </p>
<ul>
    <li>println(range.count()) = <strong>.count()</strong> Berfungsi untuk mendapatkan total banyak range tergantung step nya </li>
    <li>println(range.contains(50)) = <strong>.contains(50)</strong> Berfungsi untuk mengecek suatu angka berada di dalam range dan mengembalikan <strong style="color: green;">TRUE</strong> dan <strong style="color: red;">FALSE</strong></li>
    <li>println(range.first) = <strong>.first</strong> untuk mendapatkan angka (pertama) range nya di mulai dari angka berapa</li>
    <li>println(range.last) = <strong>.last</strong> untuk mendapatkan angka range (terakhir) nya berakhir angka berapa</li>
    <li>println(range.step) = <strong>.step</strong> untuk mendapatkan step yang di gunakan dalam range </li>
</ul>

<div style="text-align: justify;">
    catatan : jika dalam range nya kita menggunakan step maka bisa saja hasil nya akan berbeda tergantung range dan step nya
</div>

<h2>Aritmatika Operator</h2>
<div style="text-align: justify;">Operator aritmatika merupakan Operasi penjumlahan di dalam pemograman dimana kita dapat melakukan <strong>operasi matematika</strong> yang di terapkan di dalam pemograman</div>

<h3>Daftar operasi : </h3>
<table style="border: 1px solid black; text-align: center;">
    <thead>
        <tr>
            <th>Operasi</th>
            <th>Fungsi</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>+</td>
            <td>Untuk pertambahan</td>
        </tr>
        <tr>
            <td>-</td>
            <td>Untuk pengurangan</td>
        </tr>
        <tr>
            <td>*</td>
            <td>Untuk perkalian</td>
        </tr>
        <tr>
            <td>/</td>
            <td>Untuk pembagian</td>
        </tr>
        <tr>
            <td>%</td>
            <td>Untuk modulus(sisa bagi)</td>
        </tr>
    </tbody>
</table>

<h4>Cara penggunaanya : </h4>
<ul>
    <li>var tambah = a + b</li>
    <li>var kurang = a-b</li>
    <li>var bagi = a/b</li>
    <li>var kali = a*b</li>
    <li>var modulus = a%b</li>
</ul>
<h3>Augmented assingment</h3>
<div style="text-align: justify;">
    Augmented assingment merupakan operator yang di gunakan jika kita ingin melakukan operasi matematika langsung ke variabel nya 
</div>

<h4>Daftar Operasi Augmented assingment</h4>
<table style="border: 1px solid black;">
    <thead>
        <tr>
            <th>Operasi</th>
            <th>Fungsi</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>+=</td>
            <td>Melakukan Penambahan yang sebelumnya dengan yang di jumlahkan </td>
        </tr>
        <tr>
            <td>-=</td>
            <td>Melakukan Pengurangan yang sebelumnya dengan yang di jumlahkan </td>
        </tr>
        <tr>
            <td>*=</td>
            <td>Melakukan Perkalian yang sebelumnya dengan yang di jumlahkan </td>
        </tr>
        <tr>
            <td>/=</td>
            <td>Melakukan Pembagian yang sebelumnya dengan yang di jumlahkan </td>
        </tr>
        <tr>
            <td>%=</td>
            <td>Melakukan Sisa bagi dari yang sebelumnya dengan yang di jumlahkan </td>
        </tr>
    </tbody>
</table>

<h4>Cara penggunaanya : </h4>
<ul>
    <li>tambah += a</li>
    <li>kurang -= a</li>
    <li>bagi /= b</li>
    <li>kali *= b</li>
    <li>modulus %= 3</li>
</ul>

<h2>Operasi Perbandingan</h2>
<div style="text-align: justify;">
    Operasi perbandingan adalah operasi yang membandingkan antar 2 nilai dan akan menghasilkan nilai boolean yaitu <strong>TRUE</strong> dan <strong>FALSE</strong>
</div>

<h3>Daftar Operasi perbandingan</h3>
<table style="border: 1px solid black;">
    <thead>
        <tr>
            <th>Operasi</th>
            <th>Arti</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th>></th>
            <th>Lebih dari</th>
        </tr>
        <tr>
            <th><</th>
            <th>Kurang dari</th>
        </tr>
        <tr>
            <th>>=</th>
            <th>Lebih dari atau sama dengan</th>
        </tr>
        <tr>
            <th><=</th>
            <th>Kurang dari atau sama dengan</th>
        </tr>
        <tr>
            <th>==</th>
            <th>Sama dengan</th>
        </tr>
        <tr>
            <th>===</th>
            <th>Sama dengan(lebih ketat)</th>
        </tr>
        <tr>
            <th>!=</th>
            <th>Tidak sama dengan</th>
        </tr>
    </tbody>
</table>

<h3>Cata penggunaanya : </h3>
<ul>
    <li>println("a > b ${a>b}")</li>
    <li>println("a < b ${a<b}")</li>
    <li>println("a >= b ${a>=b}")</li>
    <li>println("a <= b ${a<=b}")</li>
    <li>println("a == b ${a==b}")</li>
    <li>println("a === b ${a===b}")</li>
    <li>println("a != b ${a!=b}")</li>
</ul>

<div style="text-align: justify;">
    catatan : tidak hanya untuk angka perbandingan ini juga termasuk ke huruf string dan char serta untuk === itu tidak hanya membandingkan dengan nilainya saja tetapi sama tipe data nya juga
</div>

## Operasi Boolean
Operasi boolean adalah operasi yang membandingkan nilai yang bertipe data booolean, operasi ini menghasilkan true and false

<table style="border: 1px solid black;">
    <thead>
        <tr>
            <th>
                Operasi
            </th>
            <th>Arti dan makna</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>&&</td>
            <td>AND Artinya perbandingan nya jika <strong>kanan dan kiri true</strong> maka akan <strong>true</strong></td>
        </tr>
        <tr>
            <td>||</td>
            <td>OR Artinya perbandingan nya jika <strong>minimal kanan atau kiri bernilai true</strong> maka akan <strong>true</strong></td>
        </tr>
        <tr>
            <td>!</td>
            <td>NOT Artinya akan berkebalikan jika true menjadi false jika false menjadi true</td>
        </tr>
    </tbody>
</table>

### Cara pengunaanya : 
<ul>
    <li>hasil = cek && hadir == 'A'</li>
    <li> hasil = cek || hadir == 'A'</li>
    <li>hasil = !cek</li>
</ul>
catatan : Operasi ini hanya berlaku untuk tipe data boolean jadi perhatikan dulu apakah tipe datanya boolean atau bukan

## Operasi penkondisian (if expression)
Penkondisian if expression merupakan operasi yang di gunakan untuk mengeksekusi code sesuai kondisi tertentu

### cara penggunaanya :
- if(nilai > 90){
        println("Bagus beut anjing")
    } = merupakan kondisi pertama yang akan di cek jika sesuai dengan kondisi maka program yang ada di dalam akan di jalankan
- else if(nilai >70){
        println("Mantap beut mayan")
    } = merupakan kondisi kedua yang akan di cek jika kondisi if pertama tidak sesuai dengan kondisi yang di tentukan dan program yang ada di dalma else if maka akan di jalankan
- else{
        println("Belegug belegug teuing ai maneh")
    } = merupakan kondisi terakhir jika semua if dan if else tidak ada yang sesuai kondisi maka program yang ada di kondisi else maka yang akan di jalankan

catatan : Operasi if kondisi nya harus lah bertipe boolean sehingga dapat di gunakan


## Operasi perbandingan when
Operasi perbandingan when merupakan operasi perbandingan yang jarang di temui di bahasa pemograman lain serta operasi perbandingan ini merupakan perbandingan mirip dengna if else

### When yang tidak memiliki kondisi
when ini merupakan when yang hanya menyamankan tipe data dan value nya saja dan tidak ada kondisi yang di tentukan

#### cara penggunaanya :
-   when(grade){
        'A' -> println("Nilai mu bagus anak anak ")
        'B' -> println("Nilai mu sudah lumayan anak anak")
        'C' -> println("Nilai mu mulai goreng anak anak")
        else -> {
            println("Geus teu lulus maneh beul")
        }
    }
catatan : when ini harus lah memiliki tipe data yang sama dan value yang sama

### when yang memiliki kondisi expressi
when ini merupakan when yang memiliki kondisi expressi di dalam nya sehingga bisa membandingkan nilai yang di tentukan

#### cara penggunaanya :
-     val angka = 5
    when{
        angka > 9  -> println("Berhasil")
        angka < 8 -> println("Lumayan")
        else -> println("aweh nu di kabisa manehma")
    }
catatan : when ini akan membandingkan 2 nilai

### when multi 
when ini merupakan when yang isinya memiliki banyak kondisi untuk dalam mau menjalankan 1 program

#### cara  penggunaanya : 
-     when(coba){
        "A","B","C" -> println("nah eta mah parada lulus")
        else -> println("Astagfirullah ujang bisa bisana ga bisa lulus")
    }
    catatan : when ini dapat memiliki banyak kondisi

### when in 
when ini merupakan when ketika kita ingin membandingkna nilai nya apakah ada di dalam list atau array 

#### cara penggunaanya :
-   val lulus : Array<String> = arrayOf("A","B","C")
    when (coba){
        in lulus -> println("Lulus")
        !in lulus -> println("Tidak lulus")
    }
    catatan : when ini dapat membandingkan nilai apakah ada di dalam array atau list

### when is
when ini merupakan when yang hanya mengecek tipe data dari apa yang di banding 

#### cara penggunaanya :
-     when(coba){
        is String -> println("tipe datanya adalah string")
        is Char -> println("Tipe datanya adalah char")
        else -> println("tidak ada tipe data")    }

    catatan : when ini dapat mengecek tipe data dari apa yang di banding

## Operasi perulangan for
Looping atau perulangan di dalam pemograman berfungsi untuk mengulang baris kode dan akan berhenti jika kondisi tertentu terpenuhi.
salah satu contoh perulangan adalah <strong>FOR</strong>

### For dalam perulangan mengambil isi dari array

#### cara pengunaanya :
-   val arr : Array &lt;String&gt; =  arrayOf("Nugie kurniawan","Rakha sagraha","Rizal hidayatulloh","Muhammad raihan setiaman")
    for (i in arr){
        println(i)
    }

### For dengan menggunakan range

#### cara penggunaanya : 
- var ukuran = 10
    for (i in 0..ukuran){
        println("Sudah mengulang ke $i kali")
    }

### For Untuk array tetapi mendapatkan index 

#### cara penggunaanya : 
-  var index = arr.size - 1
    for(i in 0..index){
        println("Index ke $i adalah ${arr.get(i)}")
    }

## Operasi looping while