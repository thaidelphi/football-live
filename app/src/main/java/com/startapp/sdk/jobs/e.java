package com.startapp.sdk.jobs;

import android.content.Context;
import com.startapp.sdk.jobs.b;
import com.startapp.t7;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements t7 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f23348a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f23349b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f23350c = Executors.newScheduledThreadPool(1, com.startapp.sdk.components.a.a());

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends com.startapp.sdk.jobs.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobRequest f23351a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f23352b;

        public a(JobRequest jobRequest, long j10) {
            this.f23351a = jobRequest;
            this.f23352b = j10;
        }

        @Override // com.startapp.sdk.jobs.a
        public final void a(com.startapp.sdk.jobs.b bVar) {
            e eVar = e.this;
            int a10 = JobRequest.a(this.f23351a.f23328a);
            long j10 = this.f23352b;
            synchronized (eVar) {
                eVar.f23349b.put(Integer.valueOf(a10), eVar.f23350c.scheduleAtFixedRate(bVar, j10, j10, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements b.a {
        @Override // com.startapp.sdk.jobs.b.a
        public final void a(boolean z10) {
        }
    }

    public e(Context context) {
        this.f23348a = new WeakReference<>(context);
    }

    @Override // com.startapp.t7
    public final boolean a(JobRequest jobRequest, long j10) {
        Context context = this.f23348a.get();
        if (context == null) {
            return false;
        }
        return new a(jobRequest, j10).a(context, jobRequest.f23328a, new b(), null);
    }

    @Override // com.startapp.t7
    public final synchronized boolean a(int i10) {
        Future future = (Future) this.f23349b.get(Integer.valueOf(i10));
        if (future != null) {
            this.f23349b.remove(Integer.valueOf(i10));
            return future.cancel(true);
        }
        return false;
    }
}
