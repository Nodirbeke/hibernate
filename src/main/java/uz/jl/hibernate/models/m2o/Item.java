package uz.jl.hibernate.models.m2o;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor(force = true)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

//    @ManyToOne
//    private Computer computer;

}
