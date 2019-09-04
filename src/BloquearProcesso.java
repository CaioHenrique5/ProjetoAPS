
public class BloquearProcesso implements Comando {

	private String Processo;
	private Escalonador escalonador;
	
	public BloquearProcesso(String Processo) {
		this.Processo = Processo;
	}
	
	@Override
	public void executar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desfazer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEscalonador(Escalonador e) {
		this.escalonador = e;
		
		
	}

	


}
