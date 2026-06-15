package com.startapp.sdk.adsbase;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.in;
import com.startapp.b3;
import com.startapp.d6;
import com.startapp.e3;
import com.startapp.g6;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.q;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.t4;
import com.startapp.u7;
import java.util.HashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f23106b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f23107c;

    public f(Context context, com.startapp.sdk.components.a aVar, e eVar) {
        this.f23105a = context;
        this.f23106b = aVar;
        this.f23107c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e3 e3Var;
        try {
            u7 u7Var = new u7(this.f23105a);
            u7Var.a(this.f23105a, new AdPreferences());
            b3 a10 = this.f23106b.f23237m.a();
            StringBuilder sb = new StringBuilder();
            MetaData metaData = MetaData.f23158k;
            String str = metaData.trackDownloadHost;
            if (str == null) {
                str = metaData.d();
            }
            sb.append(str);
            sb.append(q.f22397c);
            String a11 = u7Var.a(sb.toString());
            HashMap a12 = a10.a();
            long currentTimeMillis = System.currentTimeMillis();
            long a13 = o9.a();
            t4<d6> t4Var = a10.f21790d;
            g6 g6Var = t4Var != null ? new g6(t4Var.a()) : null;
            try {
                e3Var = b3.a(a12, a11);
                if (g6Var != null) {
                    g6Var.a(in.f17848a, a11, null);
                }
                e3Var.f21906e = currentTimeMillis;
                e3Var.f21907f = a13;
                e3Var.f21908g = o9.a();
            } catch (SDKException e8) {
                if (g6Var != null) {
                    g6Var.a(in.f17848a, a11, e8);
                }
                e3Var = null;
            }
            if (e3Var != null) {
                String str2 = e3Var.f21903b;
                if (!TextUtils.isEmpty(str2)) {
                    String a14 = o9.a(str2, "@ct@", "@ct@");
                    String a15 = o9.a(str2, "@tsc@", "@tsc@");
                    String a16 = o9.a(str2, "@apc@", "@apc@");
                    Integer valueOf = !TextUtils.isEmpty(a14) ? Integer.valueOf(Integer.parseInt(a14)) : null;
                    Long valueOf2 = !TextUtils.isEmpty(a15) ? Long.valueOf(Long.parseLong(a15)) : null;
                    Boolean valueOf3 = TextUtils.isEmpty(a16) ? null : Boolean.valueOf(Boolean.parseBoolean(a16));
                    if (valueOf != null || valueOf2 != null || valueOf3 != null) {
                        this.f23106b.f23233i.a().a(valueOf, valueOf2, valueOf3, false, true);
                    }
                }
            }
            this.f23107c.edit().putBoolean("shared_prefs_first_init", false).apply();
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}
