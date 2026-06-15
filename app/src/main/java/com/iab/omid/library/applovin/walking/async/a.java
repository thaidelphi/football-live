package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f15792c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f15793d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f15794e;

    public a(b.InterfaceC0205b interfaceC0205b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0205b);
        this.f15792c = new HashSet<>(hashSet);
        this.f15793d = jSONObject;
        this.f15794e = j10;
    }
}
