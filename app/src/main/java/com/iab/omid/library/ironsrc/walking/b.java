package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements b.InterfaceC0209b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f15936a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f15937b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f15937b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0209b
    public JSONObject a() {
        return this.f15936a;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0209b
    public void a(JSONObject jSONObject) {
        this.f15936a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f15937b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f15937b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f15937b.b(new f(this, hashSet, jSONObject, j10));
    }
}
