package lista;

public class AdicaoElemento implements Runnable{

	private Lista lista;
	int numeroThread;
	
	public AdicaoElemento(Lista lista, int numeroThread) {
		this.lista = lista;
		this.numeroThread = numeroThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			lista.adicionaElementos("Thread " + numeroThread + " - " + i);
		}
	}

}
