package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzju extends r3 {

    /* renamed from: d  reason: collision with root package name */
    private final Map f13658d;

    /* renamed from: e  reason: collision with root package name */
    public final zzez f13659e;

    /* renamed from: f  reason: collision with root package name */
    public final zzez f13660f;

    /* renamed from: g  reason: collision with root package name */
    public final zzez f13661g;

    /* renamed from: h  reason: collision with root package name */
    public final zzez f13662h;

    /* renamed from: i  reason: collision with root package name */
    public final zzez f13663i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzju(zzkz zzkzVar) {
        super(zzkzVar);
        this.f13658d = new HashMap();
        y A = this.f13220a.A();
        A.getClass();
        this.f13659e = new zzez(A, "last_delete_stale", 0L);
        y A2 = this.f13220a.A();
        A2.getClass();
        this.f13660f = new zzez(A2, "backoff", 0L);
        y A3 = this.f13220a.A();
        A3.getClass();
        this.f13661g = new zzez(A3, "last_upload", 0L);
        y A4 = this.f13220a.A();
        A4.getClass();
        this.f13662h = new zzez(A4, "last_upload_attempt", 0L);
        y A5 = this.f13220a.A();
        A5.getClass();
        this.f13663i = new zzez(A5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    protected final boolean g() {
        return false;
    }

    @Deprecated
    final Pair h(String str) {
        e3 e3Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        c();
        long b10 = this.f13220a.zzav().b();
        e3 e3Var2 = (e3) this.f13658d.get(str);
        if (e3Var2 != null && b10 < e3Var2.f12927c) {
            return new Pair(e3Var2.f12925a, Boolean.valueOf(e3Var2.f12926b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long m7 = b10 + this.f13220a.u().m(str, zzeb.f13408c);
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f13220a.zzau());
        } catch (Exception e8) {
            this.f13220a.zzay().l().b("Unable to get advertising id", e8);
            e3Var = new e3("", false, m7);
        }
        if (advertisingIdInfo == null) {
            return new Pair("", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        if (id != null) {
            e3Var = new e3(id, advertisingIdInfo.isLimitAdTrackingEnabled(), m7);
        } else {
            e3Var = new e3("", advertisingIdInfo.isLimitAdTrackingEnabled(), m7);
        }
        this.f13658d.put(str, e3Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(e3Var.f12925a, Boolean.valueOf(e3Var.f12926b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair i(String str, zzai zzaiVar) {
        if (zzaiVar.i(zzah.AD_STORAGE)) {
            return h(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String j(String str, boolean z10) {
        c();
        String str2 = z10 ? (String) h(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest o10 = zzlh.o();
        if (o10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, o10.digest(str2.getBytes())));
    }
}
