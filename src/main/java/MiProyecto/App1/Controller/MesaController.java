package MiProyecto.App1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import MiProyecto.App1.Service.MesaService;

@Controller
public class MesaController {
    
    @Autowired
    private MesaService mesaServi;
}
