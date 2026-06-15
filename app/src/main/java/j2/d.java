package j2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import w1.k;
import y1.v;
/* compiled from: GifDrawableEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements k<c> {
    @Override // w1.k
    public w1.c a(w1.h hVar) {
        return w1.c.SOURCE;
    }

    @Override // w1.d
    /* renamed from: c */
    public boolean b(v<c> vVar, File file, w1.h hVar) {
        try {
            s2.a.e(vVar.get().c(), file);
            return true;
        } catch (IOException e8) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e8);
            }
            return false;
        }
    }
}
