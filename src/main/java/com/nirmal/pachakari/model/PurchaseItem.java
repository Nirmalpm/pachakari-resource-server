package com.nirmal.pachakari.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseItem implements Serializable{
	private int itemId;
	private String itemName;
	private BigDecimal itemPurchasedPrice;
	private int quantity;
	private String user;
	private String image;
}
