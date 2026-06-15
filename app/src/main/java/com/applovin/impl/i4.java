package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.j2;
import com.applovin.impl.m0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i4 extends j2 {

    /* renamed from: n  reason: collision with root package name */
    private final m0.a f7224n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f7225o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f7226p;

    public i4(m0.a aVar, boolean z10, Context context) {
        super(j2.c.RIGHT_DETAIL);
        this.f7224n = aVar;
        this.f7225o = context;
        this.f7267c = new SpannedString(aVar.a());
        this.f7226p = z10;
    }

    @Override // com.applovin.impl.j2
    public SpannedString f() {
        return new SpannedString(this.f7224n.a(this.f7225o));
    }

    @Override // com.applovin.impl.j2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.j2
    public boolean p() {
        Boolean b10 = this.f7224n.b(this.f7225o);
        if (b10 != null) {
            return b10.equals(Boolean.valueOf(this.f7226p));
        }
        return false;
    }
}
