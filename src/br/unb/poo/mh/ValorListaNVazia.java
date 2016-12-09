package br.unb.poo.mh;

public class ValorListaNVazia<T extends Valor> extends ValorLista{

	protected Valor valor;

	public ValorListaNVazia(Valor valor) {
		super();
		this.valor = valor;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

	@Override
	public Valor avaliar() {
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ValorLista adicionar(Valor valor) {
		ValorListaNVazia<T> nova = new ValorListaNVazia<T>(valor);
		nova.setAnt(null);
		nova.setProx(this);
		this.setAnt(nova);
		return nova;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void remover() {
		if(this.getAnt() != null){
			this.getAnt().setProx(this.getProx());
		}

		this.getProx().setAnt(this.getAnt());

		try {
			this.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public T getValor(){
		return (T)valor;
	}
}
