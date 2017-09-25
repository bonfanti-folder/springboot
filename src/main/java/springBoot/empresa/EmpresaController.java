package springBoot.empresa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @RequestMapping("/empresa")
    public Empresa getEmpresa() {
        return new Empresa("Folder IT", "Somos nuestra gente", new String[]{"Valor 1", "Valor 2", "Valor 3"});
    }
}