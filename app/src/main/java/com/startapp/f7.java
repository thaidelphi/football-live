package com.startapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f7 extends k7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f21949a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f21950b;

    public f7(HashMap hashMap, String str) {
        this.f21949a = str;
        this.f21950b = hashMap;
    }

    @Override // com.startapp.k7
    public final boolean a(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            if (pair.first != this) {
                return false;
            }
            Object obj2 = pair.second;
            if (obj2 instanceof Intent) {
                Intent intent = (Intent) obj2;
                if (this.f21949a.equals(intent.getAction())) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = Bundle.EMPTY;
                    }
                    for (Map.Entry<String, String> entry : this.f21950b.entrySet()) {
                        if (!entry.getValue().equals(String.valueOf(extras.get(entry.getKey())))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
