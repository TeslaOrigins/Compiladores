/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AVazioParametros extends PParametros
{

    public AVazioParametros()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AVazioParametros();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVazioParametros(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
