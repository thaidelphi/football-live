package com.iab.omid.library.startio.walking.async;

import com.iab.omid.library.startio.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f16055c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f16056d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f16057e;

    public a(b.InterfaceC0213b interfaceC0213b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0213b);
        this.f16055c = new HashSet<>(hashSet);
        this.f16056d = jSONObject;
        this.f16057e = j10;
    }
}
