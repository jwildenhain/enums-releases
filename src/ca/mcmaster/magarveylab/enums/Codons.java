package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.substrates.AminoAcids;

public enum Codons {
	
	UUU(AminoAcids.PHENYLALANINE),
	UUC(AminoAcids.PHENYLALANINE),
	UUA(AminoAcids.LEUCINE),
	UUG(AminoAcids.LEUCINE),
	UCU(AminoAcids.SERINE),
	UCC(AminoAcids.SERINE),
	UCA(AminoAcids.SERINE),
	UCG(AminoAcids.SERINE),
	UAU(AminoAcids.TYROSINE),
	UAC(AminoAcids.TYROSINE),
	UGU(AminoAcids.CYSTEINE),
	UGC(AminoAcids.CYSTEINE),
	UGG(AminoAcids.TRYPTOPHAN),
	CUU(AminoAcids.LEUCINE),
	CUC(AminoAcids.LEUCINE),
	CUA(AminoAcids.LEUCINE),
	CUG(AminoAcids.LEUCINE),
	CCU(AminoAcids.PROLINE),
	CCC(AminoAcids.PROLINE),
	CCA(AminoAcids.PROLINE),
	CCG(AminoAcids.PROLINE),
	CAU(AminoAcids.HISTIDINE),
	CAC(AminoAcids.HISTIDINE),
	CAA(AminoAcids.GLUTAMINE),
	CAG(AminoAcids.GLUTAMINE),
	CGU(AminoAcids.ARGININE),
	CGC(AminoAcids.ARGININE),
	CGA(AminoAcids.ARGININE),
	CGG(AminoAcids.ARGININE),
	AUU(AminoAcids.ISOLEUCINE),
	AUC(AminoAcids.ISOLEUCINE),
	AUA(AminoAcids.ISOLEUCINE),
	AUG(AminoAcids.METHIONINE),
	ACU(AminoAcids.THREONINE),
	ACC(AminoAcids.THREONINE),
	ACA(AminoAcids.THREONINE),
	ACG(AminoAcids.THREONINE),
	AAU(AminoAcids.ASPARAGINE),
	AAC(AminoAcids.ASPARAGINE),
	AAA(AminoAcids.LYSINE),
	AAG(AminoAcids.LYSINE),
	AGU(AminoAcids.SERINE),
	AGC(AminoAcids.SERINE),
	AGA(AminoAcids.ARGININE),
	AGG(AminoAcids.ARGININE),
	GUU(AminoAcids.VALINE),
	GUC(AminoAcids.VALINE),
	GUA(AminoAcids.VALINE),
	GUG(AminoAcids.VALINE),
	GCU(AminoAcids.ALANINE),
	GCC(AminoAcids.ALANINE),
	GCA(AminoAcids.ALANINE),
	GCG(AminoAcids.ALANINE),
	GAU(AminoAcids.ASPARTATE),
	GAC(AminoAcids.ASPARTATE),
	GAA(AminoAcids.GLUTAMATE),
	GAG(AminoAcids.GLUTAMATE),
	GGU(AminoAcids.GLYCINE),
	GGC(AminoAcids.GLYCINE),
	GGA(AminoAcids.GLYCINE),
	GGG(AminoAcids.GLYCINE),
	;
	
	private AminoAcids aminoAcid;
	
	private Codons(AminoAcids aminoAcid) {
		this.aminoAcid = aminoAcid;
	}
	
	public AminoAcids getAminoAcid() {
		return aminoAcid;
	}
	
	// stop: UAA, UAG, UGA
	
}
