package model.vo;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 04 11:20:33 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Retirement_VOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public Retirement_VOImpl() {
    }

    /**
     * Returns the variable value for BV_ID.
     * @return variable value for BV_ID
     */
    public BigDecimal getBV_ID() {
        return (BigDecimal) ensureVariableManager().getVariableValue("BV_ID");
    }

    /**
     * Sets <code>value</code> for variable BV_ID.
     * @param value value to bind as BV_ID
     */
    public void setBV_ID(BigDecimal value) {
        ensureVariableManager().setVariableValue("BV_ID", value);
    }
}
