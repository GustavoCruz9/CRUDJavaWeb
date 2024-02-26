package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Disciplina {

	private int codigo;
	private String nome;
	private Professor professor;
	
}
