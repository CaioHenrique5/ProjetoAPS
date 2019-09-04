
public class AddProcesso implements Comando {
	
	private String Processo;
	private int Quantum;
	private Escalonador escalonador;
	
	public AddProcesso(String Processo ,int Quantum) {
		this.Processo = Processo;
		this.Quantum = Quantum;
		
	}
	
	
	@Override
	public void executar() {
		escalonador.adicionarProcesso(this.Processo);
		
	}


	@Override
	public void desfazer() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setEscalonador(Escalonador e) {
		this.escalonador = e;
		// TODO Auto-generated method stub
		
	}
	

}
