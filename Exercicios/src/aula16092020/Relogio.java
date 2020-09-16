package aula16092020;

public class Relogio {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio() {}
	public Relogio(int hora, int minuto, int segundo) {
		setRelogio(hora, minuto, segundo);
	}
	
	public Relogio(Relogio relogio) {
		this(relogio.getHora(), relogio.getMinuto(), relogio.getSegundo());
	}
	
	public boolean setRelogio(int hora, int minuto, int segundo) {
		boolean horaValida = setHora(hora);
		boolean minutoValido = setMinuto(minuto);
		boolean segundoValido = setMinuto(segundo);
		return horaValida && minutoValido && segundoValido;
	}
	
	public int getHora() {
		return hora;
	}
	
	public boolean setHora(int hora) {
		if(hora >= 0 && hora < 24) {
			this.hora = hora;
			return true;
		} else {
			this.hora = 0;
			return false;
		}
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public boolean setMinuto(int minuto) {
		if(minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
			return true;
		} else {
			this.minuto = 0;
			return false;
		}
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public boolean setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
			return true;
		} else {
			this.segundo = 0;
			return false;
		}
	}
	
	public void tick() {
		setSegundo(this.segundo + 1);
		
		if(this.segundo == 0) {
			incrementeMinuto();
		}
	}
	
	public void incrementeMinuto() {
		setMinuto(this.minuto + 1);
		
		if (this.minuto == 0){
			incrementeHora();
		}
	}
	
	public void incrementeHora() {
		setMinuto(this.hora + 1);
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d%02d %s",
				getHora() == 0 || getHora() == 12 ? 12 : getHora() % 12,
				getMinuto(),
				getSegundo(),
				getHora() < 12 ? "AM" : "PM"
				);
	}
	
}
