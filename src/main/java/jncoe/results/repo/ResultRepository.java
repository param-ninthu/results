package jncoe.results.repo;

import jncoe.results.model.Results;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ResultRepository extends MongoRepository<Results, ObjectId> {
    Optional<Results> findResultByIndexNo(String indexNo);
}
