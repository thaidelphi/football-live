package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzch extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzci f11468a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzch(zzci zzciVar) {
        this.f11468a = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f11468a.b(context, intent);
    }
}
