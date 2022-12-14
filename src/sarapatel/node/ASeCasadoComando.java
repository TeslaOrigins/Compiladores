/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ASeCasadoComando extends PComando
{
    private PSeCasamento _seCasamento_;

    public ASeCasadoComando()
    {
        // Constructor
    }

    public ASeCasadoComando(
        @SuppressWarnings("hiding") PSeCasamento _seCasamento_)
    {
        // Constructor
        setSeCasamento(_seCasamento_);

    }

    @Override
    public Object clone()
    {
        return new ASeCasadoComando(
            cloneNode(this._seCasamento_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeCasadoComando(this);
    }

    public PSeCasamento getSeCasamento()
    {
        return this._seCasamento_;
    }

    public void setSeCasamento(PSeCasamento node)
    {
        if(this._seCasamento_ != null)
        {
            this._seCasamento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seCasamento_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._seCasamento_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._seCasamento_ == child)
        {
            this._seCasamento_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._seCasamento_ == oldChild)
        {
            setSeCasamento((PSeCasamento) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
