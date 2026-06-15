package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import c3.h;
import c3.m;
@Keep
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CctBackendFactory implements c3.d {
    @Override // c3.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
