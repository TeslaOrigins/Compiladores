/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoConstInicioPrograma extends PInicioPrograma
{
    private PInicioPrograma _inicioPrograma_;
    private PDecCons _decCons_;

    public ADeclaracaoConstInicioPrograma()
    {
        // Constructor
    }

    public ADeclaracaoConstInicioPrograma(
        @SuppressWarnings("hiding") PInicioPrograma _inicioPrograma_,
        @SuppressWarnings("hiding") PDecCons _decCons_)
    {
        // Constructor
        setInicioPrograma(_inicioPrograma_);

        setDecCons(_decCons_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoConstInicioPrograma(
            cloneNode(this._inicioPrograma_),
            cloneNode(this._decCons_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoConstInicioPrograma(this);
    }

    public PInicioPrograma getInicioPrograma()
    {
        return this._inicioPrograma_;
    }

    public void setInicioPrograma(PInicioPrograma node)
    {
        if(this._inicioPrograma_ != null)
        {
            this._inicioPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicioPrograma_ = node;
    }

    public PDecCons getDecCons()
    {
        return this._decCons_;
    }

    public void setDecCons(PDecCons node)
    {
        if(this._decCons_ != null)
        {
            this._decCons_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decCons_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inicioPrograma_)
            + toString(this._decCons_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inicioPrograma_ == child)
        {
            this._inicioPrograma_ = null;
            return;
        }

        if(this._decCons_ == child)
        {
            this._decCons_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inicioPrograma_ == oldChild)
        {
            setInicioPrograma((PInicioPrograma) newChild);
            return;
        }

        if(this._decCons_ == oldChild)
        {
            setDecCons((PDecCons) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}