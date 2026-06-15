package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzaw implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f11415a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzax zzaxVar, Context context) {
        this.f11415a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(this.f11415a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
