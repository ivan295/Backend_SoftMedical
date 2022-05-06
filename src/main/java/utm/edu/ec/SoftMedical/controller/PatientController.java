package utm.edu.ec.SoftMedical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.SoftMedical.entity.Patient;
import utm.edu.ec.SoftMedical.service.IPatientService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/paciente")

public class PatientController {

    @Autowired
    private IPatientService patienSer;

    @PostMapping
    public Patient registrar(@RequestBody Patient patient){
        return patienSer.registrar(patient);
    }
    @GetMapping
    public List<Patient> listar(){
        return patienSer.listar();
    }
    @GetMapping("/{id}")
    public Patient listarPorId(@PathVariable("id") Integer id){
        return patienSer.listarPorId(id);
    }
    @DeleteMapping()
    public void eliminar(@RequestParam Integer id){
        patienSer.eliminar(id);
    }
    @PutMapping
    public Patient modificar(@RequestBody Patient patient){
        return patienSer.modificar(patient);
    }
}