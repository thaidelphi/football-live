package h3;

import android.content.Context;
import android.os.Build;
import i3.y;
/* compiled from: SchedulingModule.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static y a(Context context, j3.d dVar, i3.g gVar, l3.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new i3.e(context, dVar, gVar);
        }
        return new i3.a(context, dVar, aVar, gVar);
    }
}
