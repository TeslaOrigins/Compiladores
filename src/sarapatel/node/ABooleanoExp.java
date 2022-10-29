/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABooleanoExp extends PExp
{
    private PExpBooleanoEOu _expBooleanoEOu_;

    public ABooleanoExp()
    {
        // Constructor
    }

    public ABooleanoExp(
        @SuppressWarnings("hiding") PExpBooleanoEOu _expBooleanoEOu_)
    {
        // Constructor
        setExpBooleanoEOu(_expBooleanoEOu_);

    }

    @Override
    public Object clone()
    {
        return new ABooleanoExp(
            cloneNode(this._expBooleanoEOu_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABooleanoExp(this);
    }

    public PExpBooleanoEOu getExpBooleanoEOu()
    {
        return this._expBooleanoEOu_;
    }

    public void setExpBooleanoEOu(PExpBooleanoEOu node)
    {
        if(this._expBooleanoEOu_ != null)
        {
            this._expBooleanoEOu_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expBooleanoEOu_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expBooleanoEOu_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expBooleanoEOu_ == child)
        {
            this._expBooleanoEOu_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expBooleanoEOu_ == oldChild)
        {
            setExpBooleanoEOu((PExpBooleanoEOu) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
