package crud;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="my_order")
public class MyOrder {

	@Id
	@Column(name="order_id")
	Long orderId;

	@Column(name="order_date")
	Date orderDate;

}
