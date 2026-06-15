package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzc {

    /* renamed from: a  reason: collision with root package name */
    private Object f12609a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12610b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f12611c;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f12611c = baseGmsClient;
        this.f12609a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f12609a;
            if (this.f12610b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e8) {
                throw e8;
            }
        }
        synchronized (this) {
            this.f12610b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f12609a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f12611c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f12611c.zzt;
            arrayList2.remove(this);
        }
    }
}
