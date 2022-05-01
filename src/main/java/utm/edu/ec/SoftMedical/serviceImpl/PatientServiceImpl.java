package utm.edu.ec.SoftMedical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.SoftMedical.entity.Patient;
import utm.edu.ec.SoftMedical.repository.IPatientRepository;
import utm.edu.ec.SoftMedical.service.IPatientService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PatientServiceImpl implements IPatientService {
    @Autowired
    private IPatientRepository patientRepo;

    @Override
    public Patient registrar(Patient patient)
    {
        return patientRepo.save(patient);
    }

    @Override
    public Patient modificar(Patient patient)
    {
        return patientRepo.save(patient);
    }

    @Override
    public List<Patient> listar()
    {
        return patientRepo.findAll();
    }

    @Override
    public Patient listarPorId(Integer id)
    {
        Optional<Patient> op = patientRepo.findById(id);
        return op.isPresent() ? op.get() : new Patient();
    }

    @Override
    public void eliminar(Integer id) {
        patientRepo.deleteById(id);
    }
}
