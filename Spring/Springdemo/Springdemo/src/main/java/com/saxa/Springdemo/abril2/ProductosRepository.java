package com.saxa.Springdemo.abril2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository  extends JpaRepository<ProductoEntity, Long>{

}
