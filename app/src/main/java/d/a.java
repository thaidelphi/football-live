package d;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.n;
/* compiled from: ActivityResultContract.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0258a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f23869a;

        public C0258a(T t10) {
            this.f23869a = t10;
        }

        public final T a() {
            return this.f23869a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0258a<O> b(Context context, I i10) {
        n.f(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
