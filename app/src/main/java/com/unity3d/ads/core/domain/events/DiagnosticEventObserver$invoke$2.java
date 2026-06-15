package com.unity3d.ads.core.domain.events;

import androidx.work.c;
import androidx.work.q;
import androidx.work.r;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import d9.j0;
import d9.o0;
import d9.p0;
import g9.e;
import g9.g;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import i8.w;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DiagnosticEventObserver.kt */
@f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class DiagnosticEventObserver$invoke$2 extends l implements p<o0, d<? super w>, Object> {
    int label;
    final /* synthetic */ DiagnosticEventObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiagnosticEventObserver.kt */
    @f(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {42, 45}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass2 extends l implements p<List<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent>, d<? super w>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DiagnosticEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DiagnosticEventObserver diagnosticEventObserver, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = diagnosticEventObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(List<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent> list, d<? super w> dVar) {
            return invoke2((List<DiagnosticEventRequestOuterClass.DiagnosticEvent>) list, dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, d<? super w> dVar) {
            return ((AnonymousClass2) create(list, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;
            GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
            UniversalRequestDataSource universalRequestDataSource;
            String str;
            BackgroundWorker backgroundWorker;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                DiagnosticEventObserver diagnosticEventObserver = this.this$0;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                n.e(newBuilder, "newBuilder()");
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                getDiagnosticEventBatchRequest = diagnosticEventObserver.getDiagnosticEventBatchRequest;
                _create.setDiagnosticEventRequest(getDiagnosticEventBatchRequest.invoke((List) this.L$0));
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    str = (String) this.L$0;
                    i8.p.b(obj);
                    UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                    backgroundWorker = this.this$0.backgroundWorker;
                    c a10 = new c.a().b(q.CONNECTED).a();
                    n.e(a10, "Builder()\n            .s…TED)\n            .build()");
                    r b10 = new r.a(DiagnosticEventJob.class).e(a10).g(universalRequestWorkerData.invoke()).b();
                    n.e(b10, "OneTimeWorkRequestBuilde…a())\n            .build()");
                    backgroundWorker.getWorkManager().e(b10);
                    return w.f26638a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            String uuid = UUID.randomUUID().toString();
            n.e(uuid, "randomUUID().toString()");
            universalRequestDataSource = this.this$0.universalRequestDataSource;
            byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
            n.e(byteArray, "fullRequest.toByteArray()");
            ByteString byteString = ByteStringsKt.toByteString(byteArray);
            this.L$0 = uuid;
            this.label = 2;
            if (universalRequestDataSource.set(uuid, byteString, this) == c10) {
                return c10;
            }
            str = uuid;
            UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
            backgroundWorker = this.this$0.backgroundWorker;
            c a102 = new c.a().b(q.CONNECTED).a();
            n.e(a102, "Builder()\n            .s…TED)\n            .build()");
            r b102 = new r.a(DiagnosticEventJob.class).e(a102).g(universalRequestWorkerData2.invoke()).b();
            n.e(b102, "OneTimeWorkRequestBuilde…a())\n            .build()");
            backgroundWorker.getWorkManager().e(b102);
            return w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventObserver$invoke$2(DiagnosticEventObserver diagnosticEventObserver, d<? super DiagnosticEventObserver$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = diagnosticEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new DiagnosticEventObserver$invoke$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((DiagnosticEventObserver$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        g9.w wVar;
        Object value;
        Boolean bool;
        DiagnosticEventRepository diagnosticEventRepository;
        j0 j0Var;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            wVar = this.this$0.isRunning;
            do {
                value = wVar.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!wVar.i(value, b.a(true)));
            if (bool.booleanValue()) {
                return w.f26638a;
            }
            diagnosticEventRepository = this.this$0.diagnosticEventRepository;
            e z10 = g.z(diagnosticEventRepository.getDiagnosticEvents(), new AnonymousClass2(this.this$0, null));
            j0Var = this.this$0.defaultDispatcher;
            g.w(z10, p0.a(j0Var));
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
