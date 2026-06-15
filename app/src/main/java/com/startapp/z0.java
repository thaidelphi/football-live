package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f23650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23651b = ".png";

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bitmap f23652c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f23653d;

    public z0(Context context, Bitmap bitmap, String str) {
        this.f23650a = str;
        this.f23652c = bitmap;
        this.f23653d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        FileOutputStream fileOutputStream;
        ConcurrentHashMap concurrentHashMap = a1.f21748a;
        concurrentHashMap.put(this.f23650a + this.f23651b, this.f23652c);
        try {
            fileOutputStream = new FileOutputStream(this.f23653d.getFilesDir().getPath() + "/" + this.f23650a + this.f23651b);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            this.f23652c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            try {
                l3.a(th);
            } finally {
                o9.a(fileOutputStream);
            }
        }
    }
}
