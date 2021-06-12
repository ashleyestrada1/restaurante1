package edu.uspg.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "ordenes")
	public class Ordenes {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer idOrdenes;
		
		@Column(name = "nombres", nullable = false, length = 30)
		String nombres;
		
		@Column(name = "apellidos", nullable = false, length = 30)
		String apellidos;
		
		@Column(name = "Hora", nullable = false, length = 15)
		String Hora;
		
		@Column(name = "fecha", nullable = false, length = 15)
		String Fecha;
		

		@Column(name = "telefono", nullable = true, length = 10)
		String telefono;

		public Integer getIdOrdenes() {
			return idOrdenes;
		}

		public void setIdAlumno(Integer idOrdenes) {
			this.idOrdenes = idOrdenes;
		}

		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String gethora() {
			return Hora;
		}

		public void setHora(String hora) {
			this.Hora = hora;
		}

		public String getfecha() {
			return Fecha;
		}

		public void setFecha(String fecha) {
			this.Fecha = fecha;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		
	}