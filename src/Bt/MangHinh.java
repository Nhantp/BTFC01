package Bt;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangHinh {

        ArrayList<HinhVuong> a = new ArrayList<HinhVuong>();

        public void docFile(String tenFile) {
            try {
                File f = new File(tenFile);
                if (f.exists()) {
                    System.out.println("Da mo duoc file");
                    Scanner read = new Scanner(f);
                    while (read.hasNext()) {//doc den khi get 1 dong
                        Scanner line = new Scanner(read.nextLine());
                        double c1 = line.nextDouble();
                        if (line.hasNext()) {
                            double c2 = line.nextDouble();
                            a.add(new HinhChuNhat(c1, c2));
                        } else {
                            a.add(new HinhVuong(c1));
                        }
                    }
                } else {
                    System.out.println("Khong ton tai file");
                }
            } catch (Exception e) {
            }
        }

        public void xuat(String cauDan) {
            System.out.println(cauDan);
            for (HinhVuong x : a) {
                System.out.println(x);
            }
        }

        //cau2
        public HinhChuNhat maxDienTichChuNhat() {
            HinhChuNhat x = null;
            int i = 0;
            for (i = 0; i < a.size(); i++) {
                if (a.get(i) instanceof HinhChuNhat) {
                    x = (HinhChuNhat) a.get(i);
                }
            }

            for (i = i + 1; i < a.size(); i++) {
                if (a.get(i) instanceof HinhChuNhat) {
                    if (x.dienTich() < ((HinhChuNhat) a.get(i)).dienTich()) {
                        x = (HinhChuNhat) a.get(i);
                    }
                }
            }
            return x;
        }

        //
        public HinhVuong maxDienTichHinhVuong() {
            HinhVuong x = null;
            int i = 0;
            for (i = 0; i < a.size(); i++) {
                if (a.get(i) instanceof HinhVuong) {
                    x = (HinhVuong) a.get(i);
                    break;
                }
            }

            for (i = i + 1; i < a.size(); i++) {
                if (a.get(i) instanceof HinhVuong) {
                    if (x.dienTich() < ((HinhVuong) a.get(i)).dienTich()) {
                        x = (HinhVuong) a.get(i);
                    }
                }
            }
            return x;
        }

        //cau 3
        public int demHinhVuong() {
            return a.size() - demHinhChuNhat();
        }

        //cau 4
        public int demHinhChuNhat() {
            int dem = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) instanceof HinhChuNhat) {
                    dem++;
                }
            }
            return dem;
        }


        //cau 6  tang dan theo dien tich
        public void sapXepTangDanTheoDienTich() {
            for (int i = 0; i < a.size() - 1; i++) {
                for (int j = i + 1; j < a.size(); j++) {
                    if (a.get(i).dienTich() > a.get(j).dienTich()) {
                        HinhVuong x = (HinhVuong)a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, x);
                    }
                }
            }
        }

        public void Output(){
            System.out.println("Doan Vo Van Trong");
            xuat("1. Danh sach hinh : ");
            System.out.println("2. Max dien tich : " + maxDienTichHinhVuong());
            System.out.println("3. So luong hinh vuong : " + demHinhVuong());
            System.out.println("4. So luong hinh chu nhat : " + demHinhChuNhat());
            System.out.println("5. Max dien tich chu nhat : " + maxDienTichChuNhat());
            sapXepTangDanTheoDienTich();
            xuat("6. Danh sach hinh sap xep tang dan theo dien tich : ");
        }



        public static void main(String[] args) {
            MangHinh x = new MangHinh();
            x.docFile("D:\\BTFC01\\FC01\\src\\Bt\\data");
            x.Output();
        }
}
