package utm.edu.ec.SoftMedical.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.SoftMedical.entity.Patient;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PatientRepositoryTest {
    @Autowired
    IPatientRepository repopatient;

    @Test
    public void shouldGetPatientByValue() {
        Patient patientsave = new Patient();
        patientsave.setName("paciente 1");
        patientsave.setLastname("apellido paciente 1");
        patientsave.setDni("321654789");
        patientsave.setPhone("9876543215");
        patientsave.setAge(26);
        patientsave.setGender("any");
        repopatient.save(patientsave);

        Optional<Patient> customerSaved = repopatient.findById(patientsave.getId_patient());
        Assertions.assertEquals(customerSaved.get().getName(), patientsave.getName(),
                "Created Patient name is not the same");
    }

}
