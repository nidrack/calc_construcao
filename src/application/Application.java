package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.House;
import entities.Terrain;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Terrain> test = new ArrayList<>();

		// LISTA DE TERRENOS PARA A CONSTRUÇÃO
		System.out.println("TERRENO");
		char s;
		double terrainValue = 0.0;
		double terrainArea = 0.0;
		do {
			System.out.print("Qual a área do terreno? ");
			double a = sc.nextDouble();
			System.out.print("Qual o valor por metro quadrado? ");
			double b = sc.nextDouble();
			Terrain t = new Terrain(a, b);
			/*
			 * terrainValue += t.price(); terrainArea += a;
			 */
			test.add(t);
			System.out.print("Deseja adicionar outro terreno? (s/n) ");
			sc.nextLine();
			s = sc.next().charAt(0);
		} while (s == 's');

		for (int i = 0; i < test.size(); i++) {
			terrainValue += test.get(i).price();
			terrainArea += test.get(i).getArea();
		}


		// DADOS DA CASA A SER CONSTRUIDA
		System.out.println("Casa");
		System.out.print("Qual a área da casa? ");
		double a1 = sc.nextDouble();
		System.out.print("Qual o custo unitário básico (CUB)? ");
		double b1 = sc.nextDouble();
		System.out.print("Qual a taxa de BDI? ");
		double c1 = sc.nextDouble();
		House h = new House(a1, b1, c1);

		sc.nextLine();
		System.out.printf("O custo da construção é de R$ %.2f\n", h.price());
		System.out.printf("O preço da construção é de R$ %.2f\n", h.finalPrice());
		System.out.printf("Área total do terreno: %.2fm2\nValor total to terreno: R$%.2f\n", terrainArea, terrainValue);
		System.out.printf("O preço total é de R$ %.2f\n", (h.finalPrice() + terrainValue));

		sc.close();
	}
}
