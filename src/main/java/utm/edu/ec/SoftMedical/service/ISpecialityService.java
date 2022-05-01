package utm.edu.ec.SoftMedical.service;

import utm.edu.ec.SoftMedical.entity.Speciality;

import java.util.List;

public interface ISpecialityService {
    public Speciality registrar(Speciality speciality);
    public Speciality modificar(Speciality speciality);
    public List<Speciality> listar();
    public Speciality listarPorId(Integer id);
    public void eliminar(Integer id);
}
