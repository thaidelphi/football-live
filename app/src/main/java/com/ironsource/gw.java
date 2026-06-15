package com.ironsource;

import com.ironsource.q7;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gw<Smash extends q7<?>> {

    /* renamed from: a  reason: collision with root package name */
    private final hw<Smash> f17619a;

    public gw(hw<Smash> smashPicker) {
        kotlin.jvm.internal.n.f(smashPicker, "smashPicker");
        this.f17619a = smashPicker;
    }

    public final List<Smash> a() {
        return this.f17619a.c();
    }

    public final boolean b() {
        return this.f17619a.c().isEmpty() && this.f17619a.a().isEmpty();
    }

    public final boolean c() {
        return this.f17619a.d() == 0;
    }
}
