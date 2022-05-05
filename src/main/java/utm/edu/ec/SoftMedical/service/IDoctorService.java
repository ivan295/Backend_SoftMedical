package utm.edu.ec.SoftMedical.service;

import utm.edu.ec.SoftMedical.entity.Doctor;

import java.util.List;

public interface IDoctorService {
    public Doctor registrar(Doctor doctor);
    public Doctor modificar(Doctor doctor);
    public List<Doctor> listar();
    public Doctor listarPorId(Integer id);
    public void eliminar(Integer id);
    List<Doctor> findDoctorByCmp(String cmp);
}
