/*
 * Ad Soyad: Miraç Duran
 * Ogrenci No: 250541091
 * Tarih: 12.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // sabitler
    public static final double PI = Math.PI;

    // kare alanı
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // kare çevresi
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // dikdörtgen alanı
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // dikdörtgen çevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // daire alanı
    public static double calculateCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    // daire çevresi
    public static double calculateCircleCircumference(double radius) {
        return 2 * PI * radius;
    }

    // üçgen alanı (taban ve yükseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }

    // üçgen çevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===\n");

        // kare
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double kareKenar = read.nextDouble();
        System.out.println();

        // dikdörtgen
        System.out.println("DIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double dikKisa = read.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double dikUzun = read.nextDouble();
        System.out.println();

        // daire
        System.out.println("DAIRE:");
        System.out.print("Yaricap (cm): ");
        double yaricap = read.nextDouble();
        System.out.println();

        // üçgen
        System.out.println("UCGEN:");
        System.out.print("Taban (cm): ");
        double ucgenTaban = read.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double ucgenYukseklik = read.nextDouble();
        System.out.print("1. kenar (cm): ");
        double a = read.nextDouble();
        System.out.print("2. kenar (cm): ");
        double b = read.nextDouble();
        System.out.print("3. kenar (cm): ");
        double c = read.nextDouble();

        // Hesaplamalar (sadece metot çağrıları)
        double kareAlan = calculateSquareArea(kareKenar);
        double kareCevre = calculateSquarePerimeter(kareKenar);

        double dikAlan = calculateRectangleArea(dikKisa, dikUzun);
        double dikCevre = calculateRectanglePerimeter(dikKisa, dikUzun);

        double daireAlan = calculateCircleArea(yaricap);
        double daireCevre = calculateCircleCircumference(yaricap);

        double ucgenAlan = calculateTriangleArea(ucgenTaban, ucgenYukseklik);
        double ucgenCevre = calculateTrianglePerimeter(a, b, c);

        // çıktı
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================\n");

        System.out.printf("KARE (kenar: %.1f cm):%n", kareKenar);
        System.out.printf("  Alan      : %.2f cm²%n", kareAlan);
        System.out.printf("  Cevre     : %.2f cm%n%n", kareCevre);

        System.out.printf("DIKDORTGEN (%.1f x %.1f cm):%n", dikKisa, dikUzun);
        System.out.printf("  Alan      : %.2f cm²%n", dikAlan);
        System.out.printf("  Cevre     : %.2f cm%n%n", dikCevre);

        System.out.printf("DAIRE (yaricap: %.1f cm):%n", yaricap);
        System.out.printf("  Alan      : %.2f cm²%n", daireAlan);
        System.out.printf("  Cevre     : %.2f cm%n%n", daireCevre);

        System.out.printf("UCGEN (taban: %.1f, yukseklik: %.1f cm):%n", ucgenTaban, ucgenYukseklik);
        System.out.printf("  Alan      : %.2f cm²%n", ucgenAlan);
        System.out.printf("  Cevre     : %.2f cm%n%n", ucgenCevre);

        System.out.println("========================================");
        read.close();
    }
}
