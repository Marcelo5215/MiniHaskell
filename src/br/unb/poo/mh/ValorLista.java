package br.unb.poo.mh;

public abstract class ValorLista<T extends Valor> extends Valor{

	private ValorLista<T> prox;
	private ValorLista<T> ant;

	public ValorLista() {
		prox = null;
		ant = null;
	}

	public abstract ValorLista<T> adicionar(T valor);
	public abstract T getValor();
	public abstract void remover();

	public int getTamanho(){
		int tamanho = 0;
		ValorLista<?> aux = this;

		while(!(aux instanceof ValorListaVazia<?>)){
			tamanho++;
			aux = aux.getProx();
		}

		return tamanho;
	}

	@Override
	public Tipo tipo() {
		return Tipo.Lista;
	}

	public ValorLista<T> getProx() {
		return prox;
	}

	public void setProx(ValorLista<T> prox) {
		this.prox = prox;
	}

	public ValorLista<T> getAnt() {
		return ant;
	}

	public void setAnt(ValorLista<T> ant) {
		this.ant = ant;
	}

}
