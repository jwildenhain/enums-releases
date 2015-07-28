package ca.mcmaster.magarveylab.enums.substrates;

/**
 * Starter units for type II polyketide biosynthesis.
 * 
 * @author skinnider
 *
 */
public enum TypeIIPolyketideStarters {

	ACETATE("Acetate", "CC(I)=O"),
	MALONAMATE("Malonamate", "IC(CC(N)=O)=O"),
	PROPIONATE("Propionate", "CCC(I)=O"),
	BUTYRATE("Butyrate", "O=C(I)CCC"),
	ISOBUTYRATE("Isobutyrate", "CC(C)C(I)=O"),
	_2_METHYLBUTYRATE("2-methylbutyrate", "O=C(C(C)CC)I"),
	HEXADIENOATE("Hexadienoate", "O=C(I)/C=C/C=C/C"),
	BENZOATE("Benzoate", "O=C(I)C1=CC=CC=C1"),
	;

	private final String name;
	private final String smiles;
	
	private TypeIIPolyketideStarters(final String name, final String smiles) {
		this.smiles = smiles;
		this.name = name;
	}
	
	public String fullName() { 
		return name; 
	}
	
	public String smiles() { 
		return smiles; 
	}

}
