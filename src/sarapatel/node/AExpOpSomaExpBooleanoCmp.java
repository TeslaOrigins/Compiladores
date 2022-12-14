/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AExpOpSomaExpBooleanoCmp extends PExpBooleanoCmp
{
    private PExpOpSoma _expOpSoma_;

    public AExpOpSomaExpBooleanoCmp()
    {
        // Constructor
    }

    public AExpOpSomaExpBooleanoCmp(
        @SuppressWarnings("hiding") PExpOpSoma _expOpSoma_)
    {
        // Constructor
        setExpOpSoma(_expOpSoma_);

    }

    @Override
    public Object clone()
    {
        return new AExpOpSomaExpBooleanoCmp(
            cloneNode(this._expOpSoma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpOpSomaExpBooleanoCmp(this);
    }

    public PExpOpSoma getExpOpSoma()
    {
        return this._expOpSoma_;
    }

    public void setExpOpSoma(PExpOpSoma node)
    {
        if(this._expOpSoma_ != null)
        {
            this._expOpSoma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expOpSoma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expOpSoma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expOpSoma_ == child)
        {
            this._expOpSoma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expOpSoma_ == oldChild)
        {
            setExpOpSoma((PExpOpSoma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
