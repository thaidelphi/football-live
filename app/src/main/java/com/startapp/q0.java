package com.startapp;

import android.content.Context;
import android.content.Intent;
import com.ironsource.in;
import com.startapp.o9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q0 extends com.startapp.sdk.adsbase.b {

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f22404g;

    /* renamed from: h  reason: collision with root package name */
    public final HashSet f22405h;

    /* renamed from: i  reason: collision with root package name */
    public GetAdRequest f22406i;

    /* renamed from: j  reason: collision with root package name */
    public int f22407j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f22408k;

    /* renamed from: l  reason: collision with root package name */
    public n f22409l;

    public q0(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, boolean z10) {
        super(context, ad, adPreferences, adEventListener, placement);
        this.f22404g = new HashSet();
        this.f22405h = new HashSet();
        this.f22407j = 0;
        this.f22408k = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
        r8.f23007f = "Video isn't available";
     */
    @Override // com.startapp.sdk.adsbase.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "@adId@"
            r1 = 0
            if (r9 != 0) goto Le
            java.lang.String r9 = r8.f23007f
            if (r9 != 0) goto Ld
            java.lang.String r9 = "No response"
            r8.f23007f = r9
        Ld:
            return r1
        Le:
            boolean r2 = r9 instanceof com.startapp.e3
            if (r2 != 0) goto L1b
            java.lang.String r9 = r8.f23007f
            if (r9 != 0) goto L1a
            java.lang.String r9 = "Unknown error"
            r8.f23007f = r9
        L1a:
            return r1
        L1b:
            com.startapp.e3 r9 = (com.startapp.e3) r9
            java.lang.String r2 = r9.f21903b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcb
            r3.<init>()     // Catch: java.lang.Throwable -> Lcb
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lcb
            r5 = 1
            if (r4 == 0) goto L4b
            java.lang.String r9 = r8.f23007f     // Catch: java.lang.Throwable -> Lcb
            if (r9 != 0) goto L4a
            com.startapp.sdk.adsbase.model.GetAdRequest r9 = r8.f22406i     // Catch: java.lang.Throwable -> Lcb
            if (r9 == 0) goto L46
            com.startapp.sdk.adsbase.Ad$AdType r9 = r9.V0     // Catch: java.lang.Throwable -> Lcb
            com.startapp.sdk.adsbase.Ad$AdType r0 = com.startapp.sdk.adsbase.Ad.AdType.VIDEO     // Catch: java.lang.Throwable -> Lcb
            if (r9 == r0) goto L3f
            com.startapp.sdk.adsbase.Ad$AdType r0 = com.startapp.sdk.adsbase.Ad.AdType.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Lcb
            if (r9 != r0) goto L3e
            goto L3f
        L3e:
            r5 = r1
        L3f:
            if (r5 == 0) goto L46
            java.lang.String r9 = "Video isn't available"
            r8.f23007f = r9     // Catch: java.lang.Throwable -> Lcb
            goto L4a
        L46:
            java.lang.String r9 = "Empty Ad"
            r8.f23007f = r9     // Catch: java.lang.Throwable -> Lcb
        L4a:
            return r1
        L4b:
            com.startapp.sdk.adsbase.AdsCommonMetaData r4 = com.startapp.sdk.adsbase.AdsCommonMetaData.f22889h     // Catch: java.lang.Throwable -> Lcb
            boolean r4 = r4.H()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.startapp.o9.a(r2, r0, r0)     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L66
            int r6 = r0.length()     // Catch: java.lang.Throwable -> Lcb
            if (r6 <= 0) goto L66
            com.startapp.n r6 = new com.startapp.n     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = r8.f22408k     // Catch: java.lang.Throwable -> Lcb
            r6.<init>(r0, r9, r7, r4)     // Catch: java.lang.Throwable -> Lcb
            r8.f22409l = r6     // Catch: java.lang.Throwable -> Lcb
        L66:
            int r0 = r8.f22407j     // Catch: java.lang.Throwable -> Lcb
            java.util.ArrayList r0 = com.startapp.b0.a(r2, r0)     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L80
            android.content.Context r4 = r8.f23002a     // Catch: java.lang.Throwable -> Lcb
            int r6 = r8.f22407j     // Catch: java.lang.Throwable -> Lcb
            java.util.HashSet r7 = r8.f22404g     // Catch: java.lang.Throwable -> Lcb
            java.lang.Boolean r4 = com.startapp.b0.a(r4, r0, r6, r7, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L80
            r4 = r5
            goto L81
        L80:
            r4 = r1
        L81:
            com.startapp.n r6 = r8.f22409l     // Catch: java.lang.Throwable -> Lcb
            if (r6 == 0) goto L87
            r6.f22303f = r4     // Catch: java.lang.Throwable -> Lcb
        L87:
            if (r4 == 0) goto La2
            com.startapp.a0 r9 = new com.startapp.a0     // Catch: java.lang.Throwable -> Lcb
            android.content.Context r0 = r8.f23002a     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            com.startapp.sdk.components.a r0 = com.startapp.sdk.components.a.a(r0)     // Catch: java.lang.Throwable -> Lcb
            com.startapp.t4<java.util.concurrent.Executor> r0 = r0.f23249y     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> Lcb
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch: java.lang.Throwable -> Lcb
            com.startapp.a0$a r9 = r9.f21746c     // Catch: java.lang.Throwable -> Lcb
            r0.execute(r9)     // Catch: java.lang.Throwable -> Lcb
            goto Lb1
        La2:
            com.startapp.sdk.adsbase.Ad r3 = r8.f23003b     // Catch: java.lang.Throwable -> Lcb
            com.startapp.sdk.adsbase.HtmlAd r3 = (com.startapp.sdk.adsbase.HtmlAd) r3     // Catch: java.lang.Throwable -> Lcb
            r3.a(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r9 = r9.f21902a     // Catch: java.lang.Throwable -> Lcb
            r3.setRequestUrl(r9)     // Catch: java.lang.Throwable -> Lcb
            r3.c(r2)     // Catch: java.lang.Throwable -> Lcb
        Lb1:
            com.startapp.n r9 = r8.f22409l     // Catch: java.lang.Throwable -> Lcb
            if (r9 == 0) goto Lbb
            long r2 = com.startapp.o9.a()     // Catch: java.lang.Throwable -> Lcb
            r9.f22304g = r2     // Catch: java.lang.Throwable -> Lcb
        Lbb:
            if (r4 == 0) goto Lca
            r8.f()     // Catch: java.lang.Throwable -> Lcb
            int r9 = r8.f22407j     // Catch: java.lang.Throwable -> Lcb
            int r9 = r9 + r5
            r8.f22407j = r9     // Catch: java.lang.Throwable -> Lcb
            boolean r9 = r8.b()     // Catch: java.lang.Throwable -> Lcb
            return r9
        Lca:
            return r5
        Lcb:
            r9 = move-exception
            com.startapp.l3.a(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.q0.a(java.lang.Object):boolean");
    }

    @Override // com.startapp.sdk.adsbase.b
    public void b(boolean z10) {
        super.b(z10);
    }

    public boolean b(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }

    public final void c(boolean z10) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f23003b.hashCode());
        intent.putExtra("adResult", z10);
        c5.a(this.f23002a).a(intent);
        if (z10) {
            if (this.f22408k) {
                n nVar = this.f22409l;
                if (nVar != null) {
                    nVar.f22305h = o9.a();
                }
                com.startapp.sdk.components.a.a(this.f23002a).f23226b.a().a(((HtmlAd) this.f23003b).k(), new a());
                return;
            }
            l.b(this.f23002a, a(), this.f23003b, false);
            f();
            return;
        }
        l.a(this.f23002a, a(), this.f23003b, false);
        f();
    }

    @Override // com.startapp.sdk.adsbase.b
    public final Object e() throws Exception {
        GetAdRequest d10 = d();
        this.f22406i = d10;
        if (b(d10)) {
            if (this.f22404g.size() == 0) {
                this.f22404g.add(this.f23002a.getPackageName());
            }
            GetAdRequest getAdRequest = this.f22406i;
            getAdRequest.H0 = this.f22404g;
            getAdRequest.J0 = this.f22405h;
            if (this.f22407j > 0) {
                getAdRequest.L0 = false;
                if (MetaData.f23158k.M().a(this.f23002a)) {
                    SimpleTokenUtils.c(this.f23002a);
                }
            }
            b3 a10 = com.startapp.sdk.components.a.a(this.f23002a).f23237m.a();
            GetAdRequest getAdRequest2 = this.f22406i;
            AdPreferences.Placement placement = this.f23006e;
            String str = q.f22396b;
            String a11 = MetaData.f23158k.a(placement);
            String a12 = getAdRequest2.a(a11 + str);
            try {
                HashMap a13 = a10.a();
                long currentTimeMillis = System.currentTimeMillis();
                long a14 = o9.a();
                t4<d6> t4Var = a10.f21790d;
                g6 g6Var = t4Var != null ? new g6(t4Var.a()) : null;
                try {
                    e3 a15 = b3.a(a13, a12);
                    if (g6Var != null) {
                        g6Var.a(in.f17848a, a12, null);
                    }
                    a15.f21906e = currentTimeMillis;
                    a15.f21907f = a14;
                    a15.f21908g = o9.a();
                    return a15;
                } catch (SDKException e8) {
                    if (g6Var != null) {
                        g6Var.a(in.f17848a, a12, e8);
                    }
                    this.f23007f = e8.getMessage();
                    return null;
                }
            } catch (Throwable th) {
                if (a10.a(1)) {
                    l3.a(th);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final void f() {
        n nVar = this.f22409l;
        if (nVar != null) {
            try {
                com.startapp.sdk.components.a.a(this.f23002a).I.a().a(nVar);
            } catch (Throwable th) {
                l3.a(th);
            }
            this.f22409l = null;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements o9.b {
        public a() {
        }

        @Override // com.startapp.o9.b
        public final void a(boolean z10, long j10, long j11, boolean z11) {
            q0 q0Var = q0.this;
            l.b(q0Var.f23002a, q0Var.a(), q0.this.f23003b, false);
            q0 q0Var2 = q0.this;
            n nVar = q0Var2.f22409l;
            if (nVar != null) {
                nVar.f22302e = z10;
                nVar.f22306i = j10;
                nVar.f22307j = j11;
                nVar.f22309l = z11;
                q0Var2.f();
            }
        }

        @Override // com.startapp.o9.b
        public final void a(String str, int i10) {
            q0.this.f23003b.setErrorMessage(str);
            q0 q0Var = q0.this;
            l.a(q0Var.f23002a, q0Var.a(), q0.this.f23003b, false);
            q0 q0Var2 = q0.this;
            n nVar = q0Var2.f22409l;
            if (nVar != null) {
                nVar.f22308k = i10;
                q0Var2.f();
            }
        }
    }
}
