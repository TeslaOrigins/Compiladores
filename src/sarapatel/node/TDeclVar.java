/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TDeclVar extends Token
{
    public TDeclVar()
    {
        super.setText("var");
    }

    public TDeclVar(int line, int pos)
    {
        super.setText("var");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDeclVar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDeclVar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDeclVar text.");
    }
}
