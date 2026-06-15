package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u0 implements v0.h, o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4293a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4294b;

    /* renamed from: c  reason: collision with root package name */
    private final File f4295c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable<InputStream> f4296d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4297e;

    /* renamed from: f  reason: collision with root package name */
    private final v0.h f4298f;

    /* renamed from: g  reason: collision with root package name */
    private n f4299g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4300h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(Context context, String str, File file, Callable<InputStream> callable, int i10, v0.h hVar) {
        this.f4293a = context;
        this.f4294b = str;
        this.f4295c = file;
        this.f4296d = callable;
        this.f4297e = i10;
        this.f4298f = hVar;
    }

    private void a(File file, boolean z10) throws IOException {
        ReadableByteChannel newChannel;
        if (this.f4294b != null) {
            newChannel = Channels.newChannel(this.f4293a.getAssets().open(this.f4294b));
        } else if (this.f4295c != null) {
            newChannel = new FileInputStream(this.f4295c).getChannel();
        } else {
            Callable<InputStream> callable = this.f4296d;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                } catch (Exception e8) {
                    throw new IOException("inputStreamCallable exception on call", e8);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4293a.getCacheDir());
        createTempFile.deleteOnExit();
        t0.d.a(newChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        b(createTempFile, z10);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void b(File file, boolean z10) {
        n nVar = this.f4299g;
        if (nVar != null) {
            q0.e eVar = nVar.f4221f;
        }
    }

    private void j(boolean z10) {
        String databaseName = getDatabaseName();
        File databasePath = this.f4293a.getDatabasePath(databaseName);
        n nVar = this.f4299g;
        t0.a aVar = new t0.a(databaseName, this.f4293a.getFilesDir(), nVar == null || nVar.f4228m);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath, z10);
                    aVar.c();
                    return;
                } catch (IOException e8) {
                    throw new RuntimeException("Unable to copy database file.", e8);
                }
            } else if (this.f4299g == null) {
                aVar.c();
                return;
            } else {
                try {
                    int c10 = t0.c.c(databasePath);
                    int i10 = this.f4297e;
                    if (c10 == i10) {
                        aVar.c();
                        return;
                    } else if (this.f4299g.a(c10, i10)) {
                        aVar.c();
                        return;
                    } else {
                        if (this.f4293a.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath, z10);
                            } catch (IOException e10) {
                                Log.w("ROOM", "Unable to copy database file.", e10);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.c();
                        return;
                    }
                } catch (IOException e11) {
                    Log.w("ROOM", "Unable to read database version.", e11);
                    aVar.c();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
        aVar.c();
        throw th;
    }

    @Override // v0.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f4298f.close();
        this.f4300h = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(n nVar) {
        this.f4299g = nVar;
    }

    @Override // v0.h
    public String getDatabaseName() {
        return this.f4298f.getDatabaseName();
    }

    @Override // androidx.room.o
    public v0.h getDelegate() {
        return this.f4298f;
    }

    @Override // v0.h
    public synchronized v0.g q0() {
        if (!this.f4300h) {
            j(true);
            this.f4300h = true;
        }
        return this.f4298f.q0();
    }

    @Override // v0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f4298f.setWriteAheadLoggingEnabled(z10);
    }
}
