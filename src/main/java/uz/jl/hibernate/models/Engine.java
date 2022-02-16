package uz.jl.hibernate.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "engine")
@ToString
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("engine")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String engineName;

}
