package phongtaph31865.poly.lab1

fun main() {
    bai2()
    bai3()
}

fun bai2() {
    print("Nguyễn Văn Anh - PS123456\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
}

fun bai3() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readlnOrNull()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readlnOrNull()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}