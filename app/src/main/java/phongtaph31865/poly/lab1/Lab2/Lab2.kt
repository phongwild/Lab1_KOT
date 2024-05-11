package phongtaph31865.poly.lab1.Lab2

fun main() {
    //khai bao va su dung null safety
    do {
        println("nhap mssv")
        val mssv : String? = readLine()
        val tenSv = getTenSv(mssv!!)
        println("Ten Sv voi ma ${mssv} la: ${tenSv}")
        print("Tiếp không?(c/k):")
        val s = readLine()
        if (s == "k")
            break;
    }while (true)
    println("End!!!!")
}
val danhSachSv: Map<String, String> = mutableMapOf("PH31865" to "Tran Anh Phong", "PH14233" to "Tran Phuong Thao")

fun getTenSv(mssv: String) : String? {
    val tenSv = danhSachSv.get(mssv)
    if (tenSv === null){
        return "Khong tim thay ten sv"
    }
    return tenSv
}