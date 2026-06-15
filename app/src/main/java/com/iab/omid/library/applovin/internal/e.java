package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f15720a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15721b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f15722c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15723d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f15720a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f15721b = view.getClass().getCanonicalName();
        this.f15722c = friendlyObstructionPurpose;
        this.f15723d = str;
    }

    public String a() {
        return this.f15723d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f15722c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f15720a;
    }

    public String d() {
        return this.f15721b;
    }
}
