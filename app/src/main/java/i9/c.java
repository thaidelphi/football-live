package i9;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: ExceptionsConstructor.kt */
@IgnoreJRERequirement
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class c extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final c f26646a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final a f26647b = new a();

    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends ClassValue<t8.l<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public t8.l<Throwable, Throwable> computeValue(Class<?> cls) {
            t8.l<Throwable, Throwable> b10;
            kotlin.jvm.internal.n.d(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            b10 = n.b(cls);
            return b10;
        }
    }

    private c() {
    }

    @Override // i9.i
    public t8.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        return (t8.l) f26647b.get(cls);
    }
}
