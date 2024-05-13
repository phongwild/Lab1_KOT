package phongtaph31865.poly.lab1.Lab2.Bai7

import java.util.Scanner

val cbgv = CBGV()

val scanner = Scanner(System.`in`)

fun main() {
    cbgv.themGiaoVien(Nguoi("Nguyễn Văn A", 35, "Hà Nội", "GV001"))
    cbgv.themGiaoVien(Nguoi("Trần Thị B", 28, "Hải Phòng", "GV002"))
    while (true) {
        println("Menu:")
        println("1. Hiển thị danh sách giáo viên")
        println("2. Tìm kiếm giáo viên")
        println("3. Xóa giáo viên")
        println("4. Thoát")
        print("Nhập lựa chọn: ")
        val luaChon = scanner.nextInt()
        scanner.nextLine()
        when (luaChon) {
            1 -> {
                println("Danh sách giáo viên:")
                cbgv.hienThiDanhSachGiaoVien()
            }
            2 -> {
                print("Nhập mã số giáo viên: ")
                val maSoGV = scanner.nextLine()
                val giaoVien = cbgv.timKiemGiaoVien(maSoGV)
                if (giaoVien != null) {
                    println("Thông tin giáo viên:")
                    println(giaoVien)
                } else {
                    println("Không tìm thấy giáo viên với mã số $maSoGV")
                }
            }
            3 -> {
                print("Nhập mã số giáo viên: ")
                val maSoGV = scanner.nextLine()
                cbgv.xoaGiaoVien(maSoGV)
                println("Đã xóa giáo viên với mã số $maSoGV")
            }
            4 -> {
                println("Kết thúc chương trình.")
                break
            }
            else -> println("Lựa chọn không hợp lệ!")
        }
    }
}
