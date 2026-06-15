package com.startapp.sdk.components;

import com.startapp.j2;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n implements j2<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f23308a;

    public n(ThreadPoolExecutor threadPoolExecutor) {
        this.f23308a = threadPoolExecutor;
    }

    @Override // com.startapp.j2
    public final Integer call() {
        return Integer.valueOf(this.f23308a.getMaximumPoolSize() - this.f23308a.getActiveCount());
    }
}
