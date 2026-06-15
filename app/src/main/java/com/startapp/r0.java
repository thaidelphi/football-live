package com.startapp;

import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class r0 extends com.startapp.sdk.adsbase.b {

    /* renamed from: g  reason: collision with root package name */
    public int f22443g;

    /* renamed from: h  reason: collision with root package name */
    public final HashSet f22444h;

    public r0(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement);
        this.f22443g = 0;
        this.f22444h = new HashSet();
    }

    public abstract void a(JsonAd jsonAd);

    @Override // com.startapp.sdk.adsbase.b
    public final boolean a(Object obj) {
        int i10;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z10 = false;
        if (obj == null) {
            this.f23007f = "Empty Response";
            return false;
        } else if (!getAdResponse.b()) {
            this.f23007f = getAdResponse.a();
            return false;
        } else {
            JsonAd jsonAd = (JsonAd) this.f23003b;
            ArrayList a10 = b0.a(this.f23002a, (List) getAdResponse.d(), this.f22443g, this.f22444h, true);
            jsonAd.a(a10);
            jsonAd.setAdInfoOverride(getAdResponse.c());
            if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
                z10 = true;
            }
            if (!z10) {
                this.f23007f = "Empty Response";
            } else if (a10.size() == 0 && (i10 = this.f22443g) == 0) {
                this.f22443g = i10 + 1;
                return b();
            }
            return z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // com.startapp.sdk.adsbase.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e() throws java.lang.Exception {
        /*
            r13 = this;
            java.lang.String r0 = "GET"
            com.startapp.sdk.adsbase.model.GetAdRequest r1 = r13.d()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.HashSet r3 = r13.f22444h
            int r3 = r3.size()
            if (r3 != 0) goto L1d
            java.util.HashSet r3 = r13.f22444h
            android.content.Context r4 = r13.f23002a
            java.lang.String r4 = r4.getPackageName()
            r3.add(r4)
        L1d:
            int r3 = r13.f22443g
            r4 = 0
            if (r3 <= 0) goto L24
            r1.L0 = r4
        L24:
            java.util.HashSet r5 = r13.f22444h
            r1.H0 = r5
            r5 = 1
            if (r3 != 0) goto L2c
            r4 = r5
        L2c:
            r1.L0 = r4
            android.content.Context r3 = r13.f23002a
            com.startapp.sdk.components.a r3 = com.startapp.sdk.components.a.a(r3)
            com.startapp.t4<com.startapp.b3> r3 = r3.f23237m
            java.lang.Object r3 = r3.a()
            com.startapp.b3 r3 = (com.startapp.b3) r3
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r4 = r13.f23006e
            java.lang.String r6 = com.startapp.q.f22395a
            com.startapp.sdk.adsbase.remoteconfig.MetaData r7 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k
            java.lang.String r4 = r7.a(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r1 = r1.a(r4)
            java.lang.Class<com.startapp.sdk.adsbase.model.GetAdResponse> r4 = com.startapp.sdk.adsbase.model.GetAdResponse.class
            java.util.HashMap r6 = r3.a()     // Catch: java.lang.Throwable -> La6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La6
            long r9 = com.startapp.o9.a()     // Catch: java.lang.Throwable -> La6
            com.startapp.t4<com.startapp.d6> r11 = r3.f21790d     // Catch: java.lang.Throwable -> La6
            if (r11 == 0) goto L77
            java.lang.Object r11 = r11.a()     // Catch: java.lang.Throwable -> La6
            com.startapp.d6 r11 = (com.startapp.d6) r11     // Catch: java.lang.Throwable -> La6
            com.startapp.g6 r12 = new com.startapp.g6     // Catch: java.lang.Throwable -> La6
            r12.<init>(r11)     // Catch: java.lang.Throwable -> La6
            goto L78
        L77:
            r12 = r2
        L78:
            com.startapp.e3 r6 = com.startapp.b3.a(r6, r1)     // Catch: com.startapp.sdk.common.SDKException -> L8c java.lang.Throwable -> La6
            if (r12 == 0) goto L81
            r12.a(r0, r1, r2)     // Catch: com.startapp.sdk.common.SDKException -> L8c java.lang.Throwable -> La6
        L81:
            r6.f21906e = r7     // Catch: com.startapp.sdk.common.SDKException -> L8c java.lang.Throwable -> La6
            r6.f21907f = r9     // Catch: com.startapp.sdk.common.SDKException -> L8c java.lang.Throwable -> La6
            long r7 = com.startapp.o9.a()     // Catch: com.startapp.sdk.common.SDKException -> L8c java.lang.Throwable -> La6
            r6.f21908g = r7     // Catch: com.startapp.sdk.common.SDKException -> L8c java.lang.Throwable -> La6
            goto Lb1
        L8c:
            r6 = move-exception
            if (r12 == 0) goto L92
            r12.a(r0, r1, r6)     // Catch: java.lang.Throwable -> La6
        L92:
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L99
            r13.f23007f = r0     // Catch: java.lang.Throwable -> L99
            goto Lb0
        L99:
            r0 = move-exception
            r1 = 32
            boolean r1 = r3.a(r1)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto Lb0
            com.startapp.l3.a(r0)     // Catch: java.lang.Throwable -> La6
            goto Lb0
        La6:
            r0 = move-exception
            boolean r1 = r3.a(r5)
            if (r1 == 0) goto Lb0
            com.startapp.l3.a(r0)
        Lb0:
            r6 = r2
        Lb1:
            if (r6 == 0) goto Lbe
            java.lang.String r0 = r6.f21903b     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r2 = com.startapp.m4.a(r4, r0)     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r0 = move-exception
            com.startapp.l3.a(r0)
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.r0.e():java.lang.Object");
    }

    @Override // com.startapp.sdk.adsbase.b
    public final void a(boolean z10) {
        super.a(z10);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f23003b.hashCode());
        intent.putExtra("adResult", z10);
        c5.a(this.f23002a).a(intent);
        if (z10) {
            a((JsonAd) this.f23003b);
            l.b(this.f23002a, a(), this.f23003b, false);
        }
    }
}
