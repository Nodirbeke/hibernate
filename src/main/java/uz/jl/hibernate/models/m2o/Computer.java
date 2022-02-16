package uz.jl.hibernate.models.m2o;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String computerName;

    @OneToMany(
            targetEntity = Item.class,
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "comp_id")
    private List<Item> items;
}
