package z4;

import java.io.IOException;
/* compiled from: DataSourceUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o {
    public static void a(l lVar) {
        if (lVar != null) {
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
