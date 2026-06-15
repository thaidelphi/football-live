package com.iab.omid.library.unity3d.walking;

import com.iab.omid.library.unity3d.walking.async.b;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements b.InterfaceC0217b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f16192a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f16193b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f16193b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0217b
    public JSONObject a() {
        return this.f16192a;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0217b
    public void a(JSONObject jSONObject) {
        this.f16192a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f16193b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f16193b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f16193b.b(new f(this, hashSet, jSONObject, j10));
    }
}
