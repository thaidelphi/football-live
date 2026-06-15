package com.iab.omid.library.adcolony.b;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.adcolony.e.a f15591a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15592b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f15593c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15594d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f15591a = new com.iab.omid.library.adcolony.e.a(view);
        this.f15592b = view.getClass().getCanonicalName();
        this.f15593c = friendlyObstructionPurpose;
        this.f15594d = str;
    }

    public com.iab.omid.library.adcolony.e.a a() {
        return this.f15591a;
    }

    public String b() {
        return this.f15592b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f15593c;
    }

    public String d() {
        return this.f15594d;
    }
}
