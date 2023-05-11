package com.nttdata.taller2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Product> shopping = Arrays.asList(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
		//Coste total de la compra
		
        BigDecimal coste = shopping.stream()
                .map(product -> product.price.multiply(BigDecimal.ONE.add(BigDecimal.valueOf(product.tax.percent).divide(new BigDecimal(100)))))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
		System.out.println(coste);
		
		//Listar todos los productos que empiecen por C
		List<String> ConC = shopping.stream().filter(product -> product.name.startsWith("C")).map(name -> name.name).collect(Collectors.toList());
		System.out.println(ConC);
	}

}
