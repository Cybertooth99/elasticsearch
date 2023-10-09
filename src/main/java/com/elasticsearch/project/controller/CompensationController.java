package com.elasticsearch.project.controller;

import com.elasticsearch.project.entity.Compensation;
import com.elasticsearch.project.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compensation")
public class CompensationController {
    private final CompensationService compensationService;

    @Autowired
    public CompensationController(CompensationService compensationService)
    {
        this.compensationService = compensationService;
    }

    @PostMapping("/bulk")
    public void save()
    {
        compensationService.saveBulk();
    }
    @PostMapping
    public void save(@RequestBody Compensation compensation)
    {
        compensationService.save(compensation);
    }

    @GetMapping("/list")
    public List<Compensation> findAll()
    {
        return compensationService.findAll();
    }
}
