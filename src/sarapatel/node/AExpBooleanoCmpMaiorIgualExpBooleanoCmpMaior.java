/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AExpBooleanoCmpMaiorIgualExpBooleanoCmpMaior extends PExpBooleanoCmpMaior
{
    private PExpBooleanoCmpMaiorIgual _expBooleanoCmpMaiorIgual_;

    public AExpBooleanoCmpMaiorIgualExpBooleanoCmpMaior()
    {
        // Constructor
    }

    public AExpBooleanoCmpMaiorIgualExpBooleanoCmpMaior(
        @SuppressWarnings("hiding") PExpBooleanoCmpMaiorIgual _expBooleanoCmpMaiorIgual_)
    {
        // Constructor
        setExpBooleanoCmpMaiorIgual(_expBooleanoCmpMaiorIgual_);

    }

    @Override
    public Object clone()
    {
        return new AExpBooleanoCmpMaiorIgualExpBooleanoCmpMaior(
            cloneNode(this._expBooleanoCmpMaiorIgual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpBooleanoCmpMaiorIgualExpBooleanoCmpMaior(this);
    }

    public PExpBooleanoCmpMaiorIgual getExpBooleanoCmpMaiorIgual()
    {
        return this._expBooleanoCmpMaiorIgual_;
    }

    public void setExpBooleanoCmpMaiorIgual(PExpBooleanoCmpMaiorIgual node)
    {
        if(this._expBooleanoCmpMaiorIgual_ != null)
        {
            this._expBooleanoCmpMaiorIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expBooleanoCmpMaiorIgual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expBooleanoCmpMaiorIgual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expBooleanoCmpMaiorIgual_ == child)
        {
            this._expBooleanoCmpMaiorIgual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expBooleanoCmpMaiorIgual_ == oldChild)
        {
            setExpBooleanoCmpMaiorIgual((PExpBooleanoCmpMaiorIgual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
