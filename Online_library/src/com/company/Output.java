package com.company;

import com.myIntеerface.IOutput;

public class Output implements IOutput {

    @Override
    public void WriteMess(String val) {
        System.out.printf(val);
    }

    @Override
    public void WriteMess(String val1, String val2, String val3, String val4, boolean val5, String val6, boolean val7) {
        System.out.printf(val1, val2, val3, val4, val5, val6, val7);
    }
}
