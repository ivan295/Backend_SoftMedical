package utm.edu.ec.SoftMedical.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.SoftMedical.entity.Consult;
import utm.edu.ec.SoftMedical.service.IConsultService;
import java.util.List;

@RestController
@RequestMapping(path="/consulta")

public class ConsultController {

    @Autowired
    private  IConsultService conServ;

    @GetMapping
    public List<Consult> listar(){
        return conServ.listar_consult();
    }

    @GetMapping("/{id}")
    public Consult listarPorId(@PathVariable("id") Integer id){
        return conServ.listarPorId_consult(id);
    }

    @PostMapping
    public Consult registrar(@RequestBody Consult consult){

        return conServ.registrar_consult(consult);
    }

    @PutMapping
    public Consult modificar(@RequestBody Consult consult){
        return conServ.modificar_consult(consult);
    }

    @DeleteMapping
    public void eliminar(@RequestParam Integer id){
        conServ.eliminar_consult(id);
    }
}