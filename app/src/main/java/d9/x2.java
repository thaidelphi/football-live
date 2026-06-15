package d9;

import java.util.concurrent.CancellationException;
/* compiled from: Timeout.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class x2 extends CancellationException implements h0<x2> {

    /* renamed from: a  reason: collision with root package name */
    public final transient z1 f24530a;

    public x2(String str, z1 z1Var) {
        super(str);
        this.f24530a = z1Var;
    }

    @Override // d9.h0
    /* renamed from: b */
    public x2 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        x2 x2Var = new x2(message, this.f24530a);
        x2Var.initCause(this);
        return x2Var;
    }

    public x2(String str) {
        this(str, null);
    }
}
