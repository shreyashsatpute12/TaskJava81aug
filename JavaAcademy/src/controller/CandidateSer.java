package controller;

import java.util.List;

import model.CandidateReport;



public interface CandidateSer {

	String calculateGrade(CandidateReport candidateReport);
	List<CandidateReport> getGradesForAllCandidates();
	String addCandidate(CandidateReport candidate) throws Exception;
}