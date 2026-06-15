package kotlin.jvm.internal;
/* compiled from: FunctionReference.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class k extends d implements j, z8.e {
    private final int arity;
    private final int flags;

    public k(int i10) {
        this(i10, d.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.d
    protected z8.b computeReflected() {
        return b0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return getName().equals(kVar.getName()) && getSignature().equals(kVar.getSignature()) && this.flags == kVar.flags && this.arity == kVar.arity && n.a(getBoundReceiver(), kVar.getBoundReceiver()) && n.a(getOwner(), kVar.getOwner());
        } else if (obj instanceof z8.e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // z8.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // z8.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // z8.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // z8.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.d, z8.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        z8.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public k(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.d
    public z8.e getReflected() {
        return (z8.e) super.getReflected();
    }

    public k(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
