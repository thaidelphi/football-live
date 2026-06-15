package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* compiled from: CallableReference.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class d implements z8.b, Serializable {
    public static final Object NO_RECEIVER = a.f27369a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient z8.b reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private static final a f27369a = new a();

        private a() {
        }
    }

    public d() {
        this(NO_RECEIVER);
    }

    @Override // z8.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // z8.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public z8.b compute() {
        z8.b bVar = this.reflected;
        if (bVar == null) {
            z8.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    protected abstract z8.b computeReflected();

    @Override // z8.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public z8.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? b0.c(cls) : b0.b(cls);
    }

    @Override // z8.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z8.b getReflected() {
        z8.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new s8.b();
    }

    @Override // z8.b
    public z8.j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // z8.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // z8.b
    public z8.k getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // z8.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // z8.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // z8.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // z8.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
