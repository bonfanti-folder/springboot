package springBoot.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springBoot.empresa.Empresa;
import springBoot.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    ProductoRepository repository;

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        List<Producto> list = new ArrayList<>();
        Iterable<Producto> Productos = repository.findAll();

        Productos.forEach(list::add);
        return list;
    }

    @PostMapping(value="/productos")
    public Producto postCustomer(@RequestBody Producto producto) {
        repository.save(producto);
        return producto;
    }

    @GetMapping(value="/productos/{nombre}",  produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> findByNombre(@PathVariable String nombre) {
        return repository.findByNombre(nombre);
    }

    @DeleteMapping(value="/Producto/{id}")
    public void deleteProducto(@PathVariable long id){
        repository.delete(id);
    }
}