package utm.edu.ec.SoftMedical.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.SoftMedical.entity.Consult;
import utm.edu.ec.SoftMedical.entity.Speciality;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ConsultRepositoryTest {
    @Autowired
    IConsultRepository consultrepo;

    @Test
    public void shouldGetSpecialityByValue() {

    }
}
