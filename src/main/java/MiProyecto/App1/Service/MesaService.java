package MiProyecto.App1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiProyecto.App1.Repository.MesaRepository;
import lombok.Data;

@Service
@Data
public class MesaService {
    
    @Autowired
    private MesaRepository mesaRepo;
}
