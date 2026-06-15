package r8;

import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileTreeWalk.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class l extends k {
    public static final g i(File file, h direction) {
        kotlin.jvm.internal.n.f(file, "<this>");
        kotlin.jvm.internal.n.f(direction, "direction");
        return new g(file, direction);
    }

    public static /* synthetic */ g j(File file, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = h.TOP_DOWN;
        }
        return i(file, hVar);
    }
}
