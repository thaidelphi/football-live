package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b implements Runnable {
    protected final a callback;
    protected final Context context;
    protected final Bundle extras;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(boolean z10);
    }

    public b(Context context, a aVar, Bundle bundle) {
        this.context = context;
        this.callback = aVar;
        this.extras = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.callback.a(runSync());
    }

    public boolean runSync() {
        return false;
    }
}
