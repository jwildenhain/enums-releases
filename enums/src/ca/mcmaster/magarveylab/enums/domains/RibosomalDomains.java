package ca.mcmaster.magarveylab.enums.domains;

import ca.mcmaster.magarveylab.enums.DomainFamilies;

/**
 * Enum for each HMM used to identify biosynthetic information within ribosomal
 * domains
 */
public enum RibosomalDomains implements DomainType {

	//TODO: Set cutoffs
	AMINO_ACID("", "", "", 0.0d, false), // dummy amino acid domain
	
	// precursors
	AgrD("AgrD.hmm", "A", "Auto-inducing peptide precursor", 0.0, true),
	BotA("BotA.hmm", "A", "Bottromycin precursor", 0.0, true),
	ComX("ComX.hmm", "A", "ComX precursor", 0.0, true),
	CypA("cypA.hmm", "A", "Linardin precursor", 0.0, true),
	Head_to_tail_precursor("HTT_precursor.hmm", "A", "Head-to-tail cyclized peptide precursor", 0.0, true), 
	LAP_precursor("LAP_precursor.hmm", "A", "Linear azole-containing peptide precursor", 0.0, true),
	LanA("LanA.hmm", "A", "Lantipeptide precursor", 12.3d, true),
	LanA_2("LanA_2.hmm", "A", "Lantipeptide precursor (type II)", 0.0, true),
	LazA_a("tpdA_a.hmm", "A", "Thiopeptide precursor", 11.7, true),
	LazA_b("tpdA_b.hmm", "A", "Thiopeptide precursor", 11.7, true),
	Lasso_precursors("Lasso_precursors.hmm", "A", "Lasso peptide precursor", 0.0, true),
	MdnA("MdnA.hmm", "A", "Microviridin precursor", 0.0, true),
	PatE("patE.hmm", "A", "Cyanobactin precursor", 0.0, true),
	PoyA("poyA.hmm", "A", "Proteusin precursor", 72.0, true),
	SboA("sactipeptides_precursor.hmm", "A", "Sactipeptide precursor", 0.0, true),
	SunA("SunA.hmm", "A", "Glyocin precursor", 13.8, true),
	TfxA("TfxA.hmm", "A", "Trifolitoxin precursor", 0.0, true),
	TvaA("TvaA.hmm", "A", "Thioviridamide precursor", 0.0, true),
	YmA("YmA.hmm", "A", "YM-216391 precursor", 0.0, true),
	
	// tailoring
	AgeF1("AgeF1.hmm", "AgeF1", "Bifunctional N-prenyltransferase/O-methyltransferase", 66.0, false),
	AgrB("ArgB.hmm", "AgrB", "Auto-inducing peptide endopeptidase", 50.0, false),
	AlbA("Alba_homo.hmm", "AlbA", "Sactipeptide Fe-S protein", 50.0, false),
	Asparagine_synthase("asparagine_synthases.hmm", "CapC", "Lasso peptide asparagine synthase homolog", 50.0, false),
	BdbB("BdbB.hmm", "BdbB", "Disulfide bond-forming oxidoreductase", 50.0, false),
	BerH("BerH.hmm", "P450", "Valine &beta;-hydroxylase", 440.0, false),
	BotC("BotC.hmm", "BotC", "Bottromycin macrocyclodehydratase", 50.0, false),
	BotCD("BotCD.hmm", "BotCD", "Bottromycin thiazole-forming cyclodehydratase", 50.0, false),
	BotOMT("BotOMT.hmm", "BotOMT", "Bottromycin carboxymethylesterase", 55.0, false),
	BotP("BotP.hmm", "BotP", "Bottromycin leucyl-aminopeptidase", 50.0, false),
	BotRMT1("BotRMT1.hmm", "CMT", "Phenylalanine &beta;-C-methyltransferase", 50.0, false),
	BotRMT2("BotRMT2.hmm", "CMT", "Valine &beta;-C-methyltransferase", 50.0, false),
	BotRMT3("BotRMT3.hmm", "CMT", "Proline &beta;-C-methyltransferase", 50.0, false),
	CinX("CinX.hmm", "Ox", "&alpha;-ketoglutarate/iron(II)-dependent aspartate &beta;-hydroxylase", 50.0, false),
	Cinorf7("cinorf7.hmm", "Cin7", "Cinorf7-like lysinoalanine biosynthesis protein", 50.0, false),
	CltM("CltM.hmm", "CltM", "Tertiary thioether biosynthesis protein", 50.0, false),
	ComQ("ComQ.hmm", "ComQ", "ComX isoprenyltransferase", 50.0, false),
	McbB("dehydrogenase_B.hmm", "McbB", "Linear azole-containing peptide dehydratase", 50.0, false),
	McbC("cyclodehydratase_C.hmm", "McbC", "Linear azole-containing peptide cyclodehydratase C", 78.0, false),
	McbD("cyclodehydratase_D.hmm", "McbD", "Linear azole-containing peptide cyclodehydratase D", 50.0, false),
	CypH("cypH.hmm", "CypH", "Linardin threonine dehydratase", 50.0, false),
	CypL("cypL.hmm", "CypL", "Linardin serine dehydratase", 50.0, false),
	CypM("CypM.hmm", "N,N-MT", "Linardin N,N-dimethyltransferase", 50.0d, false),
	DUF95("DUF95.hmm", "DUF95", "DUF95-family enzyme", 50.0, false),
	ElxO("ElxO.hmm", "LanO", "Short chain dehydrogenase", 137.0, false),
	GarO("GarO.hmm", "LanO", "Lantithione S-oxidase", 225.0, false),
	GetJ("GetJ.hmm", "P450", "Cytochrome P450 (hydroxymethylproline biosynthesis)", 200.0, false),
	GodF("GodF.hmm", "B", "Linear azole-containing peptide dehydratase", 13.6, false),
	GodG("GodG.hmm", "B", "Linear azole-containing peptide dehydratase", 13.6, false),
	GodH("GodH.hmm", "AcT", "N-terminal acetyltransferase", 50.0, false),
	LanB("LanB.hmm", "LanB", "Lantipeptide dehydratase", 50.0, false),
	LanC("LanC.hmm", "LanC", "Lantipeptide cyclase", 50.0, false),
	LanKC("LanKC.hmm", "LanKC", "Lantipeptide kinase/cyclase (LanKC or LanL)", 50.0, false),
	LanM("LanM.hmm", "LanM", "Lantipeptide fused dehydratase/cyclase", 50.0, false),
	LanD("LanD.hmm", "LanD", "Aminovinylcysteine biosynthesis flavoprotein", 50.0, false),
	LanJ("LanJ.hmm", "LanJ", "Lantipeptide D-Ala biosynthesis protein", 50.0, false),
	LazB("tpdB.hmm", "LazB", "Thiopeptide dehydratase", 50.0, false),
	LazC("tpdD.hmm", "LazC", "Thiopeptide cycloaddition enzyme", 50.0, false),
	LazE("LazE.hmm", "LazE", "Thiopeptide cyclodehydratase", 50.0, false),
	LazF("LazF.hmm", "LazF", "Thiopeptide azole-forming oxidase", 50.0, false),
	MibH("MibH.hmm", "LanH", "Tryptophan (5) halogenase", 50.0, false),
	MibO("MibO.hmm", "P450", "Cytochrome P450 proline 3,4-dihydroxylase", 155.0, false),
	MdnB("MdnB.hmm", "MdnB", "Microviridin ATP-grasp enzyme", 50.0, false),
	MdnC("MdnC.hmm", "MdnC", "Microviridin ATP-grasp enzyme", 50.0, false),
	MdnD("MdnD.hmm", "AcT", "N-terminal acetyltransferase", 50.0, false),
	NocQ("NocQ.hmm", "OMT", "Dehydroserine O-methyltransferase", 50.0, false),
	NosA("NosA.hmm", "NosA", "NosA-type protein (C-terminal dealkylation/amide formation", 50.0, false),
	NosB("NosB.hmm", "P450", "Cytochrome P450 glutamate &gamma;-hydroxylase", 190.0, false),
	NosC("NosC.hmm", "P450", "Cytochrome P450 pyridine hydroxylase", 275.0, false),
	NosL("NosL.hmm", "NosL", "NosL-type protein (indolic acid biosynthesis)", 50.0, false),
	NosN("NosN.hmm", "NosN", "NosN-type protein (3-methylindolic acid C4 methylation)", 50.0, false),
	NosK("NosK.hmm", "NosK", "NosK-type protein (3,4-dimethylindolyl acyltransferase)", 50.0, false),
	NosI("NosI.hmm", "NosI", "NosI-type protein (indole esterification)", 50.0, false),
	PatA("patA.hmm", "PatA", "Cyanobactin leader peptide protease", 50.0, false),
	PatD("PatD.hmm", "PatD", "Cyanobactin dehydratase", 50.0, false),
	PatF("PatF.hmm", "PatF", "Cyanobactin prenyltransferase", 50.0, false),
	PatF_inactive("PatF_decoy.hmm", "PatF", "Inactive cyanobactin prenyltransferase", 50.0, false),
	PatG("PatG.hmm", "PatG", "Cyanobactin protease/macrocyclase without oxidative domain", 50.0, false),
	PatG_ox("PatG_ox.hmm", "PatG", "Cyanobactin protease/macrocyclase with oxidative domain", 50.0, false),
	PoyBC("PoyBC.hmm", "PoyBC", "Proteusin poyB/poyC-type radical SAM C-methyltransferase", 50.0, false),
	PoyD("poyD.hmm", "PoyD", "Proteusin epimerase", 50.0, false),
	PoyE("PoyE.hmm", "PoyE", "Proteusin asparagine N-methyltransferase", 50.0, false),
	PoyI("PoyI.hmm", "Ox", "Proteusin &beta;-hydroxylase", 50.0, false),
	PznL("PznL.hmm", "N,N-MT", "Linear azole-containing peptide N,N-dimethyltransferase", 50.0, false),
	SkfH("SkfH.hmm", "SkfH", "Disulfide bond-forming thioredoxin", 50.0, false),
	SunS("SunS.hmm", "SunS", "Glyocin S-glycosyltransferase", 50.0, false),
	TclD("TclD.hmm", "Ox", "Nonheme iron-dependent valine &beta;-hydroxylase", 50.0, false),
	TclO("TclO.hmm", "OMT", "Threonine O-methyltransferase", 50.0, false),
	TfxB("tfxB.hmm", "TfxB", "Trifolitoxin nitroreductase", 50.0, false),
	TfxC("tfxC.hmm", "TfxC",  "Trifolitoxin nitroreductase", 50.0, false),
	TpdI("TpdI.hmm", "CMT", "Thiazole C-methyltransferase", 50.0, false),
	TpdJ1("TpdJ1.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation "
			+ "or isoleucine epoxidation)", 450.0, false),
	TpdJ2("TpdJ2.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation "
			+ "or isoleucine epoxidation)", 450.0, false),
	TpdL("TpdL.hmm", "CMT", "Thiazole C-methyltransferase", 50.0, false),
	TpdM("TpdM.hmm", "OMT", "5-hydroxymethylthiazole O-methyltransferase", 130.0, false),
	TpdT("TpdT.hmm", "NMT", "Asparagine N-methyltransferase", 50.0, false),
	TpdQ("TpdQ.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation)", 100.0, false),
	Transglutaminase("transglutaminases.hmm", "CapB", "Lasso peptide transglutaminase homolog", 50.0, false),
	TsrA("TsrA.hmm", "TsrA", "TsrA-type protein (2-methyltryptophan deaminase)", 300.0, false),
	TsrB("TsrB.hmm", "OMT", "Carboxylesterase", 50.0, false),
	TsrC("TsrC.hmm", "GATase", "TsrC-type C-terminal amidotransferase", 200.0, false),
	TsrD("TsrD.hmm", "TsrD", "TsrD-type protein (quinaldic acid biosynthesis)", 50.0, false),
	TsrE("TsrE.hmm", "TsrE", "TsrE-type protein (methylindole-3-pyruvic acid dehydrogenase)", 130.0, false),
	TsrI("TsrI.hmm", "TsrI", "TsrI-type protein (quinaldic acid esterification)", 50.0, false),
	TsrR("TsrR.hmm", "P450", "Isoleucine epoxidase", 130.0, false),
	TsrT("TsrT.hmm", "TsrT", "TsrT-type protein (tryptophan 2-methyltransferase)", 50.0, false),
	TsrU("TsrU.hmm", "TsrU", "TsrU-type protein (stereospecific oxidoreductase)", 73.0, false),
	TvaG("TvaG.hmm", "N,N-MT", "Histidine N1,N3-dimethyltransferase", 50.0, false),
	TvaH("TvaH.hmm", "TvaH", "Thioviridamide thioamide biosynthesis protein", 50.0, false),
	TvaF("TvaF.hmm", "TvaF", "Thioviridamide aminovinylcysteine biosynthesis flavoprotein", 50.0, false),
	TvaJ("TvaJ.hmm", "Ox", "Thioviridamide histidine &beta;-hydroxlase", 50.0, false),
	YmBC_a("YmBC_a.hmm", "B", "Cyclodehydratase-oxidase didomain enzyme, N-terminal subunit", 50.0, false),
	YmBC_b("YmBC_b.hmm", "C", "Cyclodehydratase-oxidase didomain enzyme, C-terminal subunit", 50.0, false),
	YmB1("YmB1.hmm", "B", "Phenyloxazoline-forming cyclodehydratase", 50.0, false),
	YmC1("YmC1.hmm", "C", "Phenyloxazole-forming oxidase", 50.0, false),
	YmE("YmE.hmm", "P450", "Cytochrome P450 phenylalanine &beta;-hydroxylase", 111.0, false),
	YmF("YmF.hmm", "YmF", "Macrocyclase", 50.0, false),
	TpdL("TpdL.hmm", "CMT", "Thiazole C-methyltransferase", 50.0),
	TpdM("TpdM.hmm", "OMT", "5-hydroxymethylthiazole O-methyltransferase", 130.0),
	TpdT("TpdT.hmm", "NMT", "Asparagine N-methyltransferase", 50.0),
	TpdQ("TpdQ.hmm", "P450", "Cytochrome P450 (phenylalanine &beta;-hydroxylation)", 100.0),
	Transglutaminase("transglutaminases.hmm", "CapB", "Lasso peptide transglutaminase homolog", 50.0),
	TsrA("TsrA.hmm", "TsrA", "TsrA-type protein (2-methyltryptophan deaminase)", 300.0),
	TsrB("TsrB.hmm", "OMT", "Carboxylesterase", 50.0),
	TsrC("TsrC.hmm", "GATase", "TsrC-type C-terminal amidotransferase", 200.0),
	TsrD("TsrD.hmm", "TsrD", "TsrD-type protein (quinaldic acid biosynthesis)", 50.0),
	TsrE("TsrE.hmm", "TsrE", "TsrE-type protein (methylindole-3-pyruvic acid dehydrogenase)", 130.0),
	TsrI("TsrI.hmm", "TsrI", "TsrI-type protein (quinaldic acid esterification)", 50.0),
	TsrR("TsrR.hmm", "P450", "Isoleucine epoxidase", 130.0),
	TsrT("TsrT.hmm", "TsrT", "TsrT-type protein (tryptophan 2-methyltransferase)", 50.0),
	TsrU("TsrU.hmm", "TsrU", "TsrU-type protein (stereospecific oxidoreductase)", 73.0),
	TvaG("TvaG.hmm", "N,N-MT", "Histidine N1,N3-dimethyltransferase", 50.0),
	TvaH("TvaH.hmm", "TvaH", "Thioviridamide thioamide biosynthesis protein", 50.0),
	TvaF("TvaF.hmm", "TvaF", "Thioviridamide aminovinylcysteine biosynthesis flavoprotein", 50.0),
	TvaJ("TvaJ.hmm", "Ox", "Thioviridamide histidine &beta;-hydroxlase", 50.0),
	YmBC_a("YmBC_a.hmm", "B", "Cyclodehydratase-oxidase didomain enzyme, N-terminal subunit", 50.0),
	YmBC_b("YmBC_b.hmm", "C", "Cyclodehydratase-oxidase didomain enzyme, C-terminal subunit", 50.0),
	YmB1("YmB1.hmm", "B", "Phenyloxazoline-forming cyclodehydratase", 50.0),
	YmC1("YmC1.hmm", "C", "Phenyloxazole-forming oxidase", 50.0),
	YmE("YmE.hmm", "P450", "Cytochrome P450 phenylalanine &beta;-hydroxylase", 111.0),
	YmF("YmF.hmm", "YmF", "Macrocyclase", 50.0),
	
	// precursor recognition element
	//TODO: implementation for the HHpred paper predictions still needs to be added
	//this is a placeholder for future possible implementations
	//GenomeSearch also has some placeholder functionality for the future
	RRE("RRE.hmm", "RRE", "RiPP precursor peptide recognition element", 0.0),
	;
	
	private final String hmm;
	private final String abbreviation;
	private final String name;
	private final double cutoff;
	private final boolean precursor;
	
	private RibosomalDomains(final String hmm, final String abbreviation, final String name, final double cutoff, final boolean precursor) {
		this.hmm = hmm;
		this.abbreviation = abbreviation;
		this.name = name;
		this.cutoff = cutoff;
		this.precursor = precursor;
	}
	
	public String hmm() {
		return hmm;
	}
	
	public String abbreviation() {
		return abbreviation;
	}
	
	public String fullName() {
		return name;
	}
	
	public double cutoff() {
		return cutoff;
	}
	
	//Used just to check if the domain being processed has been identified as a precursor so that 
	//we know whether the sequences requires further processing to remove the leader peptide.
	public boolean precursor() {
		return precursor;
	}
	
	public DomainFamilies family() {
		return DomainFamilies.RIBOSOMAL;
	}
	
}
