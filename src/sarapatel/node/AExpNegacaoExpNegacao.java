/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AExpNegacaoExpNegacao extends PExpNegacao
{
    private TNegacao _negacao_;
    private PExpNegacao _expNegacao_;

    public AExpNegacaoExpNegacao()
    {
        // Constructor
    }

    public AExpNegacaoExpNegacao(
        @SuppressWarnings("hiding") TNegacao _negacao_,
        @SuppressWarnings("hiding") PExpNegacao _expNegacao_)
    {
        // Constructor
        setNegacao(_negacao_);

        setExpNegacao(_expNegacao_);

    }

    @Override
    public Object clone()
    {
        return new AExpNegacaoExpNegacao(
            cloneNode(this._negacao_),
            cloneNode(this._expNegacao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpNegacaoExpNegacao(this);
    }

    public TNegacao getNegacao()
    {
        return this._negacao_;
    }

    public void setNegacao(TNegacao node)
    {
        if(this._negacao_ != null)
        {
            this._negacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._negacao_ = node;
    }

    public PExpNegacao getExpNegacao()
    {
        return this._expNegacao_;
    }

    public void setExpNegacao(PExpNegacao node)
    {
        if(this._expNegacao_ != null)
        {
            this._expNegacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expNegacao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._negacao_)
            + toString(this._expNegacao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._negacao_ == child)
        {
            this._negacao_ = null;
            return;
        }

        if(this._expNegacao_ == child)
        {
            this._expNegacao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._negacao_ == oldChild)
        {
            setNegacao((TNegacao) newChild);
            return;
        }

        if(this._expNegacao_ == oldChild)
        {
            setExpNegacao((PExpNegacao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
