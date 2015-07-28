package ca.mcmaster.magarveylab.enums.substrates;

/**
 * Amino acids that form monomers in ribosomal peptides, analogous to
 * adenylation domain substrates in nonribosomal peptides. 
 * 
 * @author skinnider
 *
 */
public enum AminoAcids implements SubstrateType {

	ALANINE("", "Alanine", "A"),
	ASPARAGINE("", "Asparagine", "N"),
	ASPARTATE("", "Aspartate", "D"),
	ARGININE("", "Arginine", "R"),
	CYSTEINE("", "Cysteine", "C"),
	GLYCINE("", "Glycine", "G"),
	GLUTAMINE("", "Glutamine", "Q"),
	GLUTAMATE("", "Glutamate", "E"),
	HISTIDINE("", "Histidine", "H"),
	ISOLEUCINE("", "Isoleucine", "I"),
	LEUCINE("", "Leucine", "L"),
	LYSINE("", "Lysine", "K"),
	METHIONINE("", "Methionine", "M"),
	PHENYLALANINE("", "Phenylalanine", "F"),
	PROLINE("", "Proline", "P"),
	SERINE("", "Serine", "S"),
	THREONINE("", "Threonine", "T"),
	TRYPTOPHAN("", "Tryptophan", "W"),
	TYROSINE("", "Tyrosine", "Y"),
	VALINE("", "Valine", "V"),
	
	;
	
	private String smiles;
	private String fullName;
	private String abbreviation;
	
	private AminoAcids(String smiles, String fullName, String abbreviation) {
		this.smiles = smiles;
		this.fullName = fullName;
		this.abbreviation = abbreviation;
	}
	
	public String smiles() {
		return smiles;
	}
	
	public String hmm() {
		return "";
	}
	
	public String fullName() {
		return fullName;
	}
	
	public String abbreviation() {
		return abbreviation;
	}
	
}
