package com.startapp;

import android.content.Context;
import android.os.Build;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u7 extends u0 {

    /* renamed from: j0  reason: collision with root package name */
    public final v6 f23444j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f23445k0;

    public u7(Context context) {
        super(1);
        this.f23444j0 = s6.a(context);
        this.f23445k0 = y.a(context);
    }

    @Override // com.startapp.u0
    public final void a(w6 w6Var) throws SDKException {
        super.a(w6Var);
        w6Var.a("placement", "INAPP_DOWNLOAD", true, true);
        v6 v6Var = this.f23444j0;
        if (v6Var != null) {
            w6Var.a("install_referrer", v6Var.f23476a.getString("install_referrer"), true, true);
            w6Var.a("referrer_click_timestamp_seconds", Long.valueOf(this.f23444j0.f23476a.getLong("referrer_click_timestamp_seconds")), true, true);
            w6Var.a("install_begin_timestamp_seconds", Long.valueOf(this.f23444j0.f23476a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        w6Var.a("apkSig", this.f23445k0, true, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j10 = SimpleTokenUtils.f22893c;
            if (j10 != 0) {
                w6Var.a("firstInstalledAppTS", Long.valueOf(j10), false, true);
            }
        }
    }
}
