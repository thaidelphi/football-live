package w8;

import java.util.Random;
import kotlin.jvm.internal.n;
/* compiled from: PlatformRandom.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b extends w8.a {

    /* renamed from: c  reason: collision with root package name */
    private final a f32383c = new a();

    /* compiled from: PlatformRandom.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // w8.a
    public Random f() {
        Random random = this.f32383c.get();
        n.e(random, "implStorage.get()");
        return random;
    }
}
