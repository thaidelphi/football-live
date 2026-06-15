package p0;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.c;
import androidx.privacysandbox.ads.adservices.topics.f;
import d9.f1;
import d9.i;
import d9.o0;
import d9.p0;
import i8.w;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: TopicsManagerFutures.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f29510a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TopicsManagerFutures.kt */
    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0330a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final f f29511b;

        /* compiled from: TopicsManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: p0.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class C0331a extends l implements p<o0, d<? super c>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f29512a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.b f29514c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0331a(androidx.privacysandbox.ads.adservices.topics.b bVar, d<? super C0331a> dVar) {
                super(2, dVar);
                this.f29514c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<w> create(Object obj, d<?> dVar) {
                return new C0331a(this.f29514c, dVar);
            }

            @Override // t8.p
            public final Object invoke(o0 o0Var, d<? super c> dVar) {
                return ((C0331a) create(o0Var, dVar)).invokeSuspend(w.f26638a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = n8.d.c();
                int i10 = this.f29512a;
                if (i10 == 0) {
                    i8.p.b(obj);
                    f fVar = C0330a.this.f29511b;
                    androidx.privacysandbox.ads.adservices.topics.b bVar = this.f29514c;
                    this.f29512a = 1;
                    obj = fVar.a(bVar, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i8.p.b(obj);
                }
                return obj;
            }
        }

        public C0330a(f mTopicsManager) {
            n.f(mTopicsManager, "mTopicsManager");
            this.f29511b = mTopicsManager;
        }

        @Override // p0.a
        public b6.a<c> b(androidx.privacysandbox.ads.adservices.topics.b request) {
            n.f(request, "request");
            return n0.b.c(i.b(p0.a(f1.c()), null, null, new C0331a(request, null), 3, null), null, 1, null);
        }
    }

    /* compiled from: TopicsManagerFutures.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final a a(Context context) {
            n.f(context, "context");
            f a10 = f.f3727a.a(context);
            if (a10 != null) {
                return new C0330a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f29510a.a(context);
    }

    public abstract b6.a<c> b(androidx.privacysandbox.ads.adservices.topics.b bVar);
}
