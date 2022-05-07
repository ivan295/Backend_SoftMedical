package utm.edu.ec.SoftMedical.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.SoftMedical.entity.Speciality;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SpecialityRepositoryTest {
    @Autowired
    ISpecialityRepository repospeciality;

    @Test
    public void shouldGetSpecialityByValue() {
        Speciality specialitysave = new Speciality();
        specialitysave.setDescription("especialidad 1");
        repospeciality.save(specialitysave);

        Optional<Speciality> customerSaved = repospeciality.findById(specialitysave.getId_speciality());
        Assertions.assertEquals(customerSaved.get().getDescription(), specialitysave.getDescription(),
                "Created Speciality name is not the same");
        repospeciality.delete(specialitysave);
    }
}
