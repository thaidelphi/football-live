package b3;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransportRuntimeComponent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class u implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface a {
        a a(Context context);

        u build();
    }

    abstract j3.d a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
