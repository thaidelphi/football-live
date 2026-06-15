package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2433a = (IconCompat) aVar.v(remoteActionCompat.f2433a, 1);
        remoteActionCompat.f2434b = aVar.l(remoteActionCompat.f2434b, 2);
        remoteActionCompat.f2435c = aVar.l(remoteActionCompat.f2435c, 3);
        remoteActionCompat.f2436d = (PendingIntent) aVar.r(remoteActionCompat.f2436d, 4);
        remoteActionCompat.f2437e = aVar.h(remoteActionCompat.f2437e, 5);
        remoteActionCompat.f2438f = aVar.h(remoteActionCompat.f2438f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f2433a, 1);
        aVar.D(remoteActionCompat.f2434b, 2);
        aVar.D(remoteActionCompat.f2435c, 3);
        aVar.H(remoteActionCompat.f2436d, 4);
        aVar.z(remoteActionCompat.f2437e, 5);
        aVar.z(remoteActionCompat.f2438f, 6);
    }
}
