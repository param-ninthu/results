package jncoe.results.controller;

import jncoe.results.model.Results;
import jncoe.results.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/result")
@CrossOrigin(origins = "http://127.0.0.1:5173")
public class ResultsController {
    @Autowired
    private ResultsService resultsService;

    @PostMapping
    public ResponseEntity<Results> getResultByIndexNo(@RequestBody String indexNo){
       Optional<Results> results = resultsService.getResult(indexNo);
       if(results.isPresent()){
           Results displayResults = results.get();
           return new ResponseEntity<>(displayResults,HttpStatus.OK);
       }else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
}
