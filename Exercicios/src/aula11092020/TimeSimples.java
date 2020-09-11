package aula11092020;

public class TimeSimples {

	private int hora;
	private int minuto;
	private int segundo;
	
	
	public void setHora(int hora, int minuto, int segundo) {
		if (hora < 0 || hora > 24 || 
			minuto < 0 || minuto >= 60 ||
			segundo < 0 || segundo >= 60) {
			
			throw new IllegalArgumentException("Limite ultrapassado para hora, minuto ou segundo");
		}
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d %s", 
				(this.hora == 0 || this.hora == 12) ? 12 : this.hora % 12,
				this.minuto, this.segundo,
				(this.hora < 12 ? "AM" : "PM")
				);
	}
	
	public String horaUniversal() {
		return String.format("%02d:%02d:%02d %s", this.hora, this.minuto, this.segundo, 
				(this.hora < 12 ? "AM" : "PM"));
	}
	
}
