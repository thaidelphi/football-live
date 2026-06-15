package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class pv {

    /* renamed from: b  reason: collision with root package name */
    private int f19791b = 4;

    /* renamed from: c  reason: collision with root package name */
    private int f19792c = 4;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Boolean> f19790a = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends HashMap<String, Boolean> {
        a() {
            put(ug.f20996k, Boolean.valueOf(pv.this.f19791b == 0));
            put(ug.f20997l, Boolean.valueOf(pv.this.f19792c == 0));
            Boolean bool = Boolean.FALSE;
            put(ug.f20998m, bool);
            put(ug.f20999n, bool);
        }
    }

    public JSONObject a() {
        return new JSONObject(this.f19790a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, int i10, boolean z10) {
        if (this.f19790a.containsKey(str)) {
            this.f19790a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f19790a.put(ug.f20998m, Boolean.valueOf(z10));
        this.f19790a.put(ug.f20999n, Boolean.valueOf((this.f19790a.get(ug.f20997l).booleanValue() || this.f19790a.get(ug.f20996k).booleanValue()) && this.f19790a.get(ug.f20998m).booleanValue()));
    }
}
