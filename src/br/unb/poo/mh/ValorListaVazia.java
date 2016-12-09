package br.unb.poo.mh;

public class ValorListaVazia<T extends Valor> extends ValorLista<T>{

	public ValorListaVazia(){
		super();
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

	@Override
	public boolean checarTipo() {
		return true;
	}

	@Override
	public Valor avaliar() {
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ValorLista<T> adicionar(T valor) {
		ValorListaNVazia<T> nova = new ValorListaNVazia<T>(valor);
		nova.setAnt(null);
		nova.setProx(this);
		this.setAnt(nova);
		return nova;
	}

	@Override
	public void remover() {
		if(this.getAnt() == null){
			try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}

	public T getValor(){
		return null;
	}
}