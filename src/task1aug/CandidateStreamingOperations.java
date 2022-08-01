package task1aug;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;





public class CandidateStreamingOperations {

	public static void main(String[] args) {
	
		List<Candidate> candidateList=new InterviewRepository().getCandidateList();
		
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		
		
		
		
		
		List<Candidate> emp=candidateList.stream().
				filter(I->"Pune".equalsIgnoreCase(I.getCity())).
				collect(Collectors.toList());
		emp.forEach(s->System.out.println("Name:-"+s.getName()+", City:-"+s.getCity()+", TechicalExp:-"+s.getTechnicalExpertise()));
		
		  printLine();
		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		
		
		
		   Map<String, Long> employeeCountByCity =
				   candidateList.stream()
			             .collect(Collectors.groupingBy(Candidate::getCity, 
			                TreeMap::new, Collectors.counting()));
		   employeeCountByCity.forEach(
			         (city, count) -> System.out.printf(
			            "%s has %d candidates(s)%n", city, count));
		
		
		
		
		
		
		   printLine();
		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		
		Map<Integer,Long> candiCountExp=
				candidateList.stream()
.collect(Collectors.groupingBy(Candidate::getYearsOfExperience ,
		TreeMap::new,Collectors.counting()));
		
		candiCountExp.forEach((exp,count)->
		System.out.printf("%s yeras has %d candidates%n",exp,count));
			
		
		
		  printLine();
		
		
		
		
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		
		List<Candidate>emp1=candidateList. 
				stream().filter(J->(J.getYearsOfExperience()==0)).
				collect(Collectors.toList());
		
		emp1.forEach(s1->System.out.println("Name:"+s1.getName()+" , Year of Exp:-"+s1.getYearsOfExperience()));
		
		  printLine();
		
		//listing candidates with highest experience
System.out.println("Sorted List of Candidates by Experience");
InterviewRepository.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getYearsOfExperience))
.forEach(x -> System.out.println(x));
printLine();

printLine();
		//sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
		
		
		   List<Candidate> er = candidateList.stream()
					.sorted(Comparator.comparing(Candidate::getCity))
					.collect(Collectors.toList());
		 
		        er.forEach(System.out::println);
		        printLine();
			}
	

	private static Collection<Candidate> getCandidateList() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}
