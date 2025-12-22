package datics.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private long customerId;
	@Column(nullable = false)
	private String customerName;
	@Column(nullable = false)
	private String customerDescription;
	@Column(nullable = false)
	private int customerAge;
	
}
