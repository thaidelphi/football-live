package com.iab.omid.library.adcolony.walking.a;

import com.iab.omid.library.adcolony.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f15661a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f15662b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f15663c;

    public a(b.InterfaceC0201b interfaceC0201b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0201b);
        this.f15661a = new HashSet<>(hashSet);
        this.f15662b = jSONObject;
        this.f15663c = j10;
    }
}
