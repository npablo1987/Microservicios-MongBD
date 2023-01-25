package servicio;

import entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ProductRepository;

import java.util.List;

@Service
public class ServiceProduct {

    @Autowired
    ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductoEntity> listarProductos(){
        return (List<ProductoEntity>) productRepository.findAll();
    }

    @Transactional
    public void crearProducto(ProductoEntity producto){
        productRepository.save(producto);
    }

}
