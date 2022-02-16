package uz.jl.hibernate.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "meningCarim")
@ToString
@Table(name = "car_engine")
@DiscriminatorValue("car_engine")
public class Car extends Engine {

    private String name;

}
