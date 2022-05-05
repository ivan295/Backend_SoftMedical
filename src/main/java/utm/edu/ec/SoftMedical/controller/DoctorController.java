package utm.edu.ec.SoftMedical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.SoftMedical.entity.Doctor;
import utm.edu.ec.SoftMedical.service.IDoctorService;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/doctor")
public class DoctorController {
    @Autowired
    private IDoctorService doctorServ;

    @PostMapping
    public Doctor registrar (@RequestBody Doctor doctor){
        return  doctorServ.registrar(doctor);
    }

    @GetMapping
    public List<Doctor> listar(){
        return doctorServ.listar();
    }

    @GetMapping("/{id}")
    public Doctor listarPorId(@PathVariable("id")Integer id){
        return doctorServ.listarPorId(id);
    }

    @DeleteMapping
    public void eliminar(Integer id){
        doctorServ.eliminar(id);
    }

    @PutMapping
    public Doctor modificar(@RequestBody Doctor doctor){
        return doctorServ.modificar(doctor);
    }

    @GetMapping("/listcmp/{cmp}")
    public List<Doctor> findDoctorByCmp(@RequestParam String cmp) {
        return doctorServ.findDoctorByCmp(cmp);
    }

}
