package fr.oga.mscandidatemanager.controller;

import fr.oga.mscandidatemanager.entities.Condidat;
import fr.oga.mscandidatemanager.services.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/condidats")
public class CondidatRestApi {

    @Autowired
    private CondidatService CS;
    @PostMapping
    public ResponseEntity<Condidat> CreateCondidat(@RequestBody Condidat C){
        return new ResponseEntity<>(CS.AddCondidat(C), HttpStatus.CREATED);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Condidat> UpdateCondidat(@PathVariable(value ="id") Long id, @RequestBody Condidat C){
        return new ResponseEntity<>(CS.UpdateCondidat(id,C), HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> DeleteCondidat(@PathVariable(value ="id") Long id){
        return new ResponseEntity<>(CS.DeleteCondidat(id),HttpStatus.OK);
    }
}
