package oi.github.rafaelrothmann.webService.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import oi.github.rafaelrothmann.webService.entities.Order;
import oi.github.rafaelrothmann.webService.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;
    
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order Order = service.findById(id);

        return ResponseEntity.ok().body(Order);
    }

}
