package cl.charlie.pizzeria.persitence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@IdClass(OrderItemId.class)
@Getter
@Setter
@NoArgsConstructor
public class OrderItemEntity {

    private Integer idOrder;

    private Integer idItem;

    private Integer idPizza;

    private Double quantity;

    private Double price;

    private OrderEntity order;

    private PizzaEntity pizza;



}
