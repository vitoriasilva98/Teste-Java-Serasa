package com.teste.java.serasa.model;

public enum ClassificacaoScore {

	INSUFICIENTE("Insuficiente", 0, 200), 
	INACEITAVEL("Inaceitável", 201, 500), 
	ACEITAVEL("Aceitável", 501, 700),
	RECOMENDAVEL("Recomendável", 701, 1000);

	private String scoreDescricao;
	private Integer scoreInicial;
	private Integer scoreFinal;
	
	private ClassificacaoScore(String scoreDescricao, Integer scoreInicial, Integer scoreFinal) {
		this.scoreDescricao = scoreDescricao;
		this.scoreInicial = scoreInicial;
		this.scoreFinal = scoreFinal;
	}

	public static String classificao(Integer pontuacao) {
		for (ClassificacaoScore cs : values()) {
			if (pontuacao <= cs.scoreFinal && pontuacao >= cs.scoreInicial) {
				return cs.scoreDescricao;
			}
		}
		return null;
	}

	public String getScoreDescricao() {
		return scoreDescricao;
	}

	public Integer getScoreInicial() {
		return scoreInicial;
	}

	public Integer getScoreFinal() {
		return scoreFinal;
	}

}
