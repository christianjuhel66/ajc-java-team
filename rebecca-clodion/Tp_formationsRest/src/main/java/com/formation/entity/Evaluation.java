package com.formation.entity;

public class Evaluation {

	private int numEval;
	private String typeEval;
	private int tpsEvalMin;

	public Evaluation(int numEval, String typeEval, int tpsEvalMin) {
		this.numEval = numEval;
		this.typeEval = typeEval;
		this.tpsEvalMin = tpsEvalMin;
	}

	public String getTypeEval() {
		return typeEval;
	}

	public void setTypeEval(String typeEval) {
		this.typeEval = typeEval;
	}

	public int getTpsEvalMin() {
		return tpsEvalMin;
	}

	public void setTpsEvalMin(int tpsEvalMin) {
		this.tpsEvalMin = tpsEvalMin;
	}

	public int getNumEval() {
		return numEval;
	}

	public void setNumEval(int numEval) {
		this.numEval = numEval;
	}

}
