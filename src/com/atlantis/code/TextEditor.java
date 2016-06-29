package com.atlantis.code;

/**
 * TextEditor类
 *
 * @author Syusuke
 * @description 请添加描述
 * @date 2016/6/29 0029
 * @time 9:51
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker specllChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = specllChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
