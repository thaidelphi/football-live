package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z9 implements ca {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f21635a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences.Editor f21636b;

    public z9(Context context, String fileName) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f21635a = sharedPreferences;
        this.f21636b = sharedPreferences.edit();
    }

    @Override // com.ironsource.ca
    public void a(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        this.f21636b.remove(key).apply();
    }

    @Override // com.ironsource.ca
    public void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        this.f21636b.putString(key, value).apply();
    }

    @Override // com.ironsource.ca
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f21635a.getAll();
        kotlin.jvm.internal.n.e(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.ca
    public String getString(String key, String str) {
        kotlin.jvm.internal.n.f(key, "key");
        try {
            return this.f21635a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
