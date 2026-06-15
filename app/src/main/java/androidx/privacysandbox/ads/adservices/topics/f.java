package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.n;
/* compiled from: TopicsManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3727a = new a(null);

    /* compiled from: TopicsManager.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final f a(Context context) {
            n.f(context, "context");
            m0.a aVar = m0.a.f27617a;
            if (aVar.a() >= 5) {
                return new h(context);
            }
            if (aVar.a() == 4) {
                return new g(context);
            }
            return null;
        }
    }

    public abstract Object a(b bVar, m8.d<? super c> dVar);
}
