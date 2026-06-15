package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f12245a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12246b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzb f12247c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f12247c = zzbVar;
        this.f12245a = lifecycleCallback;
        this.f12246b = str;
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
        zzb zzbVar = this.f12247c;
        i10 = zzbVar.f12398b;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f12245a;
            bundle = zzbVar.f12399c;
            if (bundle != null) {
                String str = this.f12246b;
                bundle3 = zzbVar.f12399c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f12247c.f12398b;
        if (i11 >= 2) {
            this.f12245a.onStart();
        }
        i12 = this.f12247c.f12398b;
        if (i12 >= 3) {
            this.f12245a.onResume();
        }
        i13 = this.f12247c.f12398b;
        if (i13 >= 4) {
            this.f12245a.onStop();
        }
        i14 = this.f12247c.f12398b;
        if (i14 >= 5) {
            this.f12245a.onDestroy();
        }
    }
}
