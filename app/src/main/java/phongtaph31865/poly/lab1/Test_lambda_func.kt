package phongtaph31865.poly.lab1

fun main() {
    //khai bao va su dung lambda function
    val soA: Int? = 5
    val soB: Int? = 10
    val tong = tinhTong(soA!!, soB!!)
    val hieu = tinhHieu(soA, soB)
    println("Tong 2 so ${soA} va ${soB} la ${tong}")
    println("Hieu 2 so ${soA} va ${soB} la ${hieu}")
    println("Binh phuong ${soA} la ${binhPhuong(soA)} ")
    println("Binh phuong ${soB} la ${binhPhuong(soB)} ")
    println("Thuong 2 so ${soA} va ${soB} la ${tinhThuong(soA.toFloat(), soB.toFloat())()}")
    val tenSV = "nguyen van long"
    println("In hoa chuoi ${tenSV} la ${inHoa(tenSV)}")
    val length = tenSV.run {
        val l = length
        l
    }
    val a2 = soA.run{
        val kq = this*2
        kq
    }
    println("So ${soA} x 2 la ${a2}")
    println("Do dai chuoi $tenSV la: $length")
}

val tinhTong: (Int, Int) -> Int =
    { soA: Int, soB: Int -> (soA + soB) }

val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
    if (soB == 0f){
        "Khong the chia"
    }else{
        val c = soA / soB
        c
    }
}}

val inHoa: (String) -> String = String::uppercase