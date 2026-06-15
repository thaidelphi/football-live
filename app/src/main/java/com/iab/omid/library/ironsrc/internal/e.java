package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f15849a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15850b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f15851c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15852d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f15849a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f15850b = view.getClass().getCanonicalName();
        this.f15851c = friendlyObstructionPurpose;
        this.f15852d = str;
    }

    public String a() {
        return this.f15852d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f15851c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f15849a;
    }

    public String d() {
        return this.f15850b;
    }
}
