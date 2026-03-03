

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Produtos;
import com.example.demo.services.ProdutosService;


@RestController
@RequestMapping("/produtos")
public class ProdtosResources {
    
    private final ProdutosService service;

    public ProdtosResources(ProdutosService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Produtos>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}
