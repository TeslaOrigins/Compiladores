/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoSeSemCasamento extends PSeSemCasamento
{
    private TEnquanto _enquanto_;
    private TParEsq _parEsq_;
    private PExp _exp_;
    private TParDir _parDir_;
    private PSeSemCasamento _seSemCasamento_;

    public AEnquantoSeSemCasamento()
    {
        // Constructor
    }

    public AEnquantoSeSemCasamento(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PSeSemCasamento _seSemCasamento_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setParEsq(_parEsq_);

        setExp(_exp_);

        setParDir(_parDir_);

        setSeSemCasamento(_seSemCasamento_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoSeSemCasamento(
            cloneNode(this._enquanto_),
            cloneNode(this._parEsq_),
            cloneNode(this._exp_),
            cloneNode(this._parDir_),
            cloneNode(this._seSemCasamento_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoSeSemCasamento(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    public PSeSemCasamento getSeSemCasamento()
    {
        return this._seSemCasamento_;
    }

    public void setSeSemCasamento(PSeSemCasamento node)
    {
        if(this._seSemCasamento_ != null)
        {
            this._seSemCasamento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seSemCasamento_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enquanto_)
            + toString(this._parEsq_)
            + toString(this._exp_)
            + toString(this._parDir_)
            + toString(this._seSemCasamento_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        if(this._seSemCasamento_ == child)
        {
            this._seSemCasamento_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        if(this._seSemCasamento_ == oldChild)
        {
            setSeSemCasamento((PSeSemCasamento) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
