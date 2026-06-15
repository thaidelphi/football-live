package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@VisibleForTesting
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhb {

    /* renamed from: a  reason: collision with root package name */
    final Context f13595a;

    /* renamed from: b  reason: collision with root package name */
    String f13596b;

    /* renamed from: c  reason: collision with root package name */
    String f13597c;

    /* renamed from: d  reason: collision with root package name */
    String f13598d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f13599e;

    /* renamed from: f  reason: collision with root package name */
    long f13600f;

    /* renamed from: g  reason: collision with root package name */
    com.google.android.gms.internal.measurement.zzcl f13601g;

    /* renamed from: h  reason: collision with root package name */
    boolean f13602h;

    /* renamed from: i  reason: collision with root package name */
    final Long f13603i;

    /* renamed from: j  reason: collision with root package name */
    String f13604j;

    @VisibleForTesting
    public zzhb(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        this.f13602h = true;
        Preconditions.m(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m(applicationContext);
        this.f13595a = applicationContext;
        this.f13603i = l10;
        if (zzclVar != null) {
            this.f13601g = zzclVar;
            this.f13596b = zzclVar.zzf;
            this.f13597c = zzclVar.zze;
            this.f13598d = zzclVar.zzd;
            this.f13602h = zzclVar.zzc;
            this.f13600f = zzclVar.zzb;
            this.f13604j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f13599e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
