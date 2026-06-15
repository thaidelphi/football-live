package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import d9.i;
import d9.j0;
import g9.l0;
import g9.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: DiagnosticEventObserver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final j0 defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final w<Boolean> isRunning;
    private final UniversalRequestDataSource universalRequestDataSource;

    public DiagnosticEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, j0 defaultDispatcher, DiagnosticEventRepository diagnosticEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(diagnosticEventRepository, "diagnosticEventRepository");
        n.f(universalRequestDataSource, "universalRequestDataSource");
        n.f(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.defaultDispatcher = defaultDispatcher;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = l0.a(Boolean.FALSE);
    }

    public final Object invoke(d<? super i8.w> dVar) {
        Object c10;
        Object g10 = i.g(this.defaultDispatcher, new DiagnosticEventObserver$invoke$2(this, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : i8.w.f26638a;
    }
}
