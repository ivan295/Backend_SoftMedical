package utm.edu.ec.SoftMedical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.SoftMedical.entity.Speciality;

public interface ISpecialityRepository extends JpaRepository<Speciality,Integer> {
}
