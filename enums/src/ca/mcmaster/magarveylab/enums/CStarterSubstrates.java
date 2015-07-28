package ca.mcmaster.magarveylab.enums;

import java.util.Arrays;

/**
 * Enum for C-starter peptide starter units.
 * @author skinnider
 *
 */
public enum CStarterSubstrates {
	DptA	("O=C(I)CCCCCCCCC"),
	LptA	("O=C(I)CCCCCCCCC"),
	CdaPS1	("O=C(C1C(O1)CCC)I"),
	SrfA	("O=C(CC(CCCCCCCCCC(C)C)O)I"),
	LchAA	("O=C(CC(CCCCCCCCCC(C)C)O)I"),
	XltA	("O=C(I)CC(O)CCCCCCC"),
	ViscA	("O=C(I)CC(O)CCCCCCC"),
	WLIP	("O=C(I)CC(O)CCCCCCC"),
	MassA	("O=C(I)CC(O)CCCCCCC"),
	PsoA	("O=C(I)CCCCC"),
	SyrE	("O=C(CC(CCCCCCCCC)O)I"),
	ArfA	("O=C(I)CC(O)CCCCCCC"),
	TaaA	("O=C(I)CC(O)CCCCC"),
	SypA	("O=C(I)CC(O)CCCCCCC"),
	OfaA	("O=C(I)CC(O)CCCCCCCCCCC"),
	SyfA	("O=C(I)CC(O)CCCCCCC"),
	LpmA	("IC(/C=C/CCCCCCCCCC(C)C)=O"),
	HasV	("O=C(I)C(O)C(O)CCCCCCCCCCC"),
	PmxE	("O=C(CCCCC(C)CC)I"),
	NosA	("CCCC(I)=O"),
	LpiB	("O=C(I)CC(O)CCCCCCCCCCC"),
	McnA	("O=C(I)CCCCC"),
	PstA	("IC(/C=C\\CCCCCCCCCC(C)C)=O"),
	FenC	("IC(CC(O)CCCCCCCCCCCCC)=O"),
	GlbF	("IC(/C=C/C=C/CCCCCCC)=O"),
	EndA	("O=C(I)/C=C\\C=C\\CCCCC(C)C"),
	AryB	("O=C(I)CCCCCCCCC(C)C"),
	antE	("IC(C1=CC=CC(NC=O)=C1O)=O"),
	clbN	("CCCCCCCCCCCCCC(I)=O"),
	EpxD	("CC(I)=O"),
	griA	("CC(I)=O"),
	pstB	("IC(C/C=C\\CCCCCCCC(C)C)=O"),
	griE	("OC1=C(C(I)=O)C=CC=C1O"),
	HrmO	("IC(C1=CC=CN1)=O"),
	act2_C1_start		("CC1=CC=C(C(N)=C1O)C(I)=O"),
	bacil2_C1_start		("OC1=C(C(I)=O)C=CC=C1O"),
	cdaps1_C1_start		("O=C(I)C1C(CCC)O1"),
	fengy3_C1_start		("IC(CC(O)CCCCCCCCCCCCC)=O"),
	liche1_C1_start		("O=C(CC(CCCCCCCCCC(C)C)O)I"),
	prist1_C1_start		("OC1=C(C(I)=O)N=CC=C1"),
	surfa4_C1_start		("O=C(CC(CCCCCCCCCC(C)C)O)I"),
	syrin1_C1_start		("O=C(CC(CCCCCCCCC)O)I"),
	tioR_C1_start		("IC(C1=NC2=C(C=C1O)C=CC=C2)=O"),
	Thalassospiramide	("O=C(\\C=C/CCCCCCC)I"),
	Skyllamycin			("O=C(I)CCC1=CC(/C=C/C)=CC=C1"),
	Echinomycin			("IC(C1=NC2=CC=CC=C2N=C1)=O"),
	WS9326				("O=C(I)CCC1=CC(/C=C/C)=CC=C1"),
	viridogrisein		("OC1=C(N=CC=C1)C(I)=O"),
	SW_163				("IC(C1=NC2=CC=CC=C2C=C1O)=O"),
	Taromycin			("CCC/C=C/C=C/C(I)=O"),
	Tridecaptin			("O=C(I)CC(O)CCC(CC)C"),
	;
	
	private final String smiles;
	private CStarterSubstrates(final String smiles) {
		this.smiles = smiles;
	}
	
	public String smiles() {
		return smiles;
	}
	
	public static String[] names() {
	    return Arrays.toString(CStarterSubstrates.values()).replaceAll("^.|.$", "").split(", ");
	}
	
}