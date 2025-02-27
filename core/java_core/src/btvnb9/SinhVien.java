package btvnb9;

public class SinhVien {
        private String id;
        private String ten;
        private double diem;

        public SinhVien(String id, String name, double score) {
            this.id = id;
            this.ten = name;
            this.diem = score;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return ten;
        }

        public double getScore() {
            return diem;
        }

        @Override
        public String toString() {
            return "Sinh Viên{" +
                    "id='" + id + '\'' +
                    ", name='" + ten + '\'' +
                    ", score=" + diem +
                    '}';
        }
    }


