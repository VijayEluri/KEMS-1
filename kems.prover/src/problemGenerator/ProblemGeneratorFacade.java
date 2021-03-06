/*
 * Created on 06/10/2005
 *
 */
package problemGenerator;


/**
 * A facade fopr problem generators.
 * 
 * @author Adolfo Gustavo Serra Seca Neto
 * 
 */
public class ProblemGeneratorFacade {

	public static void main(String[] args) {

		// UProblemGenerator upg = new UProblemGenerator();
		// Problem p = upg.generate(2);

		// System.out.println(p);

		// ThirdLFIProblemGenerator mbcpg1 = new ThirdLFIProblemGenerator();
		// Problem p = mbcpg1.generate(3);
		// System.out.println(p);

		// mbcpg1.saveSequence("/home/kurumin/MSTPExport/problems/generated/lfiProblems/third",
		// 1, 10, ".prove");

		// FirstLFIProblemGenerator mbcpg1 = new FirstLFIProblemGenerator();
		// Problem p = mbcpg1.generate(3);
		// System.out.println(p);

		// mbcpg1.saveFile("/home/kurumin/MSTP/problems/generated/lfiProblems/first",
		// 3, ".prove");
		// mbcpg1.saveSequence("/home/kurumin/MSTPExport/problems/generated/lfiProblems/first",
		// 1, 10, ".prove");

		// FirstLFIProblemGenerator mbcpg1 = new FirstLFIProblemGenerator();
		// Problem p = mbcpg1.generate(1);
		// System.out.println(p);
		// mbcpg1.saveSequence("kems.problems/problems/generated/lfiProblems/first",
		// 10, 80, 10, ".prove");
		// mbcpg1.saveSequence("kems.export/problems/generated/lfiProblems/first",
		// 10, 80, 10, ".prove");

		// FourthLFIProblemGenerator mbcpg4 = new FourthLFIProblemGenerator();
		// Problem p = mbcpg4.generate(1);
		// System.out.println(p);
		// mbcpg4.saveSequence("/home/kurumin/MSTPExport/problems/generated/lfiProblems/fourth",
		// 1, 20, ".prove");
		//		
		// mbcpg2.saveSequence("/home/kurumin/MSTPExport/problems/generated/lfiProblems/second",
		// 1, 10, ".prove");

		// SecondLFIProblemGenerator mbcpg2 = new SecondLFIProblemGenerator();
		// Problem p = mbcpg2.generate(3);
		// System.out.println(p);
		// //
		// mbcpg2.saveSequence("kems.problems/problems/generated/lfiProblems/second",
		// 1, 20, 1, ".prove");

		// mbcpg2.saveFile("/home/kurumin/MSTP/problems/generated/lfiProblems/second",
		// 3, ".prove");
		// mbcpg2.saveFile("/home/kurumin/MSTP/problems/generated/lfiProblems/second",
		// 7, ".prove");
		// mbcpg2.saveFile("/home/kurumin/MSTP/problems/generated/lfiProblems/second",
		// 50, ".prove");

		// FormulaGenerator fg = new FormulaGenerator("A",
		// MBCConnectives.CONSISTENCY);
		//
		// System.err.println(fg.getInstance(new FormulaFactory(), 5));
		//
		// SignedFormulaGenerator sfg = new
		// SignedFormulaGenerator(MBCSigns.FALSE,
		// MBCConnectives.AND);
		//		
		// System.err.println(sfg.generate(new FormulaFactory(),
		// new SignedFormulaFactory(), 4, 8,
		// FormulaIteratingGenerator.LEFT_ASSOCIATED, fg));
		// System.err.println(sfg.generate(new FormulaFactory(),
		// new SignedFormulaFactory(), 4, 8,
		// FormulaIteratingGenerator.RIGHT_ASSOCIATED, fg));
		//
		// FormulaGenerator fg2 = new FirstLFIFamilySpecialFormulaGenerator("A",
		// MBCConnectives.CONSISTENCY, MBCConnectives.IMPLIES);
		//
		// System.err.println(sfg.generate(new FormulaFactory(),
		// new SignedFormulaFactory(), 4, 8,
		// FormulaIteratingGenerator.RIGHT_ASSOCIATED, fg2));

		// PHPProblemGenerator phppg = new PHPProblemGenerator();
		//		
		// phppg.saveSequence("/home/kurumin/MSTP/problems/generated/cpl/php",
		// 1, 20, ".prove");

//		 System.out.println(generatePack(0,1,2,2,1,0));
//		generateAll("dss-", ".prove");
		DSSProblemGenerator dssPg = new DSSProblemGenerator();
//		for (int i=0; i<729; i++){
//			System.out.println(dssPg.generate(i).getFormulas());
//		}
		dssPg.saveSequence("generated/lfiProblems/dss", 0, 5*729, 1, ".prove");
	}


}
