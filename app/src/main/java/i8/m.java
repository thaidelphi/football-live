package i8;
/* compiled from: Standard.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class m extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String message) {
        super(message);
        kotlin.jvm.internal.n.f(message, "message");
    }

    public /* synthetic */ m(String str, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
