package com.apipedidos.delivery.services;

import com.apipedidos.delivery.dto.ProductDTO;
import com.apipedidos.delivery.entities.Product;
import com.apipedidos.delivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(ProductDTO::new).collect(Collectors.toList());
    }

}
