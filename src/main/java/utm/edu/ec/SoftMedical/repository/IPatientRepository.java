package utm.edu.ec.SoftMedical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.SoftMedical.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {
}
