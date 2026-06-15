package com.iab.omid.library.startio.internal;

import android.view.View;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.startio.weakreference.a f15985a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15986b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f15987c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15988d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f15985a = new com.iab.omid.library.startio.weakreference.a(view);
        this.f15986b = view.getClass().getCanonicalName();
        this.f15987c = friendlyObstructionPurpose;
        this.f15988d = str;
    }

    public String a() {
        return this.f15988d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f15987c;
    }

    public com.iab.omid.library.startio.weakreference.a c() {
        return this.f15985a;
    }

    public String d() {
        return this.f15986b;
    }
}
