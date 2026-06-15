package com.iab.omid.library.unity3d.internal;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f16113a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16114b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendlyObstructionPurpose f16115c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16116d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f16113a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f16114b = view.getClass().getCanonicalName();
        this.f16115c = friendlyObstructionPurpose;
        this.f16116d = str;
    }

    public String a() {
        return this.f16116d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f16115c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f16113a;
    }

    public String d() {
        return this.f16114b;
    }
}
