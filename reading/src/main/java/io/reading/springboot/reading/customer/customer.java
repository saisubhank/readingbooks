package io.reading.springboot.reading.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")

public class customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long cid;
	@Column(name = "cname" , nullable = false)
	private String cname;
	
	public customer() {
		
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
