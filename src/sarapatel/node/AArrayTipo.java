/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AArrayTipo extends PTipo
{
    private PTipo _tipo_;
    private TColcheteEsq _colcheteEsq_;
    private PExp _exp_;
    private TColcheteDir _colcheteDir_;

    public AArrayTipo()
    {
        // Constructor
    }

    public AArrayTipo(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TColcheteEsq _colcheteEsq_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TColcheteDir _colcheteDir_)
    {
        // Constructor
        setTipo(_tipo_);

        setColcheteEsq(_colcheteEsq_);

        setExp(_exp_);

        setColcheteDir(_colcheteDir_);

    }

    @Override
    public Object clone()
    {
        return new AArrayTipo(
            cloneNode(this._tipo_),
            cloneNode(this._colcheteEsq_),
            cloneNode(this._exp_),
            cloneNode(this._colcheteDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayTipo(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public TColcheteEsq getColcheteEsq()
    {
        return this._colcheteEsq_;
    }

    public void setColcheteEsq(TColcheteEsq node)
    {
        if(this._colcheteEsq_ != null)
        {
            this._colcheteEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteEsq_ = node;
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

    public TColcheteDir getColcheteDir()
    {
        return this._colcheteDir_;
    }

    public void setColcheteDir(TColcheteDir node)
    {
        if(this._colcheteDir_ != null)
        {
            this._colcheteDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._colcheteEsq_)
            + toString(this._exp_)
            + toString(this._colcheteDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._colcheteEsq_ == child)
        {
            this._colcheteEsq_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._colcheteDir_ == child)
        {
            this._colcheteDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._colcheteEsq_ == oldChild)
        {
            setColcheteEsq((TColcheteEsq) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._colcheteDir_ == oldChild)
        {
            setColcheteDir((TColcheteDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
