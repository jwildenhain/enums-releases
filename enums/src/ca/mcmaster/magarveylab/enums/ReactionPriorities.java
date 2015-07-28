package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.domains.BetaLactamDomains;
import ca.mcmaster.magarveylab.enums.domains.DomainType;
import ca.mcmaster.magarveylab.enums.domains.RibosomalDomains;
import ca.mcmaster.magarveylab.enums.domains.TailoringDomains;
import ca.mcmaster.magarveylab.enums.domains.ThiotemplatedDomains;
import ca.mcmaster.magarveylab.enums.domains.TypeIIPolyketideDomains;

/**
 * Enunmerates the priorities in which reactions should be executed. 
 * @author skinnider
 *
 */
public enum ReactionPriorities {
	
	// type II pre-scaffold generation
	CARBOXY_O_METHYLTRANSFERASE(TypeIIPolyketideDomains.CARBOXY_OMT, 100),
	
	// polyketide cyclases
	FAVORSKIIASE(TypeIIPolyketideDomains.FAVORSKIIASE, 200),
	FIRST_RING_CYCLASE_2a(TypeIIPolyketideDomains.CYCLASE_CLADE_8a, 200),
	FIRST_RING_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_7, 201),
	FIRST_RING_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_8_9, 201),
	FIRST_RING_CYCLASE_3(TypeIIPolyketideDomains.CYCLASE_CLADE_10, 205),
	THIRD_RING_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_3, 210),
	THIRD_RING_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_1, 220),
	THIRD_RING_CYCLASE_3(TypeIIPolyketideDomains.CYCLASE_CLADE_2, 220),
	FOURTH_RING_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_5b, 230),
	FOURTH_RING_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_6a, 230),
	FOURTH_RING_CYCLASE_3(TypeIIPolyketideDomains.CYCLASE_CLADE_6b_SUBTYPE_1, 230),
	FOURTH_RING_CYCLASE_4(TypeIIPolyketideDomains.CYCLASE_CLADE_6b_SUBTYPE_2, 230),
	ANGULAR_CYCLASE_1(TypeIIPolyketideDomains.CYCLASE_CLADE_4, 250),
	ANGULAR_CYCLASE_2(TypeIIPolyketideDomains.CYCLASE_CLADE_5a, 250),
	
	// beta lactam domains
	IPNS(BetaLactamDomains.IPNS, 300),
	DOACS(BetaLactamDomains.DOACS, 310),
	IAT(BetaLactamDomains.IAT, 350),
	
	// other multimodular tailoring domains
	P450A(TailoringDomains.P450A, 400),
	P450B(TailoringDomains.P450B, 400),
	P450C(TailoringDomains.P450C, 400),
	P450D(TailoringDomains.P450D, 400),
	BVMO(TypeIIPolyketideDomains.BVMO, 400),
	ABM(TypeIIPolyketideDomains.ABM, 400),
	C6_OXYGENASE(TypeIIPolyketideDomains.C6OX, 400),
	
	// oxazole/thiazole formation 
	HETEROCYCLIZATION(ThiotemplatedDomains.CONDENSATION, 500),
	NITROREDUCTASE(ThiotemplatedDomains.NITROREDUCTASE, 510),
	
	// oxidoreductases
	PROLINE_DEHYDROGENASE(TailoringDomains.PROLINE_DEHYDROGENASE, 600),
	TRYPTOPHAN_DIOXYGENASE(TailoringDomains.TRYPTOPHAN_DIOXYGENASE, 600),
	KETOREDUCTASE(ThiotemplatedDomains.KETOREDUCTASE, 600),
	DEHYDRATASE(ThiotemplatedDomains.DEHYDRATASE, 610),
	ENOLREDUCTASE(ThiotemplatedDomains.ENOYLREDUCTASE, 620),
	C9_KETOREDUCTASE(TypeIIPolyketideDomains.C9KR, 100),
	C11_KETOREDUCTASE(TypeIIPolyketideDomains.C11KR, 600),
	C15_KETOREDUCTASE(TypeIIPolyketideDomains.C15KR, 600),
	C17_KETOREDUCTASE(TypeIIPolyketideDomains.C17KR, 600),
	C19_KETOREDUCTASE(TypeIIPolyketideDomains.C19KR, 600),
	
	// modular tailoring reactions
	OMT(ThiotemplatedDomains.O_METHYLTRANSFERASE, 700),
	NMT(ThiotemplatedDomains.N_METHYLTRANSFERASE, 700),
	CMT(ThiotemplatedDomains.C_METHYLTRANSFERASE, 700),
	
	// simple addition reactions
	CARBAMOYLTRANSFERASE(TailoringDomains.CARBAMOYLTRANSFERASE, 800),
	PHOSPHOTRANSFERASE_1(TailoringDomains.PHOSPHOTRANSFERASE_1, 800),
	PHOSPHOTRANSFERASE_2(TailoringDomains.PHOSPHOTRANSFERASE_2, 800),
	FORMYLTRANSFERASE(TailoringDomains.FORMYLTRANSFERASE, 800),
	SULFOTRANSFERASE(TailoringDomains.SULFOTRANSFERASE, 800),
	CHLORINATION(TailoringDomains.CHLORINATION, 800),
	C_GLYCOSYLTRANSFERASE(TailoringDomains.C_GLYCOSYLTRANSFERASE, 800),
	GLYCOSYLTRANSFERASE(TailoringDomains.GLYCOSYLTRANSFERASE, 810),
	ACYL_ADENYLATE_LIGASE(ThiotemplatedDomains.ACYL_ADENYLATING, 800),
	C2_AMINOTRANSFERASE(TypeIIPolyketideDomains.C2AMT, 800),
	C2_METHYLTRANSFERASE(TypeIIPolyketideDomains.C2MT, 810),
	C11_O_METHYLTRANSFERASE_1(TypeIIPolyketideDomains.C11OMT_1, 800),
	C11_O_METHYLTRANSFERASE_2(TypeIIPolyketideDomains.C11OMT_2, 800),
	C6_C_METHYLTRANSFERASE(TypeIIPolyketideDomains.C6CMT, 800),
	C8_C_METHYLTRANSFERASE(TypeIIPolyketideDomains.C8CMT, 800),
	C10_C_METHYLTRANSFERASE_1(TypeIIPolyketideDomains.C10CMT, 800),
	
	// pre-cyclization
	REDUCTASE(ThiotemplatedDomains.REDUCTASE, 900),
	
	/*
	 * Ribosomal modifications -- starting at 2_000
	 */
	// disulfides 
//	GLYCOCIN_DISULFIDE()
	SACTIPEPTIDE_DISULFIDE(RibosomalDomains.SkfH, 2000),
	
	
	// 
	;
	
	private DomainType domain;
	private int priority;
	
	private ReactionPriorities(DomainType domain, int priority) {
		this.domain = domain;
		this.priority = priority;
	}

	public DomainType domain() {
		return domain;
	}
	
	public int priority() {
		return priority;
	}
	
}
