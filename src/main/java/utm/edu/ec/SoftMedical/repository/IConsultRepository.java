package utm.edu.ec.SoftMedical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.SoftMedical.entity.Consult;

public interface IConsultRepository extends JpaRepository<Consult,Integer> {

}
