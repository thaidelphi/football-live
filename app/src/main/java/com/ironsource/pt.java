package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class pt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f19787a;

    /* renamed from: b  reason: collision with root package name */
    private final db f19788b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pt(db dbVar, Handler handler) {
        this.f19788b = dbVar;
        this.f19787a = handler;
    }

    Message a() {
        return new Message();
    }

    yc a(db dbVar, String str, long j10) {
        return new yc(dbVar, str, j10);
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        int b10;
        nh nhVar = new nh(this.f19788b.b().getParent(), this.f19788b.b().getName());
        Message a10 = a();
        a10.obj = nhVar;
        String a11 = a(nhVar.getParent());
        if (a11 == null) {
            b10 = 1020;
        } else {
            eb call = a(new db(nhVar, this.f19788b.e(), this.f19788b.a(), this.f19788b.c(), this.f19788b.f(), this.f19788b.d()), a11, 3L).call();
            b10 = call.b() == 200 ? d9.f16968l : call.b();
        }
        a10.what = b10;
        this.f19787a.sendMessage(a10);
    }
}
