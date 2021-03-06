/*
 * Created on 10/10/2005
 *
 */
package problemGenerator;

import logic.formulas.Connective;
import logic.formulas.Formula;
import logic.formulas.FormulaFactory;
import logicalSystems.mbc.MBCConnectives;

/**
 * A specialized version of FormulaGenerator for the second family of problems.
 * 
 * @author Adolfo Gustavo Serra Seca Neto
 *  
 */
public class SecondLFIFamilySpecialFormulaGenerator extends FormulaGenerator {

	private Connective conn2, conn3;

	private String conclusion;
	private int end;

	/**
	 * @param atom
	 * @param conn
	 */
	public SecondLFIFamilySpecialFormulaGenerator(String atom,
			String conclusion, Connective conn, Connective conn2,
			Connective conn3, int end) {
		super(atom, conn);
		this.conn2 = conn2;
		this.conn3 = conn3;
		this.conclusion = conclusion;
		this.end = end;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see problemGenerator.FormulaGenerator#getInstance(logic.formulas.FormulaFactory,
	 *      int)
	 */
	public Formula getInstance(FormulaFactory ff, int index) {

		Formula secondTail;

		// creates (!A_n) ->C
		Formula f_end = ff.createCompositeFormula(MBCConnectives.IMPLIES, ff
				.createCompositeFormula(MBCConnectives.NOT, ff
						.createAtomicFormula(getAtom() + end)), ff
				.createAtomicFormula(conclusion));

		FormulaIteratingGenerator fig = new FormulaIteratingGenerator(
				conn3);
		
		FormulaGenerator fg1 = new FormulaGenerator(getAtom(), getConn());
		
		Formula f1=null;
		if (index< end) {
			f1 = fig.generate(ff, index + 1, end,
					FormulaIteratingGenerator.LEFT_ASSOCIATED, fg1);
		}
		
		if(f1!=null){
			secondTail = ff.createCompositeFormula(conn3, f1, f_end);
		}
		else secondTail = f_end;
		
		return ff.createCompositeFormula(conn2, super.getInstance(ff, index),
				secondTail);
	}

}
