/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AExpValExpNegativo extends PExpNegativo
{
    private PExpVal _expVal_;

    public AExpValExpNegativo()
    {
        // Constructor
    }

    public AExpValExpNegativo(
        @SuppressWarnings("hiding") PExpVal _expVal_)
    {
        // Constructor
        setExpVal(_expVal_);

    }

    @Override
    public Object clone()
    {
        return new AExpValExpNegativo(
            cloneNode(this._expVal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpValExpNegativo(this);
    }

    public PExpVal getExpVal()
    {
        return this._expVal_;
    }

    public void setExpVal(PExpVal node)
    {
        if(this._expVal_ != null)
        {
            this._expVal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expVal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expVal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expVal_ == child)
        {
            this._expVal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expVal_ == oldChild)
        {
            setExpVal((PExpVal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}