/*
 * Ad Soyad: Miraç Duran
 * Ogrenci No: 250541091
 * Tarih: 12.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // sabitler
    public static final double GRAVITY = 9.8; // m/s^2

    // hiz hesaplama (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // ivme hesaplama (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    // Kuvvet (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // iş (W = F * d)
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // güş (P = W / t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // kinetik enerji (0.5 * m * v^2)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // potansiyel enerji (m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    // momentum (m * v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static void main(String[] args) {
        Scanner hollow = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===\n");

        System.out.println("TEMEL OLCUMLER:");
        System.out.print("Kutle (kg): ");
        double mass = hollow.nextDouble();
        System.out.print("Mesafe (m): ");
        double distance = hollow.nextDouble();
        System.out.print("Zaman (s): ");
        double time = hollow.nextDouble();
        System.out.print("Hiz degisimi (m/s): ");
        double deltaV = hollow.nextDouble();
        System.out.print("Yukseklik (m): ");
        double height = hollow.nextDouble();

        // hesaplamalar (yalnizca metot cagirilir)
        double velocity = calculateVelocity(distance, time);
        double acceleration = calculateAcceleration(deltaV, time);
        double force = calculateForce(mass, acceleration);
        double work = calculateWork(force, distance);
        double power = calculatePower(work, time);
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
        double totalEnergy = kineticEnergy + potentialEnergy;
        double momentum = calculateMomentum(mass, velocity);

        // çıktılar
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================\n");

        System.out.println("HIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s%n", velocity);
        System.out.printf("  Ivme (a = \u0394v/t)           : %.2f m/s\u00B2%n%n", acceleration);

        System.out.println("KUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N%n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J%n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W%n%n", power);

        System.out.println("ENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J%n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J%n", potentialEnergy);
        System.out.printf("  Toplam Enerji             : %.2f J%n%n", totalEnergy);

        System.out.println("MOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s%n%n", momentum);

        System.out.println("========================================");
        hollow.close();
    }
}
