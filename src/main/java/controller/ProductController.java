package controller;


import entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import servicio.ServiceProduct;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ServiceProduct serviceProduct;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoEntity> getallproductos(){
        return serviceProduct.listarProductos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void crearproducto(@RequestBody ProductoEntity productoEntity){
        serviceProduct.crearProducto(productoEntity);
    }

}
