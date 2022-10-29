/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AComparacaoMaiorIgualExpBooleanoCmpMaiorIgual extends PExpBooleanoCmpMaiorIgual
{
    private PExpBooleanoCmpMaiorIgual _expBooleanoCmpMaiorIgual_;
    private TMaiorIgual _maiorIgual_;
    private PExpBooleanoCmpIgual _expBooleanoCmpIgual_;

    public AComparacaoMaiorIgualExpBooleanoCmpMaiorIgual()
    {
        // Constructor
    }

    public AComparacaoMaiorIgualExpBooleanoCmpMaiorIgual(
        @SuppressWarnings("hiding") PExpBooleanoCmpMaiorIgual _expBooleanoCmpMaiorIgual_,
        @SuppressWarnings("hiding") TMaiorIgual _maiorIgual_,
        @SuppressWarnings("hiding") PExpBooleanoCmpIgual _expBooleanoCmpIgual_)
    {
        // Constructor
        setExpBooleanoCmpMaiorIgual(_expBooleanoCmpMaiorIgual_);

        setMaiorIgual(_maiorIgual_);

        setExpBooleanoCmpIgual(_expBooleanoCmpIgual_);

    }

    @Override
    public Object clone()
    {
        return new AComparacaoMaiorIgualExpBooleanoCmpMaiorIgual(
            cloneNode(this._expBooleanoCmpMaiorIgual_),
            cloneNode(this._maiorIgual_),
            cloneNode(this._expBooleanoCmpIgual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComparacaoMaiorIgualExpBooleanoCmpMaiorIgual(this);
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

    public TMaiorIgual getMaiorIgual()
    {
        return this._maiorIgual_;
    }

    public void setMaiorIgual(TMaiorIgual node)
    {
        if(this._maiorIgual_ != null)
        {
            this._maiorIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorIgual_ = node;
    }

    public PExpBooleanoCmpIgual getExpBooleanoCmpIgual()
    {
        return this._expBooleanoCmpIgual_;
    }

    public void setExpBooleanoCmpIgual(PExpBooleanoCmpIgual node)
    {
        if(this._expBooleanoCmpIgual_ != null)
        {
            this._expBooleanoCmpIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expBooleanoCmpIgual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expBooleanoCmpMaiorIgual_)
            + toString(this._maiorIgual_)
            + toString(this._expBooleanoCmpIgual_);
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

        if(this._maiorIgual_ == child)
        {
            this._maiorIgual_ = null;
            return;
        }

        if(this._expBooleanoCmpIgual_ == child)
        {
            this._expBooleanoCmpIgual_ = null;
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

        if(this._maiorIgual_ == oldChild)
        {
            setMaiorIgual((TMaiorIgual) newChild);
            return;
        }

        if(this._expBooleanoCmpIgual_ == oldChild)
        {
            setExpBooleanoCmpIgual((PExpBooleanoCmpIgual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}