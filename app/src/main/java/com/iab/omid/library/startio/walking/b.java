package com.iab.omid.library.startio.walking;

import com.iab.omid.library.startio.walking.async.b;
import com.iab.omid.library.startio.walking.async.d;
import com.iab.omid.library.startio.walking.async.e;
import com.iab.omid.library.startio.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements b.InterfaceC0213b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f16064a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.startio.walking.async.c f16065b;

    public b(com.iab.omid.library.startio.walking.async.c cVar) {
        this.f16065b = cVar;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0213b
    public JSONObject a() {
        return this.f16064a;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0213b
    public void a(JSONObject jSONObject) {
        this.f16064a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f16065b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f16065b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f16065b.b(new f(this, hashSet, jSONObject, j10));
    }
}
