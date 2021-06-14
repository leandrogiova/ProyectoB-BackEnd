package MiProyecto.App1.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiProyecto.App1.Repository.ProductosRepository;
import lombok.Data;

@Service
@Data
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepo;

    //public List<Productos> obtenerTodosLosUsuarios(){
    //    return  productosRepo.findAll();
    //}
}
