package com.agiles.UniChain.feature.canteen.entity;

import com.agiles.UniChain.generic.model.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FoodOrder extends BaseEntity {

    @ManyToOne
    private FoodItem foodItem;

    @ManyToOne
    private Restaurant restaurant;

    private String studentName;

    private String status;

}
