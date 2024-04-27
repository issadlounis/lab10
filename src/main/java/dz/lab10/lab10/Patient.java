package dz.lab10.lab10;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="patients")
public class Patient {
    @Id
    private ObjectId _id;
    private String nom, prenom;
    private String date;
    private String sexe;

    @Override
    public String toString() {
        return "Patient{_id=" + _id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date='" + date + '\'' +
                ", sexe='" + sexe +
                '}';
    }
}
