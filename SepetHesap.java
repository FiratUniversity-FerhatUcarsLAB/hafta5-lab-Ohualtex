/*
 * Ad Soyad: Miraç Duran
 * Ogrenci No: 250541091
 * Tarih: 13.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // sabitler
    public static final double VAT_RATE = 0.18;      // %18 KDV
    public static final double SHIPPING_FEE = 29.99; // TL

    // bir ürünün toplam fiyati (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
        return price * quantity;
    }

    // 3 ürünün ara toplami
    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    // indirim tutari (araToplam * (indirimYüdesi / 100))
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100.0);
    }

    // indirimli fiyat (araToplam - indirimTutarı)
    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // KDV tutari (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    // genel toplam (indirimliTutar + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===\n");
        System.out.println("Lutfen 3 urunun bilgilerini girin:\n");

        // ürün 1
        System.out.println("URUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();
        System.out.println();

        // ürün 2
        System.out.println("URUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();
        System.out.println();

        // ürün 3
        System.out.println("URUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();
        System.out.println();

        System.out.print("Indirim Kuponu Yuzdesi (%): ");
        double discountPercent = input.nextDouble();

        // hesaplamalar (sadece metot cagirilir)
        double line1 = calculateLineTotal(price1, qty1);
        double line2 = calculateLineTotal(price2, qty2);
        double line3 = calculateLineTotal(price3, qty3);

        double subtotal = calculateSubtotal(line1, line2, line3);
        double discountAmount = calculateDiscountAmount(subtotal, discountPercent);
        double discountedTotal = applyDiscount(subtotal, discountAmount);
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE);
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE);

        // çıktı
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================\n");

        System.out.printf("Urun 1 Toplam (%7.2f TL x %d): %8.2f TL%n", price1, qty1, line1);
        System.out.printf("Urun 2 Toplam (%7.2f TL x %d): %8.2f TL%n", price2, qty2, line2);
        System.out.printf("Urun 3 Toplam (%7.2f TL x %d): %8.2f TL%n", price3, qty3, line3);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                     : %8.2f TL%n%n", subtotal);

        System.out.printf("Indirim Tutari (%%%s)           : -%8.2f TL%n",
                String.format("%.0f", discountPercent), discountAmount);
        System.out.printf("Indirimli Toplam               : %8.2f TL%n%n", discountedTotal);

        System.out.printf("KDV Tutari (%%%s)               : +%8.2f TL%n",
                String.format("%.0f", VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ucreti                   : +%8.2f TL%n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                   : %8.2f TL%n", grandTotal);
        System.out.println("========================================");

        input.close();
    }
}
