package utm.edu.ec.SoftMedical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.SoftMedical.entity.Speciality;
import utm.edu.ec.SoftMedical.service.ISpecialityService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="especialidad")

public class SpecialityController {
    @Autowired
    private ISpecialityService specialServ;

    @PostMapping
    public Speciality registrar(@RequestBody Speciality speciality) {
        return specialServ.registrar(speciality);
    }

    @GetMapping
    public List<Speciality> listar() {
        return specialServ.listar();
    }

    @GetMapping("/{id}")
    public Speciality listarPorId(@PathVariable("id") Integer id) {
        return specialServ.listarPorId(id);
    }

    @DeleteMapping
    public void eliminar(Integer id) {
        specialServ.eliminar(id);
    }

    @PutMapping
    public Speciality modificar(@RequestBody Speciality speciality){
        return specialServ.modificar(speciality);
    }

}