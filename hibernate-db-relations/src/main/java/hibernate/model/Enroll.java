package hibernate.model;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "enroll")
public class Enroll {
    @Id
    @Column(name = "e_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int e_id;


    @OneToMany(mappedBy = "e_id")
    private Student student;

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getE_id() {
        return e_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
