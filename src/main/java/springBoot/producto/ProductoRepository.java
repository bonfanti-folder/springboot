package springBoot.producto;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import springBoot.modelo.Producto;


public interface ProductoRepository extends CrudRepository<Producto, Long> {
	List<Producto> findByNombre(String nombre);
}