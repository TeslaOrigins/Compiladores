/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AExpValExpOpMult extends PExpOpMult
{
    private PExpTernario _expTernario_;

    public AExpValExpOpMult()
    {
        // Constructor
    }

    public AExpValExpOpMult(
        @SuppressWarnings("hiding") PExpTernario _expTernario_)
    {
        // Constructor
        setExpTernario(_expTernario_);

    }

    @Override
    public Object clone()
    {
        return new AExpValExpOpMult(
            cloneNode(this._expTernario_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpValExpOpMult(this);
    }

    public PExpTernario getExpTernario()
    {
        return this._expTernario_;
    }

    public void setExpTernario(PExpTernario node)
    {
        if(this._expTernario_ != null)
        {
            this._expTernario_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expTernario_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expTernario_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expTernario_ == child)
        {
            this._expTernario_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expTernario_ == oldChild)
        {
            setExpTernario((PExpTernario) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
