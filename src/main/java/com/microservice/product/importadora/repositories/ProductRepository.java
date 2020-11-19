package com.microservice.product.importadora.repositories;

import java.sql.Blob;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservice.product.importadora.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findAll();

	@Query(value = " SELECT prod.product_id, prod.country_id, prod.group_id, "
			+ " prod.status_merchandise_id, prod.description, prod.quantity, prod.picture, prod.url_picture, prod.critical_stock "
			+ " FROM product prod " + " WHERE prod.product_id = ?1", nativeQuery = true)
	Product obtainUserAndPassword(int productId);

	@Transactional
	@Modifying
	@Query(value = " INSERT INTO Product(country_id, group_id, "
			+ " status_merchandise_id, description, quantity, picture, url_picture, critical_stock)"
			+ " VALUES (:countryId, :status_merchandise_id, :description, :quatity, :picture, :urlPicture, :criticalStock)", nativeQuery = true)
	int insertNewProduct(@Param("countryId") int countryId, @Param("statusMerchandiseId") int statusMerchandiseId,
			@Param("description") String description, @Param("quatity") int quatity, @Param("picture") Blob picture,
			@Param("urlPicture") int urlPicture, @Param("criticalStock") int criticalStock);
}
