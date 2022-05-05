package utm.edu.ec.SoftMedical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.SoftMedical.entity.Doctor;
import utm.edu.ec.SoftMedical.repository.IDoctorRepository;
import utm.edu.ec.SoftMedical.service.IDoctorService;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DoctorServiceImpl implements IDoctorService {
    @Autowired
    private EntityManager entityManager;

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

    @Override
    public List<Doctor> findDoctorByCmp(String cmp) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Doctor> query = cb.createQuery(Doctor.class);
        Root<Doctor> doctor = query.from(Doctor.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> valuePath = doctor.get("cmp");
        //Path<String> namePath = product.get("name");
        predicates.add(cb.equal(valuePath, cmp));
//        predicates.add(cb.like(namePath, "%3"));

        query.select(doctor).where(cb.and(predicates
                .toArray(new Predicate[0]))).orderBy((cb.desc(valuePath)));
        return entityManager.createQuery(query).getResultList();
    }

}