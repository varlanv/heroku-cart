package com.cvproject.herokushop.playground;


import org.springframework.web.bind.annotation.*;

@RestController
class RestControllerCheck {

    private final RandomEntityRepo repository;

    public RestControllerCheck(RandomEntityRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/api")
    public Iterable<RandomEntity> entityList() {
        return repository.findAll();
    }

    @PostMapping("/api/post")
    public RandomEntity insert(@RequestBody RandomEntity user){
        System.out.println();
        System.out.println(user);
        System.out.println();
        return repository.save(user);
    }
}