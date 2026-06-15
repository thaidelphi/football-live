package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzq extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzs f11512a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzq(zzs zzsVar, zzr zzrVar) {
        this.f11512a = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            zzs.h(this.f11512a, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzs.h(this.f11512a, false);
        }
    }
}
