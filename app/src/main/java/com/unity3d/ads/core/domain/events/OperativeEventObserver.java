package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import d9.i;
import d9.j0;
import g9.l0;
import g9.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: OperativeEventObserver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final j0 defaultDispatcher;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final w<Boolean> isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final UniversalRequestDataSource universalRequestDataSource;

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, j0 defaultDispatcher, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(operativeEventRepository, "operativeEventRepository");
        n.f(universalRequestDataSource, "universalRequestDataSource");
        n.f(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = defaultDispatcher;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = l0.a(Boolean.FALSE);
    }

    public final Object invoke(d<? super i8.w> dVar) {
        Object c10;
        Object g10 = i.g(this.defaultDispatcher, new OperativeEventObserver$invoke$2(this, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : i8.w.f26638a;
    }
}
