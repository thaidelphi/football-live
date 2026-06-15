package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s implements n0 {

    /* renamed from: b  reason: collision with root package name */
    private static final x f15510b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final x f15511a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements x {
        a() {
        }

        @Override // com.google.protobuf.x
        public w a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.x
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b implements x {

        /* renamed from: a  reason: collision with root package name */
        private x[] f15512a;

        b(x... xVarArr) {
            this.f15512a = xVarArr;
        }

        @Override // com.google.protobuf.x
        public w a(Class<?> cls) {
            x[] xVarArr;
            for (x xVar : this.f15512a) {
                if (xVar.b(cls)) {
                    return xVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.x
        public boolean b(Class<?> cls) {
            for (x xVar : this.f15512a) {
                if (xVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public s() {
        this(b());
    }

    private static x b() {
        return new b(n.c(), c());
    }

    private static x c() {
        try {
            return (x) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f15510b;
        }
    }

    private static boolean d(w wVar) {
        return wVar.getSyntax() == ProtoSyntax.PROTO2;
    }

    private static <T> m0<T> e(Class<T> cls, w wVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (d(wVar)) {
                return z.V(cls, wVar, d0.b(), q.b(), o0.M(), l.b(), v.b());
            }
            return z.V(cls, wVar, d0.b(), q.b(), o0.M(), null, v.b());
        } else if (d(wVar)) {
            return z.V(cls, wVar, d0.a(), q.a(), o0.H(), l.a(), v.a());
        } else {
            return z.V(cls, wVar, d0.a(), q.a(), o0.I(), null, v.a());
        }
    }

    @Override // com.google.protobuf.n0
    public <T> m0<T> a(Class<T> cls) {
        o0.J(cls);
        w a10 = this.f15511a.a(cls);
        if (a10.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                return a0.m(o0.M(), l.b(), a10.b());
            }
            return a0.m(o0.H(), l.a(), a10.b());
        }
        return e(cls, a10);
    }

    private s(x xVar) {
        this.f15511a = (x) Internal.checkNotNull(xVar, "messageInfoFactory");
    }
}
