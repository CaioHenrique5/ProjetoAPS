import java.util.Stack;

public class FachadaEscalonador {

	private Escalonador escalonador = new Escalonador();
	private Stack<Comando> pilhaComandos = new Stack<>();
	
	public FachadaEscalonador(TipoEscalonador tipoEscalonador) {

		if (tipoEscalonador.equals(escalonador.escalonadorRoundRobin())) {
			escalonador = new EscalonadorRoundRobin(tipoEscalonador);
		} else {
			escalonador = new EscalonadorPrioridade(tipoEscalonador);
		}
	}

	public FachadaEscalonador(TipoEscalonador tipoEscalonador, int quantum) {
		if (tipoEscalonador.equals(escalonador.escalonadorRoundRobin())) {
			escalonador = new EscalonadorRoundRobin(quantum);
		} else {
			escalonador = new EscalonadorPrioridade(quantum);
		}
	}

	public void executar(Comando c) {
		c.executar();
		pilhaComandos.add(c);
	}

	public void desfazer(int niveis) {
		for (int i = 0; i < niveis; i++) {
			Comando c = pilhaComandos.pop();
			c.desfazer();
		}
	}

	
}
