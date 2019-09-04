
public interface Comando {
	void executar();
	void desfazer();
	void setEscalonador(Escalonador e);
	

}
