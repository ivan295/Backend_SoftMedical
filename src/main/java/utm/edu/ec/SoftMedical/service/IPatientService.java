package utm.edu.ec.SoftMedical.service;

import utm.edu.ec.SoftMedical.entity.Patient;

import java.util.List;

public interface IPatientService {

    public Patient registrar(Patient patient);
    public Patient modificar(Patient patient);
    public List<Patient> listar();
    public Patient listarPorId(Integer id);
    public void eliminar(Integer id);


}
