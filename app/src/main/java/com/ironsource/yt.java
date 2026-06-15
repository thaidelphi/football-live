package com.ironsource;

import android.os.Handler;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yt {

    /* renamed from: a  reason: collision with root package name */
    private final c f21585a;

    /* renamed from: b  reason: collision with root package name */
    private final d f21586b;

    /* renamed from: c  reason: collision with root package name */
    private final b f21587c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: com.ironsource.yt$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        static final class C0242a extends kotlin.jvm.internal.o implements t8.a<hu> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TestSuiteActivity f21588a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Handler f21589b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0242a(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.f21588a = testSuiteActivity;
                this.f21589b = handler;
            }

            @Override // t8.a
            /* renamed from: a */
            public final hu invoke() {
                return new hu(this.f21588a, this.f21589b);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        static final class b extends kotlin.jvm.internal.o implements t8.a<ou> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TestSuiteActivity f21590a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Handler f21591b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TestSuiteActivity testSuiteActivity, Handler handler) {
                super(0);
                this.f21590a = testSuiteActivity;
                this.f21591b = handler;
            }

            @Override // t8.a
            /* renamed from: a */
            public final ou invoke() {
                return new ou(this.f21590a, this.f21591b);
            }
        }

        private static final hu a(i8.g<hu> gVar) {
            return gVar.getValue();
        }

        private static final ou b(i8.g<ou> gVar) {
            return gVar.getValue();
        }

        public final yt a(List<? extends IronSource.AD_UNIT> maduEnabledAdUnits, TestSuiteActivity activity, Handler handler) {
            i8.g b10;
            i8.g b11;
            kotlin.jvm.internal.n.f(maduEnabledAdUnits, "maduEnabledAdUnits");
            kotlin.jvm.internal.n.f(activity, "activity");
            kotlin.jvm.internal.n.f(handler, "handler");
            b10 = i8.i.b(new C0242a(activity, handler));
            b11 = i8.i.b(new b(activity, handler));
            return new yt(maduEnabledAdUnits.contains(IronSource.AD_UNIT.INTERSTITIAL) ? a(b10) : b(b11), maduEnabledAdUnits.contains(IronSource.AD_UNIT.REWARDED_VIDEO) ? a(b10) : b(b11), maduEnabledAdUnits.contains(IronSource.AD_UNIT.BANNER) ? a(b10) : b(b11), null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        void a(double d10);

        void a(eu euVar, String str, int i10, int i11);

        void b();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface c {
        void a(eu euVar);

        void c();

        boolean e();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface d {
        boolean a();

        void b(eu euVar);

        void d();
    }

    private yt(c cVar, d dVar, b bVar) {
        this.f21585a = cVar;
        this.f21586b = dVar;
        this.f21587c = bVar;
    }

    public /* synthetic */ yt(c cVar, d dVar, b bVar, kotlin.jvm.internal.h hVar) {
        this(cVar, dVar, bVar);
    }

    public final b a() {
        return this.f21587c;
    }

    public final c b() {
        return this.f21585a;
    }

    public final d c() {
        return this.f21586b;
    }
}
