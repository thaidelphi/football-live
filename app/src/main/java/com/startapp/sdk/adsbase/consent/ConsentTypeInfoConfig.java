package com.startapp.sdk.adsbase.consent;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    public final Integer a() {
        return this.falseClick;
    }

    public final Integer b() {
        return this.impression;
    }

    public final Integer c() {
        return this.trueClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentTypeInfoConfig.class != obj.getClass()) {
            return false;
        }
        ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
        return o9.a(this.impression, consentTypeInfoConfig.impression) && o9.a(this.trueClick, consentTypeInfoConfig.trueClick) && o9.a(this.falseClick, consentTypeInfoConfig.falseClick);
    }

    public final int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
