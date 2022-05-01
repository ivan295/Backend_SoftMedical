package utm.edu.ec.SoftMedical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.SoftMedical.entity.Doctor;
import utm.edu.ec.SoftMedical.repository.IDoctorRepository;
import utm.edu.ec.SoftMedical.service.IDoctorService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DoctorServiceImpl implements IDoctorService {
    @Autowired
    private IDoctorRepository doctorRepo;

    @Override
    public Doctor registrar(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public Doctor modificar(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public List<Doctor> listar() {
        return doctorRepo.findAll();
    }

    @Override
    public Doctor listarPorId(Integer id) {
        Optional<Doctor> op = doctorRepo.findById(id);
        return op.isPresent() ? op.get() : new Doctor();
    }

    @Override
    public void eliminar(Integer id) {
        doctorRepo.deleteById(id);
    }

}