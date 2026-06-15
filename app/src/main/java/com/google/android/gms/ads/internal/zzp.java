package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzauc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzp implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzu f11547a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzu zzuVar) {
        this.f11547a = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzauc zzaucVar;
        zzauc zzaucVar2;
        zzu zzuVar = this.f11547a;
        zzaucVar = zzuVar.f11563h;
        if (zzaucVar != null) {
            zzaucVar2 = zzuVar.f11563h;
            zzaucVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
