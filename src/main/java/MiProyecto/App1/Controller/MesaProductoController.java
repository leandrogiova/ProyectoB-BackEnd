package MiProyecto.App1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import MiProyecto.App1.Service.MesaProductoService;
import lombok.Data;

@Controller
@Data
public class MesaProductoController {
    
    @Autowired
    private MesaProductoService mesaProductoServi;
}
