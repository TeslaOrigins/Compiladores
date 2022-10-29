/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.parser;

import sarapatel.node.*;
import sarapatel.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNumDecimal(@SuppressWarnings("unused") TNumDecimal node)
    {
        this.index = 0;
    }

    @Override
    public void caseTNumReal(@SuppressWarnings("unused") TNumReal node)
    {
        this.index = 1;
    }

    @Override
    public void caseTNumBinario(@SuppressWarnings("unused") TNumBinario node)
    {
        this.index = 2;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 3;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 4;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 5;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 6;
    }

    @Override
    public void caseTIgualdade(@SuppressWarnings("unused") TIgualdade node)
    {
        this.index = 7;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 8;
    }

    @Override
    public void caseTSeparador(@SuppressWarnings("unused") TSeparador node)
    {
        this.index = 9;
    }

    @Override
    public void caseTMaiorIgual(@SuppressWarnings("unused") TMaiorIgual node)
    {
        this.index = 10;
    }

    @Override
    public void caseTMaior(@SuppressWarnings("unused") TMaior node)
    {
        this.index = 11;
    }

    @Override
    public void caseTTipoBase(@SuppressWarnings("unused") TTipoBase node)
    {
        this.index = 12;
    }

    @Override
    public void caseTPontoEntrada(@SuppressWarnings("unused") TPontoEntrada node)
    {
        this.index = 13;
    }

    @Override
    public void caseTComece(@SuppressWarnings("unused") TComece node)
    {
        this.index = 14;
    }

    @Override
    public void caseTTermine(@SuppressWarnings("unused") TTermine node)
    {
        this.index = 15;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 16;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 17;
    }

    @Override
    public void caseTEntao(@SuppressWarnings("unused") TEntao node)
    {
        this.index = 18;
    }

    @Override
    public void caseTOu(@SuppressWarnings("unused") TOu node)
    {
        this.index = 19;
    }

    @Override
    public void caseTNegacao(@SuppressWarnings("unused") TNegacao node)
    {
        this.index = 20;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 21;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 22;
    }

    @Override
    public void caseTVerdadeiro(@SuppressWarnings("unused") TVerdadeiro node)
    {
        this.index = 23;
    }

    @Override
    public void caseTFalso(@SuppressWarnings("unused") TFalso node)
    {
        this.index = 24;
    }

    @Override
    public void caseTFechaLinha(@SuppressWarnings("unused") TFechaLinha node)
    {
        this.index = 25;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 26;
    }

    @Override
    public void caseTParEsq(@SuppressWarnings("unused") TParEsq node)
    {
        this.index = 27;
    }

    @Override
    public void caseTParDir(@SuppressWarnings("unused") TParDir node)
    {
        this.index = 28;
    }

    @Override
    public void caseTDoisPontos(@SuppressWarnings("unused") TDoisPontos node)
    {
        this.index = 29;
    }

    @Override
    public void caseTDeclVar(@SuppressWarnings("unused") TDeclVar node)
    {
        this.index = 30;
    }

    @Override
    public void caseTDeclConst(@SuppressWarnings("unused") TDeclConst node)
    {
        this.index = 31;
    }

    @Override
    public void caseTColcheteEsq(@SuppressWarnings("unused") TColcheteEsq node)
    {
        this.index = 32;
    }

    @Override
    public void caseTColcheteDir(@SuppressWarnings("unused") TColcheteDir node)
    {
        this.index = 33;
    }

    @Override
    public void caseTFuncao(@SuppressWarnings("unused") TFuncao node)
    {
        this.index = 34;
    }

    @Override
    public void caseTProcedimento(@SuppressWarnings("unused") TProcedimento node)
    {
        this.index = 35;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 36;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 37;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 38;
    }
}
