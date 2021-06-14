package MiProyecto.App1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiProyecto.App1.Repository.MesaProductosRepository;

@Service
public class MesaProductoService {
    
    @Autowired
    private MesaProductosRepository mesaProductoRepo;
}
