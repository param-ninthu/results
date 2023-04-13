package jncoe.results.controller;

import jncoe.results.model.Results;
import jncoe.results.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/result")
@CrossOrigin(origins = "http://127.0.0.1:5173")
public class ResultsController {
    @Autowired
    private ResultsService resultsService;

    @PostMapping
    public Optional<Results> getResult(@RequestBody String indexNo) {
        return resultsService.getResultByIndexNo(indexNo);
    }


    @GetMapping("/{indexNo}")
    public ResponseEntity<?> getResultByGet(@PathVariable String indexNo) {
        Optional<Results> result = resultsService.getResultByIndexNo(indexNo);
        if(result.isPresent()) {
            return new ResponseEntity<Results>(result.get(), HttpStatus.OK);
        } else {
            Map<String, String> errorMap = new HashMap<>();
            errorMap.put("message", "No Index");
            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.NOT_FOUND);
        }
    }

}
