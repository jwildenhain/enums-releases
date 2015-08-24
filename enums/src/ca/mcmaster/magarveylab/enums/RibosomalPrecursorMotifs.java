package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.clusters.RibosomalClusterTypes;

import java.util.List;
import java.util.ArrayList;

/**
 * Enum for the motifs generated in MEME for assistance in identifying the
 * leader peptide cleavage points.
 * 
 * @author prees, robynedgar
 *
 */
public enum RibosomalPrecursorMotifs {

	//motifs for identifying leader peptides within the precursor
	BotA_leader("BotA_leader_motif.txt", RibosomalClusterTypes.BOTTROMYCIN),
	Bac_head2tail_nonleader("non_leader_bac_head-to-tail.txt", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	
	//precursor motifs
	AIP_precursor_1("motif1_AIP_precursor.txt", RibosomalClusterTypes.AUTO_INDUCING_PEPTIDE),
	AIP_precursor_2("motif2_AIP_precursor.txt", RibosomalClusterTypes.AUTO_INDUCING_PEPTIDE),
	AIP_precursor_3("motif3_AIP_precursor.txt", RibosomalClusterTypes.AUTO_INDUCING_PEPTIDE),
	Bac_head_to_tail_1("motif1_head-to-tail_precursor.txt", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	Bac_head_to_tail_2("motif2_head-to-tail_precursor.txt", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	Bac_head_to_tail_3("motif3_head-to-tail_precursor.txt", RibosomalClusterTypes.BACTERIAL_HEAD_TO_TAIL_CYCLIZED),
	Bottromycin_precursor_1("motif_botA.txt", RibosomalClusterTypes.BOTTROMYCIN),
	ComX_1("motif1_ComX_precursor.txt", RibosomalClusterTypes.COMX),
	ComX_2("motif2_ComX_precursor.txt", RibosomalClusterTypes.COMX),
	Cyanobactins_1("motif1_cyanobactins_precursor.txt", RibosomalClusterTypes.CYANOBACTIN),
	Cyanobactins_2("motif2_cyanobactins_precursor.txt", RibosomalClusterTypes.CYANOBACTIN),
	Cyanobactins_3("motif3_cyanobactins_precursor.txt", RibosomalClusterTypes.CYANOBACTIN),
	Sactipeptides_precursor("sactipeptides_precursor.hmm", RibosomalClusterTypes.SACTIPEPTIDE),
	Lantipeptides_1("motif1_LanA_lantipeptides_precursor.txt", RibosomalClusterTypes.LANTIPEPTIDE),
	Lantipeptides_2("motif2_LanA_lantipeptides_precursor.txt", RibosomalClusterTypes.LANTIPEPTIDE),
	Lantipeptides_3("motif3_LanA_lantipeptides_precursor.txt", RibosomalClusterTypes.LANTIPEPTIDE),
	Lantipeptides_4("motif1_atypical_LanA.txt", RibosomalClusterTypes.LANTIPEPTIDE),
	Lantipeptides_5("motif2_atypical_LanA.txt", RibosomalClusterTypes.LANTIPEPTIDE),
	Lantipeptides_6("motif3_atypical_LanA.txt", RibosomalClusterTypes.LANTIPEPTIDE),
	Lasso_peptides_1("motif1_lassoPeptide_precursor.txt", RibosomalClusterTypes.LASSOPEPTIDE),
	Lasso_peptides_2("motif2_lassoPeptide_precursor.txt", RibosomalClusterTypes.LASSOPEPTIDE),
	Lasso_peptides_3("motif3_lassoPeptide_precursor.txt", RibosomalClusterTypes.LASSOPEPTIDE),
	Linardins_1("motif1_Linardins_precursor.txt", RibosomalClusterTypes.LINARDIN),
	Linardins_2("motif2_Linardins_precursor.txt", RibosomalClusterTypes.LINARDIN),
	Linear_Azole_1("motif1_linearazole_precursor.txt", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING),
	Microviridin_1("motif1_microviridin_precursor.txt", RibosomalClusterTypes.MICROVIRIDIN),
	Microviridin_2("motif2_microviridin_precursor.txt", RibosomalClusterTypes.MICROVIRIDIN),
	Microviridin_3("motif3_microviridin_precursor.txt", RibosomalClusterTypes.MICROVIRIDIN),
	Proteusins_1("motif1_proteusins_precursor.txt", RibosomalClusterTypes.PROTEUSIN),
	Proteusins_2("motif2_proteusins_precursor.txt", RibosomalClusterTypes.PROTEUSIN),
	Proteusins_3("motif3_proteusins_precursor.txt", RibosomalClusterTypes.PROTEUSIN),
	Sactipeptides_1("motif1_Sactipeptides_precursor.txt", RibosomalClusterTypes.SACTIPEPTIDE),
	Thiopeptide_1("motif1_thiopeptides_precursor.txt", RibosomalClusterTypes.THIOPEPTIDE),
	Thiopeptide_2("motif2_thiopeptides_precursor.txt", RibosomalClusterTypes.THIOPEPTIDE),
	Thiopeptide_3("motif3_thiopeptides_precursor.txt", RibosomalClusterTypes.THIOPEPTIDE),
	Thioviridamide_1("motif1_Thioviridamide_precursor.txt", RibosomalClusterTypes.THIOVIRIDAMIDE);
	
	private final String file;
	private final RibosomalClusterTypes cluster;

	private RibosomalPrecursorMotifs(String file, RibosomalClusterTypes cluster) {
		this.file = file;
		this.cluster = cluster;
	}

	public String getFile() {
		return file;
	}

	public RibosomalClusterTypes getClusterType() {
		return cluster;
	}

	public List<RibosomalPrecursorMotifs> getMotifs(RibosomalClusterTypes type) {
		List<RibosomalPrecursorMotifs> results = new ArrayList<RibosomalPrecursorMotifs>();
		for (RibosomalPrecursorMotifs motif : RibosomalPrecursorMotifs.values()) {
			if (motif.getClusterType().equals(type)) {
				results.add(motif);
			}
		}
		return results;
	}
	
}
