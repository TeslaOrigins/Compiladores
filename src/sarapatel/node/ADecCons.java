/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecCons extends PDecCons
{
    private TDeclConst _declConst_;
    private TDoisPontos _doisPontos_;
    private PTipo _tipo_;
    private PIdAtribuicao _idAtribuicao_;
    private TFechaLinha _fechaLinha_;

    public ADecCons()
    {
        // Constructor
    }

    public ADecCons(
        @SuppressWarnings("hiding") TDeclConst _declConst_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") PIdAtribuicao _idAtribuicao_,
        @SuppressWarnings("hiding") TFechaLinha _fechaLinha_)
    {
        // Constructor
        setDeclConst(_declConst_);

        setDoisPontos(_doisPontos_);

        setTipo(_tipo_);

        setIdAtribuicao(_idAtribuicao_);

        setFechaLinha(_fechaLinha_);

    }

    @Override
    public Object clone()
    {
        return new ADecCons(
            cloneNode(this._declConst_),
            cloneNode(this._doisPontos_),
            cloneNode(this._tipo_),
            cloneNode(this._idAtribuicao_),
            cloneNode(this._fechaLinha_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecCons(this);
    }

    public TDeclConst getDeclConst()
    {
        return this._declConst_;
    }

    public void setDeclConst(TDeclConst node)
    {
        if(this._declConst_ != null)
        {
            this._declConst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declConst_ = node;
    }

    public TDoisPontos getDoisPontos()
    {
        return this._doisPontos_;
    }

    public void setDoisPontos(TDoisPontos node)
    {
        if(this._doisPontos_ != null)
        {
            this._doisPontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPontos_ = node;
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

    public PIdAtribuicao getIdAtribuicao()
    {
        return this._idAtribuicao_;
    }

    public void setIdAtribuicao(PIdAtribuicao node)
    {
        if(this._idAtribuicao_ != null)
        {
            this._idAtribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idAtribuicao_ = node;
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
            + toString(this._declConst_)
            + toString(this._doisPontos_)
            + toString(this._tipo_)
            + toString(this._idAtribuicao_)
            + toString(this._fechaLinha_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declConst_ == child)
        {
            this._declConst_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._idAtribuicao_ == child)
        {
            this._idAtribuicao_ = null;
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
        if(this._declConst_ == oldChild)
        {
            setDeclConst((TDeclConst) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._idAtribuicao_ == oldChild)
        {
            setIdAtribuicao((PIdAtribuicao) newChild);
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