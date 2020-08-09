package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class BottleOfWine extends ProductOfExcise {
	
	protected BottleOfWine(String name, BigDecimal price) {
		super(name, price, new BigDecimal("0.23"));
	}

}
