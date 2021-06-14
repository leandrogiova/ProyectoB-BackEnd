package MiProyecto.App1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import MiProyecto.App1.Service.ProductosService;
import lombok.Data;

@RestController
@RequestMapping("/productos")
@Data
public class ProductosController {

    @Autowired
    private ProductosService productoServi;

    @GetMapping
    public void funicon(){}
}
