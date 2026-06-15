package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class vc extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, po> f21132a;

    public vc(Looper looper) {
        super(looper);
        this.f21132a = new ConcurrentHashMap<>();
    }

    private boolean a(int i10) {
        return i10 == 1016 || i10 == 1015;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, po poVar) {
        if (str == null || poVar == null) {
            return;
        }
        this.f21132a.put(str, poVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            nh nhVar = (nh) message.obj;
            String path = nhVar.getPath();
            po poVar = this.f21132a.get(path);
            if (poVar == null) {
                return;
            }
            if (a(message.what)) {
                poVar.a(nhVar);
            } else {
                int i10 = message.what;
                poVar.a(nhVar, new fh(i10, jv.a(i10)));
            }
            this.f21132a.remove(path);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
