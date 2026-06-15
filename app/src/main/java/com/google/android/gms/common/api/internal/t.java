package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.BackgroundDetector;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class t implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GoogleApiManager f12248a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(GoogleApiManager googleApiManager) {
        this.f12248a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z10) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.f12248a;
        handler = googleApiManager.f12127p;
        handler2 = googleApiManager.f12127p;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
