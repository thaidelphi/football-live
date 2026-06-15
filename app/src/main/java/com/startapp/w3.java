package com.startapp;

import com.ironsource.b9;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w3 extends u0 {

    /* renamed from: j0  reason: collision with root package name */
    public final l3 f23497j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f23498k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f23499l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f23500m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f23501n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f23502o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f23503p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f23504q0;

    /* renamed from: r0  reason: collision with root package name */
    public Map<String, String> f23505r0;

    public w3(l3 l3Var) {
        super(8);
        this.f23497j0 = l3Var;
    }

    @Override // com.startapp.u0
    public final void a(w6 w6Var) throws SDKException {
        super.a(w6Var);
        l3 l3Var = this.f23497j0;
        Long l10 = l3Var.f22232h;
        String l11 = l10 != null ? l10.toString() : a.a();
        w6Var.a(a.f21738b, l11, true, true);
        w6Var.a(a.f21739c, a.a(l11), true, true);
        w6Var.a("category", l3Var.f22225a.f22288a, true, true);
        w6Var.a(b9.h.X, l3Var.f22228d, false, true);
        w6Var.a("d", l3Var.f22231g, false, true);
        w6Var.a("appActivity", l3Var.f22233i, false, true);
        w6Var.a("details", l3Var.f22229e, false, true);
        w6Var.a("detailsJson", l3Var.f22230f, false, true);
        w6Var.a("isService", Boolean.valueOf(l3Var.f22234j), false, true);
        w6Var.a("orientation", this.f23498k0, false, true);
        w6Var.a("usedRam", this.f23499l0, false, true);
        w6Var.a("freeRam", this.f23500m0, false, true);
        w6Var.a("sessionTime", null, false, true);
        w6Var.a("cellScanRes", this.f23501n0, false, true);
        w6Var.a("sens", this.f23502o0, false, true);
        w6Var.a("bt", this.f23503p0, false, true);
        w6Var.a("packagingType", this.f23504q0, false, true);
        Pair<String, String> a10 = SimpleTokenUtils.a();
        Pair<String, String> b10 = SimpleTokenUtils.b();
        w6Var.a(a10.first, a10.second, false, true);
        w6Var.a(b10.first, b10.second, false, true);
        Map<String, String> map = this.f23505r0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                w6Var.a(entry.getKey(), entry.getValue(), false, true);
            }
        }
        w6Var.a("rcd", null, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(8:5|(1:7)(1:(1:26))|8|9|10|(2:12|(1:14))|16|17)|27|8|9|10|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (com.startapp.o9.a(r10, (java.lang.Class<? extends java.lang.Throwable>) java.lang.SecurityException.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        com.startapp.l3.a(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:13:0x0027, B:15:0x0031, B:17:0x004b), top: B:28:0x0027 }] */
    @Override // com.startapp.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r10, com.startapp.sdk.adsbase.model.AdPreferences r11) {
        /*
            r9 = this;
            super.b(r10, r11)
            android.content.res.Resources r11 = r10.getResources()
            r0 = 1
            if (r11 == 0) goto L1d
            android.content.res.Configuration r11 = r11.getConfiguration()
            if (r11 == 0) goto L1d
            int r11 = r11.orientation
            r1 = 2
            if (r11 != r1) goto L18
            java.lang.String r11 = "landscape"
            goto L1f
        L18:
            if (r11 != r0) goto L1d
            java.lang.String r11 = "portrait"
            goto L1f
        L1d:
            java.lang.String r11 = "undefined"
        L1f:
            r9.f23498k0 = r11
            r11 = 0
            java.lang.String[] r11 = new java.lang.String[]{r11, r11}
            r1 = 0
            java.lang.String r2 = "activity"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Throwable -> L5a
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto L6f
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Throwable -> L5a
            r10.getMemoryInfo(r2)     // Catch: java.lang.Throwable -> L5a
            long r3 = r2.availMem     // Catch: java.lang.Throwable -> L5a
            r5 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 / r5
            java.lang.String r10 = java.lang.Long.toString(r3)     // Catch: java.lang.Throwable -> L5a
            r11[r1] = r10     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r10 = com.startapp.y.a(r2)     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto L6f
            long r3 = r10.longValue()     // Catch: java.lang.Throwable -> L5a
            long r7 = r2.availMem     // Catch: java.lang.Throwable -> L5a
            long r3 = r3 - r7
            long r3 = r3 / r5
            java.lang.String r10 = java.lang.Long.toString(r3)     // Catch: java.lang.Throwable -> L5a
            r11[r0] = r10     // Catch: java.lang.Throwable -> L5a
            goto L6f
        L5a:
            r10 = move-exception
            java.lang.Class<java.lang.SecurityException> r2 = java.lang.SecurityException.class
            boolean r2 = com.startapp.o9.a(r10, r2)
            if (r2 != 0) goto L6f
            java.lang.Class<android.os.RemoteException> r2 = android.os.RemoteException.class
            boolean r2 = com.startapp.o9.a(r10, r2)
            if (r2 == 0) goto L6c
            goto L6f
        L6c:
            com.startapp.l3.a(r10)
        L6f:
            r10 = r11[r1]
            r9.f23500m0 = r10
            r10 = r11[r0]
            r9.f23499l0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w3.b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public final String toString() {
        return this.f23497j0.toString();
    }
}
