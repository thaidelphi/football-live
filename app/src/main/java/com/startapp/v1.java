package com.startapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ironsource.da;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v1 implements com.startapp.sdk.adsbase.remoteconfig.c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23462a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f23463b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<AdvertisingIdResolver> f23464c;

    /* renamed from: d  reason: collision with root package name */
    public Intent f23465d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23466e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23467f = true;

    public v1(Context context, t4<com.startapp.sdk.adsbase.e> t4Var, t4<AdvertisingIdResolver> t4Var2) {
        this.f23462a = context;
        this.f23463b = t4Var;
        this.f23464c = t4Var2;
    }

    public final void a(Integer num, Long l10, Boolean bool, boolean z10, boolean z11) {
        if (d()) {
            long j10 = this.f23463b.a().getLong("consentTimestamp", 0L);
            int i10 = this.f23463b.a().getInt("consentType", -1);
            boolean contains = this.f23463b.a().contains("consentApc");
            boolean z12 = true;
            boolean z13 = (num == null || i10 == num.intValue()) ? false : true;
            boolean z14 = (bool == null || (contains && this.f23463b.a().getBoolean("consentApc", false) == bool.booleanValue())) ? false : true;
            if (l10 == null || l10.longValue() <= j10) {
                z12 = false;
            }
            if (z10 || z12) {
                if (z13 || z14) {
                    e.a edit = this.f23463b.a().edit();
                    if (z13) {
                        edit.putInt("consentType", num.intValue());
                    }
                    if (z14) {
                        edit.putBoolean("consentApc", bool.booleanValue());
                    }
                    if (z12) {
                        edit.putLong("consentTimestamp", l10.longValue());
                    }
                    edit.apply();
                    if (z11) {
                        MetaData.f23158k.a(this.f23462a, new AdPreferences(), MetaDataRequest.RequestReason.CONSENT, false, null, true);
                    }
                }
            }
        }
    }

    public final Boolean b() {
        if (d() && this.f23463b.a().contains("consentApc")) {
            return Boolean.valueOf(this.f23463b.a().getBoolean("consentApc", false));
        }
        return null;
    }

    public final Integer c() {
        if (d()) {
            int hashCode = this.f23464c.a().a().f22479a.hashCode();
            if (!this.f23463b.a().contains("advIdHash") || this.f23463b.a().getInt("advIdHash", 0) != hashCode) {
                e.a edit = this.f23463b.a().edit();
                if (edit.f23102b.containsKey("consentType")) {
                    edit.f23104d = true;
                }
                edit.f23101a.remove("consentType");
                if (edit.f23102b.containsKey("consentTimestamp")) {
                    edit.f23104d = true;
                }
                edit.f23101a.remove("consentTimestamp");
                edit.putInt("advIdHash", hashCode).apply();
            }
        }
        if (d() && this.f23463b.a().contains("consentType")) {
            return Integer.valueOf(this.f23463b.a().getInt("consentType", -1));
        }
        return null;
    }

    public final boolean d() {
        ConsentConfig o10 = MetaData.f23158k.o();
        return this.f23467f && o10 != null && o10.l();
    }

    public final boolean a(String str, String str2, String str3, boolean z10) {
        ConsentConfig o10;
        String g10;
        Integer b10;
        if ((z10 || StartAppSDKInternal.b()) && (o10 = MetaData.f23158k.o()) != null && ((d() || z10) && !this.f23466e)) {
            Context context = this.f23462a;
            WeakHashMap weakHashMap = o9.f22359a;
            if (com.startapp.sdk.components.a.a(context).f23243s.a().b() && o9.e(this.f23462a)) {
                if (z10 || !(o10.i() == null || o10.h() == null || this.f23463b.a().contains("consentApc"))) {
                    if (z10) {
                        g10 = AdInformationMetaData.f22954a.a().c();
                    } else {
                        g10 = o10.g();
                    }
                    if (g10 == null) {
                        return false;
                    }
                    Intent intent = new Intent(this.f23462a, ConsentActivity.class);
                    intent.setFlags(805306368);
                    intent.setData(Uri.parse(g10));
                    intent.putExtra("allowCT", o10.l());
                    intent.putExtra(da.a.f16995d, o10.j());
                    Integer valueOf = Integer.valueOf(z10 ? 4 : o10.i().intValue());
                    if (valueOf != null) {
                        intent.putExtra("templateName", valueOf);
                    }
                    Integer valueOf2 = Integer.valueOf(z10 ? 7 : o10.h().intValue());
                    if (valueOf2 != null) {
                        intent.putExtra("templateId", valueOf2);
                    }
                    if (!z10) {
                        str = o10.d();
                    }
                    if (str != null) {
                        intent.putExtra("dParam", str);
                    }
                    if (!z10) {
                        str2 = o10.e();
                    }
                    if (str2 != null) {
                        intent.putExtra("impressionUrl", str2);
                    }
                    if (!z10) {
                        str3 = o10.a();
                    }
                    if (str3 != null) {
                        intent.putExtra("clickUrl", str3);
                    }
                    if (z10) {
                        intent.putExtra("advertisingId", this.f23464c.a().a().f22479a);
                        if (this.f23463b.a().contains("consentType")) {
                            intent.putExtra("consentType", this.f23463b.a().getInt("consentType", -1));
                        }
                    }
                    ConsentTypeInfoConfig c10 = o10.c();
                    if (c10 != null) {
                        if (c10.b() != null) {
                            intent.putExtra("impression", c10.b());
                        }
                        if (c10.a() != null) {
                            intent.putExtra("falseClick", c10.a());
                        }
                        if (c10.c() != null) {
                            intent.putExtra("trueClick", c10.c());
                        }
                    }
                    if (z10 && (b10 = AdInformationMetaData.f22954a.a().b()) != null) {
                        intent.putExtra("trueClick", b10);
                    }
                    try {
                        this.f23462a.startActivity(intent);
                        this.f23466e = true;
                        if (a(1)) {
                            l3 l3Var = new l3(m3.f22274d);
                            l3Var.f22228d = "CNS.shown";
                            l3Var.f22233i = String.valueOf(z10);
                            l3Var.f22229e = String.valueOf(System.currentTimeMillis());
                            l3Var.a();
                        }
                    } catch (ActivityNotFoundException unused) {
                    } catch (Throwable th) {
                        if (a(2)) {
                            l3.a(th);
                        }
                    }
                    return this.f23466e;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean a(int i10) {
        ConsentConfig o10 = MetaData.f23158k.o();
        ComponentInfoEventConfig f10 = o10 != null ? o10.f() : null;
        return f10 != null && f10.a((long) i10);
    }

    @Override // com.startapp.sdk.adsbase.remoteconfig.c
    public final void a() {
        MetaData.f23158k.a(this);
    }

    @Override // com.startapp.sdk.adsbase.remoteconfig.c
    public final void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
        MetaData.f23158k.a(this);
        ConsentConfig o10 = MetaData.f23158k.o();
        if (o10 == null || !d()) {
            return;
        }
        Integer b10 = o10.b();
        if (b10 != null) {
            a(b10, Long.valueOf(o10.j()), null, false, false);
        }
        if (requestReason == MetaDataRequest.RequestReason.CONSENT) {
            this.f23463b.a().edit().putLong("consentTimestamp", o10.j()).apply();
        } else if (requestReason == MetaDataRequest.RequestReason.LAUNCH) {
            a(null, null, null, false);
        }
    }
}
