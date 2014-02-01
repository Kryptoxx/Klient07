/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.vdbussche.klient07.runescape.skills;

import static java.lang.Math.floor;

/**
 *
 * @author kryptoxx
 */
public class Skill implements ISkill {
    private int _xp;

    
    public int levelToXP(int level) {
        // TODO
        return 0;
    }
    
    @Override
    public int getXP() {
        return this._xp;
    }
    @Override
    public void setXP(int xp) {
        if (xp >= 0)
        _xp = xp;
    }

    @Override
    public int getLevel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLevel(int level) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
