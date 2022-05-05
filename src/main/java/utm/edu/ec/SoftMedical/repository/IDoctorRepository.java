package utm.edu.ec.SoftMedical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.SoftMedical.entity.Doctor;

import java.util.List;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findDoctorByCmp(String cmp);
}
