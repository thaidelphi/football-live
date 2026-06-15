package n4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import y5.q;
/* compiled from: CueDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {
    public q<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return a5.c.b(b.f28596s, (ArrayList) a5.a.e(readBundle.getParcelableArrayList("c")));
    }
}
