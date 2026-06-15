package r8;

import java.io.File;
/* compiled from: Exceptions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o extends f {
    public /* synthetic */ o(File file, File file2, String str, int i10, kotlin.jvm.internal.h hVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(File file, File file2, String str) {
        super(file, file2, str);
        kotlin.jvm.internal.n.f(file, "file");
    }
}
