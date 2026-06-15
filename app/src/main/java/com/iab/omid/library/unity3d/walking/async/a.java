package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f16183c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f16184d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f16185e;

    public a(b.InterfaceC0217b interfaceC0217b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0217b);
        this.f16183c = new HashSet<>(hashSet);
        this.f16184d = jSONObject;
        this.f16185e = j10;
    }
}
