package kotlin.jvm.internal;
/* compiled from: PropertyReference.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class v extends d implements z8.h {
    private final boolean syntheticJavaProperty;

    public v() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.d
    public z8.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return getOwner().equals(vVar.getOwner()) && getName().equals(vVar.getName()) && getSignature().equals(vVar.getSignature()) && n.a(getBoundReceiver(), vVar.getBoundReceiver());
        } else if (obj instanceof z8.h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // z8.h
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // z8.h
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        z8.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.d
    public z8.h getReflected() {
        if (!this.syntheticJavaProperty) {
            return (z8.h) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public v(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public v(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }
}
