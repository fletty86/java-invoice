package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public class FuelCanister extends ProductOfExcise {
	
	protected FuelCanister(String name, BigDecimal price) {
		super(name, price, BigDecimal.ZERO);
	}

}
