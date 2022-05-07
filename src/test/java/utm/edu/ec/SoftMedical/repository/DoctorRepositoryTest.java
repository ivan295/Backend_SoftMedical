package utm.edu.ec.SoftMedical.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.SoftMedical.entity.Doctor;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DoctorRepositoryTest {
    @Autowired
    IDoctorRepository repodoctor;

    @Test
    public void shouldGetDoctorByValue(){
        Doctor docsave = new Doctor();
        docsave.setName("doctor 1");
        docsave.setLastname("apellido doctor 1");
        docsave.setDni("1234569875");
        docsave.setCmp("doc001");
        repodoctor.save(docsave);

        Optional<Doctor> customerSaved = repodoctor.findById(docsave.getId_doctor());
        Assertions.assertEquals(customerSaved.get().getName(), docsave.getName(),
                "Created customer name is not the same");

        List<Doctor> listdoctor = repodoctor.findDoctorByCmp("doc001");
        Assertions.assertFalse(listdoctor.isEmpty(), "should return some elements");

        repodoctor.delete(docsave);


    }
}
