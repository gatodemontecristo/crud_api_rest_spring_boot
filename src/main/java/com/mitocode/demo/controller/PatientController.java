package com.mitocode.demo.controller;

import com.mitocode.demo.model.Patient;
import com.mitocode.demo.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final IPatientService service;

    @GetMapping
    public List<Patient> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient) throws Exception{
        return service.save(patient);
    }

    @PutMapping("/{id}")
    public Patient update(@RequestBody Patient patient,@PathVariable("id") Integer id) throws Exception{
        return service.update(patient, id);
    }

   @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
   }

}
