package utm.edu.ec.SoftMedical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.SoftMedical.entity.Consult;
import utm.edu.ec.SoftMedical.repository.IConsultRepository;
import utm.edu.ec.SoftMedical.service.IConsultService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ConsultServiceImpl implements IConsultService {

    @Autowired
    private IConsultRepository consultRepo;

    @Override
    public Consult registrar_consult(Consult consult) {
        return consultRepo.save(consult);
    }

    @Override
    public Consult modificar_consult(Consult consult) {
        return consultRepo.save(consult);
    }

    @Override
    public List<Consult> listar_consult() {
        return consultRepo.findAll();
    }

    @Override
    public Consult listarPorId_consult(Integer id) {
        Optional <Consult> op = consultRepo.findById(id);
        return op.isPresent() ? op.get() : new Consult();
    }

    @Override
    public void eliminar_consult(Integer id) {
        consultRepo.deleteById(id);
    }
}
