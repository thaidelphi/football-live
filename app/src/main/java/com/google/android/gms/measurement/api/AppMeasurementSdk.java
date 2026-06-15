package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AppMeasurementSdk {

    /* renamed from: a  reason: collision with root package name */
    private final zzee f12827a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface EventInterceptor extends zzgy {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.1.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface OnEventListener extends zzgz {
    }

    public AppMeasurementSdk(zzee zzeeVar) {
        this.f12827a = zzeeVar;
    }

    @KeepForSdk
    public static AppMeasurementSdk k(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzee.zzg(context, str, str2, str3, bundle).zzd();
    }

    @KeepForSdk
    public void a(String str) {
        this.f12827a.zzu(str);
    }

    @KeepForSdk
    public void b(String str, String str2, Bundle bundle) {
        this.f12827a.zzv(str, str2, bundle);
    }

    @KeepForSdk
    public void c(String str) {
        this.f12827a.zzw(str);
    }

    @KeepForSdk
    public long d() {
        return this.f12827a.zzb();
    }

    @KeepForSdk
    public String e() {
        return this.f12827a.zzj();
    }

    @KeepForSdk
    public String f() {
        return this.f12827a.zzl();
    }

    @KeepForSdk
    public List<Bundle> g(String str, String str2) {
        return this.f12827a.zzp(str, str2);
    }

    @KeepForSdk
    public String h() {
        return this.f12827a.zzm();
    }

    @KeepForSdk
    public String i() {
        return this.f12827a.zzn();
    }

    @KeepForSdk
    public String j() {
        return this.f12827a.zzo();
    }

    @KeepForSdk
    public int l(String str) {
        return this.f12827a.zza(str);
    }

    @KeepForSdk
    public Map<String, Object> m(String str, String str2, boolean z10) {
        return this.f12827a.zzq(str, str2, z10);
    }

    @KeepForSdk
    public void n(String str, String str2, Bundle bundle) {
        this.f12827a.zzy(str, str2, bundle);
    }

    @KeepForSdk
    public void o(Bundle bundle) {
        this.f12827a.zzc(bundle, false);
    }

    @KeepForSdk
    public Bundle p(Bundle bundle) {
        return this.f12827a.zzc(bundle, true);
    }

    @KeepForSdk
    public void q(Bundle bundle) {
        this.f12827a.zzD(bundle);
    }

    @KeepForSdk
    public void r(Bundle bundle) {
        this.f12827a.zzE(bundle);
    }

    @KeepForSdk
    public void s(Activity activity, String str, String str2) {
        this.f12827a.zzG(activity, str, str2);
    }

    @KeepForSdk
    public void t(String str, String str2, Object obj) {
        this.f12827a.zzN(str, str2, obj, true);
    }

    public final void u(boolean z10) {
        this.f12827a.zzH(z10);
    }
}
