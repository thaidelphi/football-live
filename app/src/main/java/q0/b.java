package q0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.m;
import androidx.privacysandbox.ads.adservices.topics.i;
import d9.o;
import i8.w;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: MeasurementManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0342b f30030a = new C0342b(null);

    /* compiled from: MeasurementManager.kt */
    /* renamed from: q0.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0342b {
        private C0342b() {
        }

        public /* synthetic */ C0342b(h hVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final b a(Context context) {
            n.f(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            m0.a aVar = m0.a.f27617a;
            sb.append(aVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (aVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(q0.a aVar, m8.d<? super w> dVar);

    public abstract Object b(m8.d<? super Integer> dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, m8.d<? super w> dVar);

    public abstract Object d(Uri uri, m8.d<? super w> dVar);

    public abstract Object e(c cVar, m8.d<? super w> dVar);

    public abstract Object f(d dVar, m8.d<? super w> dVar2);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeasurementManager.kt */
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private final MeasurementManager f30031b;

        public a(MeasurementManager mMeasurementManager) {
            n.f(mMeasurementManager, "mMeasurementManager");
            this.f30031b = mMeasurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(q0.a aVar) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(c cVar) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(d dVar) {
            throw null;
        }

        @Override // q0.b
        public Object a(q0.a aVar, m8.d<? super w> dVar) {
            m8.d b10;
            Object c10;
            Object c11;
            b10 = n8.c.b(dVar);
            o oVar = new o(b10, 1);
            oVar.C();
            this.f30031b.deleteRegistrations(k(aVar), i.f3728a, m.a(oVar));
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : w.f26638a;
        }

        @Override // q0.b
        public Object b(m8.d<? super Integer> dVar) {
            m8.d b10;
            Object c10;
            b10 = n8.c.b(dVar);
            o oVar = new o(b10, 1);
            oVar.C();
            this.f30031b.getMeasurementApiStatus(i.f3728a, m.a(oVar));
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z10;
        }

        @Override // q0.b
        public Object c(Uri uri, InputEvent inputEvent, m8.d<? super w> dVar) {
            m8.d b10;
            Object c10;
            Object c11;
            b10 = n8.c.b(dVar);
            o oVar = new o(b10, 1);
            oVar.C();
            this.f30031b.registerSource(uri, inputEvent, i.f3728a, m.a(oVar));
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : w.f26638a;
        }

        @Override // q0.b
        public Object d(Uri uri, m8.d<? super w> dVar) {
            m8.d b10;
            Object c10;
            Object c11;
            b10 = n8.c.b(dVar);
            o oVar = new o(b10, 1);
            oVar.C();
            this.f30031b.registerTrigger(uri, i.f3728a, m.a(oVar));
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : w.f26638a;
        }

        @Override // q0.b
        public Object e(c cVar, m8.d<? super w> dVar) {
            m8.d b10;
            Object c10;
            Object c11;
            b10 = n8.c.b(dVar);
            o oVar = new o(b10, 1);
            oVar.C();
            this.f30031b.registerWebSource(l(cVar), i.f3728a, m.a(oVar));
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : w.f26638a;
        }

        @Override // q0.b
        public Object f(d dVar, m8.d<? super w> dVar2) {
            m8.d b10;
            Object c10;
            Object c11;
            b10 = n8.c.b(dVar2);
            o oVar = new o(b10, 1);
            oVar.C();
            this.f30031b.registerWebTrigger(m(dVar), i.f3728a, m.a(oVar));
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar2);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : w.f26638a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.n.f(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.n.e(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.b.a.<init>(android.content.Context):void");
        }
    }
}
