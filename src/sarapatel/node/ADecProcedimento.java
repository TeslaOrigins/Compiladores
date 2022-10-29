/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecProcedimento extends PDecProcedimento
{
    private PPontoEntradaNull _pontoEntradaNull_;
    private TProcedimento _procedimento_;
    private TDoisPontos _doisPontos_;
    private TIdentificador _identificador_;
    private TParEsq _parEsq_;
    private PParametros _parametros_;
    private TParDir _parDir_;
    private PComando _comando_;

    public ADecProcedimento()
    {
        // Constructor
    }

    public ADecProcedimento(
        @SuppressWarnings("hiding") PPontoEntradaNull _pontoEntradaNull_,
        @SuppressWarnings("hiding") TProcedimento _procedimento_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setPontoEntradaNull(_pontoEntradaNull_);

        setProcedimento(_procedimento_);

        setDoisPontos(_doisPontos_);

        setIdentificador(_identificador_);

        setParEsq(_parEsq_);

        setParametros(_parametros_);

        setParDir(_parDir_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ADecProcedimento(
            cloneNode(this._pontoEntradaNull_),
            cloneNode(this._procedimento_),
            cloneNode(this._doisPontos_),
            cloneNode(this._identificador_),
            cloneNode(this._parEsq_),
            cloneNode(this._parametros_),
            cloneNode(this._parDir_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecProcedimento(this);
    }

    public PPontoEntradaNull getPontoEntradaNull()
    {
        return this._pontoEntradaNull_;
    }

    public void setPontoEntradaNull(PPontoEntradaNull node)
    {
        if(this._pontoEntradaNull_ != null)
        {
            this._pontoEntradaNull_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoEntradaNull_ = node;
    }

    public TProcedimento getProcedimento()
    {
        return this._procedimento_;
    }

    public void setProcedimento(TProcedimento node)
    {
        if(this._procedimento_ != null)
        {
            this._procedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._procedimento_ = node;
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

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
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

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
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

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pontoEntradaNull_)
            + toString(this._procedimento_)
            + toString(this._doisPontos_)
            + toString(this._identificador_)
            + toString(this._parEsq_)
            + toString(this._parametros_)
            + toString(this._parDir_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pontoEntradaNull_ == child)
        {
            this._pontoEntradaNull_ = null;
            return;
        }

        if(this._procedimento_ == child)
        {
            this._procedimento_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pontoEntradaNull_ == oldChild)
        {
            setPontoEntradaNull((PPontoEntradaNull) newChild);
            return;
        }

        if(this._procedimento_ == oldChild)
        {
            setProcedimento((TProcedimento) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
