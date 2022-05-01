package utm.edu.ec.SoftMedical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.SoftMedical.entity.Speciality;
import utm.edu.ec.SoftMedical.repository.ISpecialityRepository;
import utm.edu.ec.SoftMedical.service.ISpecialityService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SpecialityServiceImpl implements ISpecialityService {
    @Autowired
    private ISpecialityRepository specialRepo;

    @Override
    public Speciality registrar(Speciality speciality) {
        return specialRepo.save(speciality);
    }

    @Override
    public Speciality modificar(Speciality speciality) {
        return specialRepo.save(speciality);
    }

    @Override
    public List<Speciality> listar() {
        return specialRepo.findAll();
    }

    @Override
    public Speciality listarPorId(Integer id) {
        Optional <Speciality> op = specialRepo.findById(id);
        return op.isPresent() ? op.get() : new Speciality();
    }

    @Override
    public void eliminar(Integer id) {
        specialRepo.deleteById(id);
    }
}
