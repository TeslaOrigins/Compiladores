/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AExpBooleanoNegacaoExpBooleanoE extends PExpBooleanoE
{
    private PExpNegacao _expNegacao_;

    public AExpBooleanoNegacaoExpBooleanoE()
    {
        // Constructor
    }

    public AExpBooleanoNegacaoExpBooleanoE(
        @SuppressWarnings("hiding") PExpNegacao _expNegacao_)
    {
        // Constructor
        setExpNegacao(_expNegacao_);

    }

    @Override
    public Object clone()
    {
        return new AExpBooleanoNegacaoExpBooleanoE(
            cloneNode(this._expNegacao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpBooleanoNegacaoExpBooleanoE(this);
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
            + toString(this._expNegacao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._expNegacao_ == oldChild)
        {
            setExpNegacao((PExpNegacao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
