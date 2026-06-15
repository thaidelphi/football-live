package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f12557a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k(l lVar, zzq zzqVar) {
        this.f12557a = lVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f12557a.f12558f;
            synchronized (hashMap) {
                zzo zzoVar = (zzo) message.obj;
                hashMap2 = this.f12557a.f12558f;
                j jVar = (j) hashMap2.get(zzoVar);
                if (jVar != null && jVar.i()) {
                    if (jVar.j()) {
                        jVar.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f12557a.f12558f;
                    hashMap3.remove(zzoVar);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            hashMap4 = this.f12557a.f12558f;
            synchronized (hashMap4) {
                zzo zzoVar2 = (zzo) message.obj;
                hashMap5 = this.f12557a.f12558f;
                j jVar2 = (j) hashMap5.get(zzoVar2);
                if (jVar2 != null && jVar2.a() == 3) {
                    String valueOf = String.valueOf(zzoVar2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b10 = jVar2.b();
                    if (b10 == null) {
                        b10 = zzoVar2.a();
                    }
                    if (b10 == null) {
                        String c10 = zzoVar2.c();
                        Preconditions.m(c10);
                        b10 = new ComponentName(c10, "unknown");
                    }
                    jVar2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
