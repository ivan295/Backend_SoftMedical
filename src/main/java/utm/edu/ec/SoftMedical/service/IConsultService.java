package utm.edu.ec.SoftMedical.service;

import utm.edu.ec.SoftMedical.entity.Consult;

import java.util.List;

public interface IConsultService {

    public Consult registrar_consult(Consult consult);
    public Consult modificar_consult(Consult consult);
    public List<Consult> listar_consult();
    public Consult listarPorId_consult(Integer id);
    public void eliminar_consult(Integer id);
}
