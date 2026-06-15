package z4;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: DataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface l extends i {

    /* compiled from: DataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        l a();
    }

    void close() throws IOException;

    Map<String, List<String>> d();

    void i(s0 s0Var);

    long l(p pVar) throws IOException;

    Uri m();
}
