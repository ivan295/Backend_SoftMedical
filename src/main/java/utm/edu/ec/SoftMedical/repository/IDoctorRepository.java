package utm.edu.ec.SoftMedical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.SoftMedical.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {
}
