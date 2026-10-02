package com.example.arquitectura_henryolmedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ArquitecturaHenryOlmedoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArquitecturaHenryOlmedoApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        //Cuadrado
        System.out.println("CUADRADO");
        System.out.print("Ingrese el lado: ");
        double lado = scanner.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);

        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());

        // CIRCULO
        System.out.println("CIRCULO");
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

        // TRIANGULO
        System.out.println("TRIANGULO");
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo =
                new Triangulo(base, altura, lado1, lado2, lado3);

        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        scanner.close();
    }

}
