/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AChamadaProcComandoAlternativo extends PComandoAlternativo
{
    private PChamadaProcedimento _chamadaProcedimento_;
    private TFechaLinha _fechaLinha_;

    public AChamadaProcComandoAlternativo()
    {
        // Constructor
    }

    public AChamadaProcComandoAlternativo(
        @SuppressWarnings("hiding") PChamadaProcedimento _chamadaProcedimento_,
        @SuppressWarnings("hiding") TFechaLinha _fechaLinha_)
    {
        // Constructor
        setChamadaProcedimento(_chamadaProcedimento_);

        setFechaLinha(_fechaLinha_);

    }

    @Override
    public Object clone()
    {
        return new AChamadaProcComandoAlternativo(
            cloneNode(this._chamadaProcedimento_),
            cloneNode(this._fechaLinha_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamadaProcComandoAlternativo(this);
    }

    public PChamadaProcedimento getChamadaProcedimento()
    {
        return this._chamadaProcedimento_;
    }

    public void setChamadaProcedimento(PChamadaProcedimento node)
    {
        if(this._chamadaProcedimento_ != null)
        {
            this._chamadaProcedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chamadaProcedimento_ = node;
    }

    public TFechaLinha getFechaLinha()
    {
        return this._fechaLinha_;
    }

    public void setFechaLinha(TFechaLinha node)
    {
        if(this._fechaLinha_ != null)
        {
            this._fechaLinha_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaLinha_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chamadaProcedimento_)
            + toString(this._fechaLinha_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chamadaProcedimento_ == child)
        {
            this._chamadaProcedimento_ = null;
            return;
        }

        if(this._fechaLinha_ == child)
        {
            this._fechaLinha_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chamadaProcedimento_ == oldChild)
        {
            setChamadaProcedimento((PChamadaProcedimento) newChild);
            return;
        }

        if(this._fechaLinha_ == oldChild)
        {
            setFechaLinha((TFechaLinha) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
