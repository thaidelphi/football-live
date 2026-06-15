package v0;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* compiled from: SupportSQLiteDatabase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface g extends Closeable {
    boolean A0();

    void D();

    String M();

    Cursor W(j jVar, CancellationSignal cancellationSignal);

    k f0(String str);

    void g();

    boolean isOpen();

    List<Pair<String, String>> l();

    void m(String str) throws SQLException;

    Cursor q(j jVar);

    Cursor r0(String str);

    void v();

    void x(String str, Object[] objArr) throws SQLException;

    boolean x0();

    void y();
}
