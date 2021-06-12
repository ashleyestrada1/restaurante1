package edu.uspg.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "platillos")
	public class platillos {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer idPlatillos;
		
		@Column(name = "nombres", nullable = false, length = 30)
		String nombres;
		
		@Column(name = "tipodeplatillo", nullable = false, length = 30)
		String tipodeplatillo;
		
		
		public Integer getIdPlatillos() {
			return idPlatillos;
		}

		public void setIdPlatillos(Integer idPlatillos) {
			this.idPlatillos = idPlatillos;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getTipodeplatillo() {
			return tipodeplatillo;
		}

		public void setTipodeplatillo(String tipodeplatillo) {
			this.tipodeplatillo = tipodeplatillo;
			
		}

		
		
	}