package hibernate.model;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;

    @Column(name = "student_name")
    @NotNull
    private String s_name;

    @Column(name = "student_id")
    private int student_id;

    @OneToOne
    @JoinColumn(name = "e_id")
    private Enroll enroll;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Enroll getEnroll() {
        return enroll;
    }

    public void setEnroll(Enroll enroll) {
        this.enroll = enroll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", student_id='" + student_id + '\'' +
                ", enroll=" + enroll +
                '}';
    }
}
