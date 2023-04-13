package jncoe.results.service;

import jncoe.results.model.Results;
import jncoe.results.repo.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ResultsService {
    @Autowired
    private ResultRepository resultRepository;

    public Optional<Results> getResultByIndexNo(String indexNo){
        return resultRepository.findResultByIndexNo(indexNo);
    }

}
