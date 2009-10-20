package main.newstrategy.cpl.configurable.comparator;

import logic.signedFormulas.SignedFormula;


/**
 * Emerson - teste de Sort PB Rules
 * */
public class EmersonComparable implements ISignedFormulaComparator {

	public static final String DESCRIPTOR = "nfo"; 
	
	//private FormulaSign sign;
	//public EmersonComparable(FormulaSign sign) {this.sign = sign;}
	public EmersonComparable(){}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(SignedFormula sf0, SignedFormula sf1) {
    //Formula f0 = sf0.getFormula();
    //Formula f1 = sf1.getFormula();
    
		int rt = 0;
		
    if (sf0.getGrauConsistencia() == sf1.getGrauConsistencia()) {
    	rt = 0; //mesmo grau
    } else {
    	if (sf0.getGrauConsistencia() >= sf1.getGrauConsistencia()){
    		rt = -1;
    	} else {
    		rt = 1;
    	}
    }
    //System.out.println("- " + sf0 + " ("+sf0.getGrauConsistencia()+"), " + sf1 + " ("+sf1.getGrauConsistencia()+"), rt: " + rt);
    
    return rt;
    
    /*
    if (f0 instanceof AtomicFormula && f1 instanceof AtomicFormula) {
        return f0.toString().compareTo(f1.toString());
    } else {
        if (f0 instanceof AtomicFormula) {
            return -1;
        } else {
            if (f1 instanceof AtomicFormula) {
                return 1;
            } else {
                FormulaSign s0 = sf0.getSign();
                FormulaSign s1 = sf1.getSign();

                if (s0.equals(sign)) {
                    return -1;
                } else {
                    if (s1.equals(sign)) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
    */
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "EmersonComparator";
	}

	public String getComparatorDescriptor() {
		return DESCRIPTOR;
	}

}
