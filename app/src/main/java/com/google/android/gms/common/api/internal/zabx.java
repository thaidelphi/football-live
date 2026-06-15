package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f12341a;

    /* renamed from: b  reason: collision with root package name */
    private final zabw f12342b;

    public zabx(zabw zabwVar) {
        this.f12342b = zabwVar;
    }

    public final void a(Context context) {
        this.f12341a = context;
    }

    public final synchronized void b() {
        Context context = this.f12341a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f12341a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f12342b.a();
            b();
        }
    }
}
