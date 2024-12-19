package btvnb9;

import java.util.*;

public class QuanLySinhVien {
    private List<SinhVien> sinhviens;
    private Set<String> sinhvienIds;

    public QuanLySinhVien() {
        sinhviens = new ArrayList<>();
        sinhvienIds = new HashSet<>();
    }

    // Thêm sinh viên
    public void themSinhvien(String id, String name, double score) {
        if (sinhvienIds.contains(id)) {
            throw new IllegalArgumentException("ID sinh viên đã tồn tại.");
        }
        SinhVien student = new SinhVien(id, name, score);
        sinhviens.add(student);
        sinhvienIds.add(id);
        System.out.println("Sinh viên đã được thêm thành công");
    }

    // Xóa sinh viên theo ID
    public void xoaSinhvien(String id) throws Exception {
        boolean found = false;
        Iterator<SinhVien> iterator = sinhviens.iterator();
        while (iterator.hasNext()) {
            SinhVien student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                sinhvienIds.remove(id);
                found = true;
                System.out.println("Xóa sinh viên thành công");
                break;
            }
        }
        if (!found) {
            throw new  Exception("Không tìm thấy ID sinh viên.");
        }
    }

    // Hiển thị sinh viên
    public void hienthiSinhvien() {
        if (sinhviens.isEmpty()) {
            System.out.println("Không có sinh viên nào.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (SinhVien sinhvien : sinhviens) {
                System.out.println(sinhvien);
            }
        }
    }

    // Tìm kiếm sinh viên theo tên
    public void timkiemSinhvien(String name) throws Exception {
        boolean found = false;
        for (SinhVien student : sinhviens) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            throw new Exception("Không có tên sinh viên trong danh sách");
        }
    }


}

