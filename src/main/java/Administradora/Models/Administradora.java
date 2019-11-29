package Administradora.Models;

public class Administradora {
	public String id;
	public String codigo;
	public String nombre;
	public String codTpId;
	public String nroId;
	public String naturaleza;
	public String multipleARP;
	public String fsp;
	public String fusionada;
	public String fechaFusion;
	
	public Administradora() {
		super();
	}
	
	public Administradora(String id, String codigo, String nombre, String codTpId, String nroId, String naturaleza,
			String multipleARP, String fsp, String fusionada, String fechaFusion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.codTpId = codTpId;
		this.nroId = nroId;
		this.naturaleza = naturaleza;
		this.multipleARP = multipleARP;
		this.fsp = fsp;
		this.fusionada = fusionada;
		this.fechaFusion = fechaFusion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodTpId() {
		return codTpId;
	}
	public void setCodTpId(String codTpId) {
		this.codTpId = codTpId;
	}
	public String getNroId() {
		return nroId;
	}
	public void setNroId(String nroId) {
		this.nroId = nroId;
	}
	public String getNaturaleza() {
		return naturaleza;
	}
	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}
	public String getMultipleARP() {
		return multipleARP;
	}
	public void setMultipleARP(String multipleARP) {
		this.multipleARP = multipleARP;
	}
	public String getFsp() {
		return fsp;
	}
	public void setFsp(String fsp) {
		this.fsp = fsp;
	}
	public String getFusionada() {
		return fusionada;
	}
	public void setFusionada(String fusionada) {
		this.fusionada = fusionada;
	}
	public String getFechaFusion() {
		return fechaFusion;
	}
	public void setFechaFusion(String fechaFusion) {
		this.fechaFusion = fechaFusion;
	}	

}
