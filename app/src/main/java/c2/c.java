package c2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements w1.d<ByteBuffer> {
    @Override // w1.d
    /* renamed from: c */
    public boolean b(ByteBuffer byteBuffer, File file, w1.h hVar) {
        try {
            s2.a.e(byteBuffer, file);
            return true;
        } catch (IOException e8) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e8);
            }
            return false;
        }
    }
}
