package uz.jl.hibernate.models.m2m;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subjectName;

    @ManyToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinTable(name = "student_subject",
            joinColumns = {@JoinColumn(name = "subject_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;
}
