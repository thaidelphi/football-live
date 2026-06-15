package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzhec;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzo implements zzbcm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzbcn f11509a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f11510b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Uri f11511c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzs zzsVar, zzbcn zzbcnVar, Context context, Uri uri) {
        this.f11509a = zzbcnVar;
        this.f11510b = context;
        this.f11511c = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zza() {
        d a10 = new d.C0026d(this.f11509a.zza()).a();
        a10.f1858a.setPackage(zzhec.zza(this.f11510b));
        a10.a(this.f11510b, this.f11511c);
        this.f11509a.zzf((Activity) this.f11510b);
    }
}
