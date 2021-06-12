
package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesas")
public class mesas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idmesas;
	
	@Column(name = "tipodemesas", nullable = false, length = 30)
	String tipodemesas;
	
	@Column(name = "numerosillas", nullable = false, length = 30)
	Integer numerosillas;
	

	public Integer getIdmesas() {
		return idmesas;
	}

	public void setIdmesas(Integer idmesas) {
		this.idmesas = idmesas;
	}

	public String getTipodemesas() {
		return tipodemesas;
	}

	public void setTipodemesas(String tipodemesas) {
		this.tipodemesas = tipodemesas;
	}

	public Integer getNumerosillas() {
		return numerosillas;
	}

	public void setNumerosillas(Integer numerosillas) {
		this.numerosillas = numerosillas;
	}


	
}