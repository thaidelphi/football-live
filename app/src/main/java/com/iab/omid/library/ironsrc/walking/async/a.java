package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f15927c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f15928d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f15929e;

    public a(b.InterfaceC0209b interfaceC0209b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0209b);
        this.f15927c = new HashSet<>(hashSet);
        this.f15928d = jSONObject;
        this.f15929e = j10;
    }
}
