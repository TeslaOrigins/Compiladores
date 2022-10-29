/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATipoBaseExpVal extends PExpVal
{
    private TTipoBase _tipoBase_;

    public ATipoBaseExpVal()
    {
        // Constructor
    }

    public ATipoBaseExpVal(
        @SuppressWarnings("hiding") TTipoBase _tipoBase_)
    {
        // Constructor
        setTipoBase(_tipoBase_);

    }

    @Override
    public Object clone()
    {
        return new ATipoBaseExpVal(
            cloneNode(this._tipoBase_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoBaseExpVal(this);
    }

    public TTipoBase getTipoBase()
    {
        return this._tipoBase_;
    }

    public void setTipoBase(TTipoBase node)
    {
        if(this._tipoBase_ != null)
        {
            this._tipoBase_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoBase_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoBase_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoBase_ == child)
        {
            this._tipoBase_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoBase_ == oldChild)
        {
            setTipoBase((TTipoBase) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
