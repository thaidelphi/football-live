package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.jobs.b;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p6 extends com.startapp.sdk.jobs.b {
    public p6(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    @Override // com.startapp.sdk.jobs.b, java.lang.Runnable
    public void run() {
        try {
            if (MetaData.f23158k.Z()) {
                y8 a10 = com.startapp.sdk.components.a.a(this.context).f23230f.a();
                a10.f23621b.a().execute(new x8(a10));
                Object obj = StartAppSDKInternal.C;
                l3 l3Var = new l3(m3.f22280j);
                l3Var.f22234j = true;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.R.f22411a;
                    if (aVar == null) {
                        this.callback.a(false);
                    } else {
                        aVar.f23240p.a().a(l3Var);
                    }
                } catch (Throwable unused) {
                }
            } else {
                this.callback.a(false);
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}
