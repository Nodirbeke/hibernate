package uz.jl.hibernate.models;


import javax.persistence.*;

@Entity
@MappedSuperclass
public class Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
