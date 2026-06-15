package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzax implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f11416a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f11417b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f11418c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f11419d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzay zzayVar, Context context, String str, boolean z10, boolean z11) {
        this.f11416a = context;
        this.f11417b = str;
        this.f11418c = z10;
        this.f11419d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzL = zzs.zzL(this.f11416a);
        zzL.setMessage(this.f11417b);
        if (this.f11418c) {
            zzL.setTitle("Error");
        } else {
            zzL.setTitle("Info");
        }
        if (this.f11419d) {
            zzL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            zzL.setPositiveButton("Learn More", new zzaw(this, this.f11416a));
            zzL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        zzL.create().show();
    }
}
