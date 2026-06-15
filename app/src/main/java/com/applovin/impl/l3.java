package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l3 {

    /* renamed from: a  reason: collision with root package name */
    private a f7446a;

    /* renamed from: b  reason: collision with root package name */
    private String f7447b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private l3(a aVar, String str) {
        this.f7446a = aVar;
        this.f7447b = str;
    }

    public a a() {
        return this.f7446a;
    }

    public String b() {
        return this.f7447b;
    }

    public static l3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new l3(a.AD_UNIT_ID, str);
    }

    public static l3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new l3(a.AD_FORMAT, label);
    }

    public static l3 a(u2 u2Var) {
        String S = u2Var.S();
        if (TextUtils.isEmpty(S)) {
            return null;
        }
        return new l3(a.AD, S);
    }
}
