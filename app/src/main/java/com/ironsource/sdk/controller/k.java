package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface k {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements com.ironsource.g {
        @Override // com.ironsource.g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements com.ironsource.h {
        @Override // com.ironsource.h
        public Intent a(Context context) {
            kotlin.jvm.internal.n.f(context, "context");
            return new Intent(context, OpenUrlActivity.class);
        }
    }
}
