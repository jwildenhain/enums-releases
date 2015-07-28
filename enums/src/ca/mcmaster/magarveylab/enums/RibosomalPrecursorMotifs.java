package ca.mcmaster.magarveylab.enums;

import ca.mcmaster.magarveylab.enums.clusters.RibosomalClusterTypes;

import java.util.List;
import java.util.ArrayList;

public enum RibosomalPrecursorMotifs {
	Sactipeptides_precursor("sactipeptides_precursor.hmm", RibosomalClusterTypes.SACTIPEPTIDE),
	LAcP_1("LAcp_motif1.meme", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING),
	LAcP_2("LAcp_motif2.meme", RibosomalClusterTypes.LINEAR_AZOLE_CONTAINING);
	
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
