package dz.lab10.lab10;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PatientRepository extends MongoRepository<Patient, ObjectId> {
    public List<Patient> findAll();
}
