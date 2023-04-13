package jncoe.results.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "results")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Results {

    @Id
    private ObjectId id;
    private String studentNo;
    private String indexNo;
    private String course;
    private String nic;
    private String fullName;
    private String result;


    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCourse() {
        return course;
    }

    public String getResult() {
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public String getNic() {
        return nic;
    }
}
