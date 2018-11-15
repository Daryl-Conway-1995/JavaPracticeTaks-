package com.qa;

public class IsSummer {
    public boolean isInTemp(int temperature, boolean isSummer) {
        if (isSummer) {
            if (60 <= temperature && temperature <= 100) return true;
        } else {
            if (60 <= temperature && temperature <= 90) return true;
        }
        return false;
    }
}
