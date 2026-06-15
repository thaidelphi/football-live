package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f12249a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12250b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzd f12251c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f12251c = zzdVar;
        this.f12249a = lifecycleCallback;
        this.f12250b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.f12251c;
        i10 = zzdVar.f12402c0;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f12249a;
            bundle = zzdVar.f12403d0;
            if (bundle != null) {
                String str = this.f12250b;
                bundle3 = zzdVar.f12403d0;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f12251c.f12402c0;
        if (i11 >= 2) {
            this.f12249a.onStart();
        }
        i12 = this.f12251c.f12402c0;
        if (i12 >= 3) {
            this.f12249a.onResume();
        }
        i13 = this.f12251c.f12402c0;
        if (i13 >= 4) {
            this.f12249a.onStop();
        }
        i14 = this.f12251c.f12402c0;
        if (i14 >= 5) {
            this.f12249a.onDestroy();
        }
    }
}
