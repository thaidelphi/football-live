package com.startapp;

import android.os.SystemClock;
import android.widget.TextView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.fullpagemodes.b f22347a;

    public o5(com.startapp.sdk.ads.fullpagemodes.b bVar) {
        this.f22347a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = (this.f22347a.f22605a.f22219t * 1000) - SystemClock.uptimeMillis();
        com.startapp.sdk.ads.fullpagemodes.b bVar = this.f22347a;
        long j10 = uptimeMillis + bVar.f22605a.A;
        TextView textView = bVar.f22611g;
        if (textView != null) {
            long j11 = j10 / 1000;
            if (j11 > 0 && j10 % 1000 < 100) {
                j11--;
            }
            textView.setText(String.valueOf(j11));
        }
        if (j10 >= 1000) {
            long j12 = j10 % 1000;
            this.f22347a.f22615k.postDelayed(this, j12 != 0 ? j12 : 1000L);
            return;
        }
        com.startapp.sdk.ads.fullpagemodes.b bVar2 = this.f22347a;
        if (bVar2.f22611g != null) {
            bVar2.f22612h.setVisibility(8);
            this.f22347a.f22611g.setVisibility(8);
        }
        this.f22347a.f22605a.s();
    }
}
