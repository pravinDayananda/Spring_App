package service;

import java.util.List;
import domain.Product;
 
public interface ProductService {

	List<Product>listAllProducts();
	
	Product getProductGetById(Integer id);
	
	Product saveOrUpdateProduct(Product product);
	
	void deleteProduct(Integer id);
	
}
