package oi.github.rafaelrothmann.webService.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import oi.github.rafaelrothmann.webService.entities.Category;
import oi.github.rafaelrothmann.webService.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;
    
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category Category = service.findById(id);

        return ResponseEntity.ok().body(Category);
    }

}
