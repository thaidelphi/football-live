package com.startapp;

import android.hardware.SensorEvent;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k5 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingDeque f22172a;

    /* renamed from: b  reason: collision with root package name */
    public final i9 f22173b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicLong f22174c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f22175d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicLong f22176e;

    public k5(String str, MotionMetadata motionMetadata, int i10, double d10, long j10) {
        super(str);
        this.f22174c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f22175d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f22176e = new AtomicLong(0L);
        i9 i9Var = new i9(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f22173b = i9Var;
        i9Var.a(d10, j10);
        this.f22172a = new LinkedBlockingDeque(i10);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f22172a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f22172a.take();
                if (sensorEvent == null) {
                    return;
                }
                i9 i9Var = this.f22173b;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                i9Var.a(currentTimeMillis, j10, fArr[0], fArr[1], fArr[2]);
                this.f22174c.set(Double.doubleToRawLongBits(this.f22173b.f22109k.f23459i));
                this.f22175d.set(Double.doubleToRawLongBits(this.f22173b.f22109k.f23457g));
                this.f22176e.set(this.f22173b.f22109k.f23458h);
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                l3.a(th);
                return;
            }
        }
    }
}
