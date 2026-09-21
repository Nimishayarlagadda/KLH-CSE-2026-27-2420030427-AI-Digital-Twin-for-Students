package com.digitaltwin.backend.controller;

import com.digitaltwin.backend.service.DigitalTwinService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/digital-twin")
@CrossOrigin(origins="http://localhost:5173")
public class DigitalTwinController {
    private final DigitalTwinService service;
    public DigitalTwinController(DigitalTwinService service){this.service=service;}
    @GetMapping("/{studentId}")
    public Map<String,Object> get(@PathVariable Long studentId){return service.build(studentId);}
}
