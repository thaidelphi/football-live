package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.a.b;
import com.iab.omid.library.adcolony.walking.a.d;
import com.iab.omid.library.adcolony.walking.a.e;
import com.iab.omid.library.adcolony.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements b.InterfaceC0201b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f15672a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.adcolony.walking.a.c f15673b;

    public b(com.iab.omid.library.adcolony.walking.a.c cVar) {
        this.f15673b = cVar;
    }

    public void a() {
        this.f15673b.b(new d(this));
    }

    @Override // com.iab.omid.library.adcolony.walking.a.b.InterfaceC0201b
    public void a(JSONObject jSONObject) {
        this.f15672a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f15673b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.adcolony.walking.a.b.InterfaceC0201b
    public JSONObject b() {
        return this.f15672a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f15673b.b(new e(this, hashSet, jSONObject, j10));
    }
}
