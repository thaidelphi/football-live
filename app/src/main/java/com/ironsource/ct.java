package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum ct {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f16920a;

    ct(int i10) {
        this.f16920a = i10;
    }

    public final int b() {
        return this.f16920a;
    }
}
