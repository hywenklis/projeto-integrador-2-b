package model;

public class ServidorInativo extends Pessoa {
	private Detalhes detalhes;

	public Detalhes getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(Detalhes detalhes) {
		this.detalhes = detalhes;
	}

	@Override
	public String toString() {
		return "\n NOME = '" + getNome() + '\'' +
				"\n CPF = '" + getCpf() + '\'' +
				"\n DETALHES = '" + detalhes + '\'';
	}
}
