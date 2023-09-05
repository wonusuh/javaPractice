package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceSecond {
	Map<String, ProductSecond> products = new HashMap<>();

	public ProductServiceSecond() {
		ProductSecond p = new ProductSecond("101", "애플사과폰12", "애플전자", 1200000, "2020. 12. 12");
		products.put("101", p);
		p = new ProductSecond("102", "삼전우주폰21", "삼전전자", 1300000, "2021. 2. 2");
		products.put("102", p);
		p = new ProductSecond("103", "엘스듀얼폰", "엘스전자", 1500000, "2022. 3. 4");
		products.put("103", p);
	}

	public List<ProductSecond> findAll() {
		return new ArrayList<>(products.values());
	}

	public ProductSecond find(String id) {
		return products.get(id);
	}
}
