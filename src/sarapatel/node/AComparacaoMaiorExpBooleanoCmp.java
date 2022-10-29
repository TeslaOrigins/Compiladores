/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AComparacaoMaiorExpBooleanoCmp extends PExpBooleanoCmp
{
    private PExpBooleanoCmp _expBooleanoCmp_;
    private TMaior _maior_;
    private PExpOpSoma _expOpSoma_;

    public AComparacaoMaiorExpBooleanoCmp()
    {
        // Constructor
    }

    public AComparacaoMaiorExpBooleanoCmp(
        @SuppressWarnings("hiding") PExpBooleanoCmp _expBooleanoCmp_,
        @SuppressWarnings("hiding") TMaior _maior_,
        @SuppressWarnings("hiding") PExpOpSoma _expOpSoma_)
    {
        // Constructor
        setExpBooleanoCmp(_expBooleanoCmp_);

        setMaior(_maior_);

        setExpOpSoma(_expOpSoma_);

    }

    @Override
    public Object clone()
    {
        return new AComparacaoMaiorExpBooleanoCmp(
            cloneNode(this._expBooleanoCmp_),
            cloneNode(this._maior_),
            cloneNode(this._expOpSoma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComparacaoMaiorExpBooleanoCmp(this);
    }

    public PExpBooleanoCmp getExpBooleanoCmp()
    {
        return this._expBooleanoCmp_;
    }

    public void setExpBooleanoCmp(PExpBooleanoCmp node)
    {
        if(this._expBooleanoCmp_ != null)
        {
            this._expBooleanoCmp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expBooleanoCmp_ = node;
    }

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
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
            + toString(this._expBooleanoCmp_)
            + toString(this._maior_)
            + toString(this._expOpSoma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expBooleanoCmp_ == child)
        {
            this._expBooleanoCmp_ = null;
            return;
        }

        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

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
        if(this._expBooleanoCmp_ == oldChild)
        {
            setExpBooleanoCmp((PExpBooleanoCmp) newChild);
            return;
        }

        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        if(this._expOpSoma_ == oldChild)
        {
            setExpOpSoma((PExpOpSoma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}