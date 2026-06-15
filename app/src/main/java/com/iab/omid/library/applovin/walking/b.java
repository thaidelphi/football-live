package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements b.InterfaceC0205b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f15801a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f15802b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f15802b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0205b
    public JSONObject a() {
        return this.f15801a;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0205b
    public void a(JSONObject jSONObject) {
        this.f15801a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f15802b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f15802b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f15802b.b(new f(this, hashSet, jSONObject, j10));
    }
}
